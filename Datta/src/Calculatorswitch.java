
public class Calculatorswitch {
public static void main(String[]args)
{
int a=15, b=35, ch=45;
//Scanner r=new Scanner(system.in);
switch(ch)
{
case 1:
System.out.println("sum "+ (a+b));
break;
case 2:
	System.out.println("sub"+(a-b));
	break;
case 3:
	System.out.println("multi"+(a*b));
	break;
case 4:
	System.out.println("div"+(a/b));
break;
default:
	System.out.println("invalid input");
}
}
}
