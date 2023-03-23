package Card;
import org.example.CardDetails;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CardCall   {
    public static void main (String[]args) throws CloneNotSupportedException {
        Logger lg = Logger.getLogger("Card");
        CardDetails c1 = new CardDetails();

            if (c1.checkcard().equals("true")) {
                lg.info("Same Card Number");
            } else {
                lg.info("Different Card Number");
            }
            CardDetails c2 = (CardDetails) c1.clone();
            lg.log(Level.INFO,() -> "Card Holder Name : "+c2.Holdername);
            lg.log(Level.INFO,() -> "Card Number : "+c2.Cardnumber);
            lg.log(Level.INFO,() -> "Card Holder Name : "+c2.Expiredate);
        }
}
