package com.codegym.controller;

import com.codegym.dao.CategoryDao;
import com.codegym.dao.ProductDao;
import com.codegym.dao.promotion.PromotionDao;
import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.model.Promotion;
import com.codegym.service.CategoryService;
import com.codegym.service.ICategoryService;
import com.codegym.service.IPromotionService;
import com.codegym.service.PromotionService;
import com.codegym.service.product.IProductService;
import com.codegym.service.product.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService productService;
    private ICategoryService categoryService;
    private IPromotionService promotionService;

    public ProductServlet() {
        this.productService = new ProductService(new ProductDao());
        this.categoryService = new CategoryService(new CategoryDao());
        this.promotionService = new PromotionService(new PromotionDao());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete": {
                int id = Integer.parseInt(request.getParameter("id"));
                Product product = productService.findById(id);
                request.setAttribute("product", product);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/delete.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "edit": {
                List<Category> categories = categoryService.findAll();
                request.setAttribute("categories", categories);
                int id = Integer.parseInt(request.getParameter("id"));
                Product product = productService.findById(id);
                request.setAttribute("product", product);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/edit.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "create": {
                List<Category> categories = categoryService.findAll();
                request.setAttribute("categories", categories);
                List<Promotion> promotions = promotionService.findAll();
                request.setAttribute("promotions", promotions);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/create.jsp");
                dispatcher.forward(request, response);
            }
            case "view": {
                int id = Integer.parseInt(request.getParameter("id"));
                Product product = productService.findById(id);
                request.setAttribute("product", product);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/view.jsp");
                dispatcher.forward(request, response);
                break;
            }
            default: {
                List<Product> products = productService.findAll();
                request.setAttribute("products", products);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
                dispatcher.forward(request, response);
            }
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete": {
                int id = Integer.parseInt(request.getParameter("id"));
                productService.deleteById(id);
                 response.sendRedirect("/products");
                break;
            }

            case "edit": {
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                double price = Double.parseDouble(request.getParameter("price"));
                int categoryId = Integer.parseInt(request.getParameter("categoryId"));
                int promotionId = Integer.parseInt(request.getParameter("promotionId"));
                Product product = new Product(name, price, categoryId, promotionId);
                boolean isUpdate = productService.updateById(id, product);
                int flag = 0;
                String message = "";
                if (isUpdate) {
                    message = "cap nhat thanh cong";
                    flag = 1;
                } else {
                    message = "xay ra loi";
                    flag = 2;
                }
                request.setAttribute("flag", flag);
                request.setAttribute("message", message);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/edit.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "create": {
                String name = request.getParameter("name");
                double price = Double.parseDouble(request.getParameter("price"));
                int categoryId = Integer.parseInt(request.getParameter("categoryId"));
                int promotionId = Integer.parseInt(request.getParameter("promotionId"));
                Product product = new Product(name,price,categoryId,promotionId);
                productService.create(product);
                response.sendRedirect("/products");
                break;
            }
        }

    }
}
