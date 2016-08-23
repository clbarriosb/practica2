/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyyracard;

/**
 *
 * @author Carmen_Lucia3
 */
public class LyyraCard {
    
    private double balance;

    public LyyraCard (double cash) {
        this.balance=cash;   
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros.";
    }

    public void payEconomical() {
        if (this.balance<2.50){
        }
        else{
            this.balance = this.balance - 2.50;            
        }
    }

    public void payGourmet() {
        if(this.balance<4.0){
        }
        else{
            this.balance = this.balance - 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        if(amount>0){
            double actualBalance = this.balance + amount;
                if(actualBalance<=150.0){
                    this.balance = actualBalance;
                }
                else{
                    this.balance=150.0;
                }
        }
       
    }
    
}
