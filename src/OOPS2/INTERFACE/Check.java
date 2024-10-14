package OOPS2.INTERFACE;

interface Customer
{
    int amt=5;

    void purchase();
}
class Seller implements Customer
{
    @Override
    public void purchase()
    {
        System.out.println("customer needs "+amt+" kg rice");
    }
}
public class Check
{
    public static void main(String[] args)
    {
        Customer obj=new Seller();
        obj.purchase();
        System.out.println(Customer.amt);
    }
}
