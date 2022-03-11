package com.codegym.controller;

import com.codegym.dao.promotion.PromotionDao;
import com.codegym.model.Promotion;
import com.codegym.service.IPromotionService;
import com.codegym.service.PromotionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PromotionServlet", value = "/promotions")
public class PromotionServlet extends HttpServlet{
 private  IPromotionService promotionService;

    public PromotionServlet() {
        this.promotionService = new PromotionService(new PromotionDao());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {


            default:{
                List<Promotion> promotions = promotionService.findAll();
                request.setAttribute("promotions", promotions);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/promotion/list.jsp");
                dispatcher.forward(request, response);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
