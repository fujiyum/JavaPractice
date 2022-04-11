class Sample1_test
{
    public static void main(String[] args)
    {
        int[] test;
        test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 70;
        test[3] = 90;
        test[4] = 55;

        for(int i=0; i<5; i++){
            System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
        }
    }
}