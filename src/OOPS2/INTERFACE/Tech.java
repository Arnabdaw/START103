package OOPS2.INTERFACE;

interface People
{
    void webdesign();
    void webdevelop();
}
abstract class Infotech implements People
{
    @Override
    public void webdesign()
    {
        System.out.println("Green, top menu, three dot button");
    }
}
class Poetech extends Infotech
{
    @Override
    public void webdevelop()
    {
        System.out.println("Html, Css, javascript");
    }
}
public class Tech
{
    public static void main(String[] args)
    {
        People obj=new Poetech();
        obj.webdesign();
        obj.webdevelop();
    }
}
