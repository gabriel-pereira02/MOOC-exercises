/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        balance = openingBalance;
    }
    
    public void eatAffordably(){
        if(balance - 2.6d < 0){
            System.out.println(toString());
        } else{
            balance = balance - 2.6d;
        }
    }
    
    public void eatHeartily(){
        if(balance - 4.6d < 0){
            System.out.println(toString());
        } else{
            balance = balance - 4.6d;
        }
    }
    
    public void addMoney(double amount){
        if(amount < 0){
            balance = balance;
        } else if(balance + amount > 150){
            balance = 150;
        } else{
            balance = balance + amount;
        }
    }
    
    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }
    
}
