package com.codegym.service;

import com.codegym.dao.promotion.PromotionDao;
import com.codegym.model.Promotion;

import java.util.List;

public class PromotionService implements IPromotionService{
    private PromotionDao promotionDao;

    public PromotionService(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }

    @Override
    public List<Promotion> findAll() {
        return promotionDao.findAll();
    }

    @Override
    public Promotion findById(int id) {
        return null;
    }

    @Override
    public boolean create(Promotion promotion) {
        return promotionDao.create(promotion);
    }

    @Override
    public boolean updateById(int id, Promotion promotion) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
