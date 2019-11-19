package strprob;

public class ex2 {
    void fun()
    {
        String str1="Hello aditya ";
        String str2="aditya ";

        int res=str1.compareToIgnoreCase(str2);
        System.out.println(res);

    }
    public static void main(String []arg)
    {
        ex2 ac= new ex2();
        ac.fun();
    }

}
