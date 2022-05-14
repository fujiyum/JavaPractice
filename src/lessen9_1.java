class Car
{
    private int num;
    private double gas;

    public void setNum(int n, double g)
    {
        if(g > 0 && g < 1000){
            num = n;
            gas = g;
            System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
        }
        else{
            System.out.println(g + "は正しいガソリン量ではありません");
            System.out.println("ガソリンを変更できませんでした");
        }
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }
}

public class lessen9_1
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.setNum(1234, 20.5);
        car1.show();

        System.out.println("正しくないガソリン量(-10.0)を指定してみます");

        car1.setNum(1234, -10.0);
        car1.show();
    }
}
