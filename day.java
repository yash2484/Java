import java.util.Scanner;
class day {
public static void main(String args[])
{
Scanner s = new Scanner (System.in);
int day;

System.out.println("Enter day no. in month");
day=s.nextInt();


switch (day % 7)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("doesnt exist");

}
}
}