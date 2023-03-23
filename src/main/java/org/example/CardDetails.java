package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class CardDetails implements Cloneable{
    Logger lg = Logger.getLogger("Card");
    public static String  Holdername;
    public static String Cardnumber;
    public static String Expiredate;
    String name = "karthick";
    String number = "1234";
    String date = "10";

    public CardDetails(){
            Scanner sc = new Scanner(System.in);
            lg.info("Enter the card holder name : ");
             Holdername = sc.next();
            lg.info("Enter the card number : ");
             Cardnumber = sc.next();
            lg.info("Enter the card expire date : ");
             Expiredate = sc.next();
             lg.info("Original card ");
             lg.log(Level.INFO,()-> "Name : "+ " " +name);
             lg.log(Level.INFO,()-> "Number : "+ " "+number);
             lg.log(Level.INFO,()-> "Date : "+ " "+date);
    }
     public String checkcard(){
        if (number.equals(Cardnumber)) {
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

