class Car4
{
    public static int sum = 0;

    private int num;
    private double gas;

    public Car4()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("車を製作しました。");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
    }
    public static void showSum()
    {
        System.out.println("車は全部で" + sum + "台あります。");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample5_const
{
    public static void main(String[] args)
    {
        Car4.showSum();

        Car4 car1 = new Car4();
        car1.setCar(1234, 20.5);

        Car4.showSum();

        Car4 car2 = new Car4();
        car2.setCar(4567, 30.5);

        Car4.showSum();
    }
    
}
