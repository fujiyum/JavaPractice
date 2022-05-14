class Car2
{
    private int num;
    private double gas;

    public Car2()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を製作しました");
    }
    public Car2(int n, double g)
    {
        this();
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas +"の車を作成しました");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }

}
class lesson9_3
{
    public static void main(String[] args)
    {
        Car2 car1 = new Car2();
        car1.show();

        Car2 car2 = new Car2(1234, 20.5);
        car2.show();
    }
}
