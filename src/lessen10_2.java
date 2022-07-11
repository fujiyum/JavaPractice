class lesson10_2
{
    public static void main(String[] args)
    {
        String str = "Hello";

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        int len = str.length();

        System.out.println(str + "の１番目の文字は" + ch1 + "です。");
        System.out.println(str + "の２番目の文字は" + ch2 + "です。");
        System.out.println(str + "の長さは" + len + "です。");
    }
    
}
