package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Card implements Cloneable{
    Logger lg = Logger.getLogger("Card");
    public String holdername;
    public String cardnumber;
    public String expiredate;
    String name = "karthick";
    String number = "1234";
    String date = "10";

    public Card(){
            Scanner sc = new Scanner(System.in);
            lg.info("Enter the card holder name : ");
             holdername = sc.next();
            lg.info("Enter the card number : ");
             cardnumber = sc.next();
            lg.info("Enter the card expire date : ");
             expiredate = sc.next();
             lg.info("Original card ");
             lg.log(Level.INFO,()-> "Name : "+ " " +name);
             lg.log(Level.INFO,()-> "Number : "+ " "+number);
             lg.log(Level.INFO,()-> "Date : "+ " "+date);
    }
     public String checkcard(){
            if (number.equals(cardnumber)) {
                return "true";
            }
            else{
                return "false";
            }
        }
        public Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }
    }

