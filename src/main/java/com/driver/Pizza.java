package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int total=0;
    boolean isCheese=false;
    boolean isToppings=false;
    boolean isTakeAway=false;
    boolean isBill=false;
    int cheese=0;
    int toppings=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price=300;
        else
            price =400;
        this.total+=price;
        this.bill="Base Price Of The Pizza: "+String.valueOf(price)+"\n";
    }

    public int getPrice(){
        return this.total;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese)
            total+=80;
        isCheese=true;
        cheese=80;

    }

    public void addExtraToppings(){
        // your code goes here

        if(isVeg)
            toppings=70;
        else
            toppings=120;
        if(!isToppings)
            total+=toppings;
        isToppings=true;

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway)
            total+=20;
        isTakeAway=true;
    }

    public String getBill(){
        // your code goes here
        if(!isBill) {
            if (isCheese)
                this.bill += "Extra Cheese Added: " + cheese + "\n";
            if (isToppings)
                this.bill += "Extra Toppings Added: " + toppings + "\n";
            if (isTakeAway) {
                this.bill += "Paperbag Added: " + 20 + "\n";

            }
            this.bill += "Total Price:" + total + "\n";
            isBill=true;
        }
        return this.bill;
    }
}
