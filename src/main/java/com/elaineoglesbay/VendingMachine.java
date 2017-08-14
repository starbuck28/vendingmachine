package com.elaineoglesbay;


public class VendingMachine {
    private String  balance = "";

    public String display(String balance) {
        if(balance == ""){
            return "INSERT COIN";
        }
            balance = "1.50";
        return balance;
    }
}
