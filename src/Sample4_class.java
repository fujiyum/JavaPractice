class Car1
{
    int num;
    double gas;

    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }

}

class Sample4_class
{
    public static void main(String[] args)
    {
        Car1 car1 = new Car1();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }
}
