package com.codegym.controller;

import com.codegym.dao.CategoryDao;
import com.codegym.dao.ProductDao;
import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.CategoryService;
import com.codegym.service.ICategoryService;
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

    public ProductServlet() {
        this.productService = new ProductService(new ProductDao());
        this.categoryService = new CategoryService(new CategoryDao());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                List<Category> categories = categoryService.findAll();
                request.setAttribute("categories", categories);
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
            case "create": {
                String name = request.getParameter("name");
                double price = Double.parseDouble(request.getParameter("price"));
                int categoryId = Integer.parseInt(request.getParameter("categoryId"));
                int promotionId = Integer.parseInt(request.getParameter("promotionId"));
                Product product = new Product(name, price, categoryId, promotionId);
                productService.create(product);
                response.sendRedirect("/products");
                break;
            }
        }

    }
}
