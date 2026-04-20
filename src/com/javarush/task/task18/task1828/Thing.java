package com.javarush.task.task18.task1828;

public class Thing {
    private String id;
    private String productName;
    private String price;
    private String quantity;

    public Thing() {
    }

    public String getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        if (id.length() < 8) {
            StringBuilder idBuilder = new StringBuilder(id);
            for (int i = idBuilder.length(); i < 8; i++) {
                idBuilder.append(" ");
            }
            id = idBuilder.toString();
        }
        this.id = id;
    }

    public void setProductName(String productNames) {
        StringBuilder productName = new StringBuilder(productNames);
        if (productName.length() < 30) {
            for (int i = productName.length(); i < 30; i++) {
                productName.append(" ");
            }
        }
        this.productName = productName.toString();
    }

    public void setPrice(String price1) {
        StringBuilder price = new StringBuilder(price1);
        if (price.length() < 8) {
            for (int i = price.length(); i < 8; i++) {
                price.append(" ");
            }
        }
        this.price = price.toString();
    }

    public void setQuantity(String quantitys) {
        StringBuilder quantity = new StringBuilder(quantitys);
        if (quantity.length() < 4) {
            for (int i = quantity.length(); i < 4; i++) {
                quantity.append(" ");
            }
        }
        this.quantity = quantity.toString();
    }

    @Override
    public String toString() {
        return id + productName + price + quantity;
    }
}
