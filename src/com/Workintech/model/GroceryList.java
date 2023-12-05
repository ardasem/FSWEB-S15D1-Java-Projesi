package com.Workintech.model;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {

    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
        String [] splittedItems = items.split(",");

        for(String item: splittedItems){
            String trimmedItem = (item.trim());

            if(checkItemsInList(trimmedItem)){
                System.out.println("Item "+item+ " is already on the cart.");
            }else
            {
                this.items.add(trimmedItem);
                sortItems();
            }
        }
    }

    public void removeItems(String items){
        String [] splittedItems = items.split(",");
        for(String item: splittedItems) {
            String trimmedItem = (item.trim());
            if(!checkItemsInList(trimmedItem)){
                System.out.println("Item "+item+ "is not on the cart.");
            }else{
                this.items.remove(trimmedItem);
            }
        }
    }

    public boolean checkItemsInList(String item){
        return items.contains(item);
    }

    public void sortItems(){
        Collections.sort(this.items);
    }

    public void printSorted(){
        System.out.println("Current cart:");
        for(String item: this.items){
            System.out.println(item);
        }
    }
}
