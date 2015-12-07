import java.util.ArrayList;
public class Store
{
    private ArrayList<String> list1 = new ArrayList<String>();
    private ArrayList<Double> list2 = new ArrayList<Double>();
    public void addSale(String customerName , double amount)
    {
        list1.add(customerName);
        list2.add(amount);
    }
    
    public String nameOfBestCustomer()
    {
        double previousAmount = 0;
        for (int i = 0; i < list2.size(); i ++)
        {
            double currentAmount = list2[i];
            if (currentAmount > previousAmount)
            {
                double largestValue = currentAmount;
            }
        }
    }
}