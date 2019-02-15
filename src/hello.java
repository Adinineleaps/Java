import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = input.nextInt();
		int[] num = new int[20];
		
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		input.close();
		
		System.out.println(num);
		

	}

}
