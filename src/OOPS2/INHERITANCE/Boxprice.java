package OOPS2.INHERITANCE;

public class Boxprice extends Boxweight
{
    double cost;
    Boxprice()
    {
        super();
        this.cost=-1;
    }


    public Boxprice(double l, double h, double w, double weight, double cost)
    {
        super(l, h, w, weight);
        this.cost = cost;
    }


    public Boxprice(double side, double weight, double cost)
    {
        super(side, weight);
        this.cost = cost;
    }

    Boxprice(Boxprice other)
    {
        super(other);
        this.cost=other.cost;
    }

}
