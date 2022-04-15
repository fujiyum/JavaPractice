class Car3
{
    private int num;
    private double gas;

    public Car3()
    {
        System.out.println("車を製作しました");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }
}

class Sample4_const
{
    public static void main(String[] args)
    {
        Car3 car1 = new Car3();

        car1.show();
    } 
    
}
