package com.ims.app.model;


public class Product {

    private String id;
    private String productName;
    private String manufacturer;
    private String model;
    private Double unitListPrice;
    private int unitsInStock;

    // no argument constructor (used to initialize)
    public Product(){

    }

    // constructor with arguments
    public Product(String id, String productName, String manufacturer, String model, Double unitListPrice, int unitsInStock){
        super();
        this.id = id;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.model = model;
        this.unitListPrice = unitListPrice;
        this.unitsInStock = unitsInStock;
    }

    // getters and setters
    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public Double getUnitListPrice(){
        return unitListPrice;
    }

    public void setUnitListPrice(double unitListPrice){
        this.unitListPrice = unitListPrice;
    }

    public int getUnitsInStock(){
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
