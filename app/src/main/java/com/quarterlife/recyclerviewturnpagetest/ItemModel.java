package com.quarterlife.recyclerviewturnpagetest;

public class ItemModel {
    private int user_id, user_img, cate_id, user_price, user_stock;
    private String user_name;

    public ItemModel(int user_id, int user_img, int cate_id, int user_price, int user_stock, String user_name) {
        this.user_id = user_id;
        this.user_img = user_img;
        this.cate_id = cate_id;
        this.user_price = user_price;
        this.user_stock = user_stock;
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_img() {
        return user_img;
    }

    public void setUser_img(int user_img) {
        this.user_img = user_img;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public int getUser_price() {
        return user_price;
    }

    public void setUser_price(int user_price) {
        this.user_price = user_price;
    }

    public int getUser_stock() {
        return user_stock;
    }

    public void setUser_stock(int user_stock) {
        this.user_stock = user_stock;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
