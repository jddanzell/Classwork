package apr3;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder
{
   private List<CookieOrder> orders;

   public MasterOrder()
   {
       orders = new ArrayList<>();
   }

   public int getTotalBoxes()
   {
       int total = 0;

       for (CookieOrder o : orders)
       {
           total += o.getNumBoxes();
       }

       return total;
   }
}
