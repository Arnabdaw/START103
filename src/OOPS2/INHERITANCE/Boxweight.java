package OOPS2.INHERITANCE;

public class Boxweight extends Box
{
    double weight;
    public Boxweight()
    {
        this.weight=-1;
    }

    public Boxweight(double l, double h, double w, double weight)
    {
        super(l, h, w);
//        super.weight = weight+5;
        this.weight=weight;
    }

    public Boxweight(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }
    public Boxweight(Boxweight other)
    {
        super(other);
    }
}
