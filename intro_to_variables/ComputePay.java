public class ComputePay {
public static void main(String[] args) {
int hours = 4 + 5 + 8 + 4;
	double sal = 8.75;
double tax = 0.20;
        double pay = hours * sal;
// Calculate pay at work based on hours worked each day
System.out.println("My total hours worked:");
System.out.println(hours);

System.out.println("My hourly salary:");
System.out.println("$" + sal);

System.out.println("My total pay:");
System.out.println(pay);

System.out.println("My taxes owed:"); // 20% tax
System.out.println(hours * sal * tax);
}
}