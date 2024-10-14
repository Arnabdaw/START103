package OOPS2.POLYMORPHISM;

class Encapsule
{
    private int value;
    public void setV(int x)
    {
        value=x;
    }
    public int getV()
    {
        return value;
    }
}

class Capsule
{
    public static void main(String[] args)
    {
        Encapsule obj=new Encapsule();
        obj.setV(69);
        System.out.println(obj.getV());
    }

}
