package Card;
import org.example.Card;

import java.util.logging.Logger;
public class CardCall   {
    public static void main (String[]args) throws CloneNotSupportedException {
        Logger lg = Logger.getLogger("Card");
        Card c1 = new Card();

            if (c1.checkcard().equals("true")) {
                lg.info("Same Card Number");
            } else {
                lg.info("Different Card Number");
            }
            Card c2 = (Card) c1.clone();
            lg.info("Card Holder Name : " + c2.holdername);
            lg.info("Card number : " + c2.cardnumber);
            lg.info("Card Expire Date : " + c2.expiredate);
        }
}
