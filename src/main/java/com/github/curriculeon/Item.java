package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Item {

    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public Item() {
        this.itemName = "";
    }

    public String getItemName(String itemName) {
        return this.itemName;
    }

    public void setItemName() {
        this.itemName = itemName;
    }
}
