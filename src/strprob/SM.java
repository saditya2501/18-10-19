package strprob;
//base//parent// super
class SM {
    void java()
    {
        System.out.println("java pro.");
    }

}
//derived// child// sub
class Google extends SM
{
    void android()
    {
        System.out.println("google");
    }
}
class Orecel extends Google
{
    void dbms()
    {
        System.out.println("sql...");

    }
 public static void main(String args[])
 {
     Orecel ad=new Orecel();
     ad.java();
     ad.dbms();
     ad.android();
 }
}
