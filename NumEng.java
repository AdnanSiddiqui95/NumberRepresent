import java.util.Scanner;
public class NumEng 
{
	static String[] n= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] x= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static void Convert(int num)
	{
		if(num>=1  && num<=19)
		{
			System.out.print(n[num]+" ");
		}
		if(num>=20 && num<=99)
		{
			System.out.print(x[num/10]+" "+n[num%10]);
		}
		if(num>=100  &&  num<=999)
		{
			Convert(num/100);
			System.out.print("Hundred ");
			Convert(num%100);
		}
		if(num>=1000  &&  num<=99999)
		{
			Convert(num/1000);
			System.out.print(" Thousand ");
			Convert(num%1000);
		}
		if(num>=100000  &&  num<=9999999)
		{
			Convert(num/100000);
			System.out.print(" Lakh ");
			Convert(num%100000);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any number you want to : " );
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=10000000  &&  num<=999999999)
		{
			Convert(num/10000000);
			System.out.print(" Crore ");
			Convert(num%10000000);
		}
		else
		{
		Convert(num);
		}
	}

}
