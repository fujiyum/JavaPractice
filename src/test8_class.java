class Mypoint
{
    int x;
    int y;

    void setX(int px)
    {
        x = px;
    }
    void setY(int py)
    {
        y = py;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
}

class test8_class
{
    public static void main(String[] args)
    {
        Mypoint point;
        point = new Mypoint();
        point.setX(10);
        point.setY(5);

        int px = point.getX();
        int py = point.getY();

        System.out.println("X座標は" + px + "Y座標は" + py + "です");
    }

}
