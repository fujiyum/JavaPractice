class Car22
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }
    void showCar()
    {
        System.out.println("これから車の情報を示します");
        show();
    }
}

class Sample3_class
{
    public static void main(String[] args)
    {
        Car22 car1;
        car1 = new Car22();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
    }
}
