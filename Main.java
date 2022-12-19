import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of job");
		int noOfJob=sc.nextInt();
		System.out.println("Enter job start time,end time and earnings.");
		int totalEarning=0;
		int maxEarning=0;
		int[] startTime=new int[noOfJob];
		int[] endTime=new int[noOfJob];
		int[] earnings=new int[noOfJob];
		for (int i = 0; i < noOfJob; i++) {
			startTime[i]=sc.nextInt();
			endTime[i]=sc.nextInt();
			earnings[i]=sc.nextInt();
		}
		for (int i = 0; i < earnings.length ; i++) {
			if(earnings[i]>maxEarning) {
				maxEarning=earnings[i];
			}
		}
		for (int i = 0; i < earnings.length ; i++) {
			totalEarning=totalEarning+earnings[i];

		}
		int Earning = totalEarning-maxEarning;
		int task=noOfJob-1;
		if(isEqual(earnings))
		{
			Earning=maxEarning;
			task=1;
		}		
		System.out.println("The number of tasks and earning availaible for others");
		System.out.println("Task : "+task);
		System.out.println("Earnings : "+Earning);	
	}

	static boolean isEqual(int[] earnings) {
		for (int i = 0; i < earnings.length-1; i++) {
			if(earnings[i+1]-earnings[i]!=0)
				return false;
		}
		return true;
	}
}
