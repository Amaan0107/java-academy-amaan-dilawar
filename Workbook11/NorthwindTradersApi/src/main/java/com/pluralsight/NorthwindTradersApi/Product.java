package com.pluralsight.NorthwindTradersApi;

public class Product {
    private String productName;
    private int productID;
    private int categoryID;
    private double unitPrice;
    public Product(int productID, String productName, int categoryID, double unitPrice) {
        this.productName = productName;
        this.productID = productID;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public int getCategoryID() {
        return categoryID;
    }
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    public double UnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                ", categoryID=" + categoryID +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
