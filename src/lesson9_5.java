class Car3
{
    public static int sum = 0;

    private int num;
    private double gas;

    public Car3()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("車を作成しました");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました");
    }
    public static void showSum()
    {
        System.out.println("車は全部で" + sum + "台あります");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }
}

class lesson9_5
{
    public static void main(String[] args)
    {
        Car3.showSum();

        Car3 car1 = new Car3();
        car1.setCar(1234, 20.5);

        Car3.showSum();

        Car3 car2 = new Car3();
        car2.setCar(4567, 30.5);
        
        Car3.showSum();
    }
    
}
