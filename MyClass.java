import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
public class person
{
    String name;
    int mobno;
    String email;
    person(String name,int mobno,String email)
    {
        this.name = name;
        this.mobno = mobno;
        this.email = email;
    }
    
}
public class MyClass
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int mob = sc.nextInt();
        String mail = sc.nextLine();
        person p = new person(str,mob,mail);
    }
}