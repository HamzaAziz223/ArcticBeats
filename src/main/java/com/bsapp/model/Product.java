/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.model;

/**
 *
 * @author BEmerson
 */
public class Product {
    
    private long id;
    private String prodName;
    private String prodDescription;
    private String imageUrl;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the prodName
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * @param prodName the prodName to set
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * @return the prodDescription
     */
    public String getProdDescription() {
        return prodDescription;
    }

    /**
     * @param prodDescription the prodDescription to set
     */
    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }
    
}
