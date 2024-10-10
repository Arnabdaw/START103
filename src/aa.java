class mua
{
    void array()
    {
        int i,j;
        int a[][]={{45,50,65,89},{52,36,15},{10,20,30}};
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
class aa
{
    public static void main(String[] args)
    {
           mua obj=new mua();
           obj.array();
    }
}
