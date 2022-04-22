class Car3
{
    private int num;
    private double gas;

    public Car3()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を製作しました");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を製作しました。");
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
        car1.setCar(1234, 20.5);
        car1.show();

        Car3 car2 = new Car3();
        car2.setCar(4567, 30.5);
        car2.show();
    } 
    
}
