import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		System.out.println("Enter the value of n: ");
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		char arr[]=n.toCharArray();
		System.out.println("first digit is - "+arr[0]);
		in.close();
		String[] Sarray = n.split("");
		int[] numbers = new int[Sarray.length];
		for (int i = 0;i<Sarray.length;i++)
		{
			String numberAsString = Sarray[i];
			numbers[i]=Integer.parseInt(numberAsString);
			
		}
		String[] name = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String[] tens = {"", "Ten", "Twenty", "Thirty","Forty", "Fifty", "Sixty", "Seventy", "Eighty","Ninety"};
		String[] ones = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen","Nineteen" };
		System.out.println(name[numbers[0]] + name[numbers[1]] +name[numbers[2]]+ name[numbers[3]]);
		
		String A="";
	
			if(numbers[1]==0 && numbers[2]==0 && numbers[3]==0)
			{
				A = name[numbers[0]]+"Thousand";
			}
			else {
				if(numbers[3]==0)
			{
				A = name[numbers[0]]+"Thousand"+name[numbers[1]]+"Hundred"+ tens[numbers[2]];
			}
			if(numbers[2]==1 && numbers[3]!=0)
			{
				A = name[numbers[0]]+"Thousand"+name[numbers[1]]+"Hundred"+ ones[numbers[3]];
			}
			else if(numbers[2]!=0 && numbers[3]==0)
			{
				A = name[numbers[0]]+"Thousand"+name[numbers[1]]+"Hundred"+ tens[numbers[2]];
			}
			else
			{
				A = name[numbers[0]]+"Thousand"+name[numbers[1]]+"Hundred"+tens[numbers[2]]+name[numbers[3]];
			}}
		System.out.println(A);

	}
}
