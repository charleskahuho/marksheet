import java.util.Scanner;
public class marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of students");
		int number = scanner.nextInt();
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sumTotal = 0;
		int i;
		for(i = 1; i <= number; i++) {
			System.out.println("enter student name");
			String name = scanner.next();
			System.out.println("Enter  marks for subject 1");
			int sub1 = scanner.nextInt();
			System.out.println("Enter  marks for subject 2");
			int sub2 = scanner.nextInt();
			System.out.println("Enter  marks for subject 3");
			int sub3 = scanner.nextInt();
			System.out.println("Enter  marks for subject 4");
			int sub4 = scanner.nextInt();
			System.out.println("Enter  marks for subject 5");
			int sub5= scanner.nextInt();
			int total = sub1 + sub2 + sub3 + sub4 + sub5;
			double average = total/5;
				sum1=sum1+sub1;
				sum2=sum2+sub2;
				sum3=sum3+sub3;
				sum4=sum4+sub4;
				sum5=sum5+sub5;
				sumTotal = sumTotal + total;
		    if(i == number){
		    	for(i =1; i <= number; i++) {
			System.out.println("Welcome to Student Mark List Application");
			System.out.println("SNo\tStudent Name\tSub1\tSUb2\tsub3\tsub4\tsub5\tTotal");
			System.out.println(i+"\t"+name+"\t\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+sub4+"\t"+sub5+"\t"+total);
		    	}
		}
		}
		System.out.println("Totals\t\t\t"+sum1+"\t"+sum2+"\t"+sum3+"\t"+sum4+"\t"+sum5+"\t"+sumTotal);

	}

}
