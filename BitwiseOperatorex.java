class BitwiseOperatorex{
public static void main(String args[])
{
int a=10;
int b=20;
 System.out.println(a>b && ++a>b);//false
 System.out.println(a); 
System.out.println(b);
 System.out.println(a>b & ++a>b);//false
 System.out.println(a);
 System.out.println(b);
 System.out.println(a>b || ++a>b);//false
 System.out.println(a);
 System.out.println(b);
System.out.println(a>b | ++a>b);//false
 System.out.println(a);
 System.out.println(b);
}
}