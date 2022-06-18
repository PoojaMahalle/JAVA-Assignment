package arrayinjava;

//import java.util.Scanner;

public class SumOf12 {

	public static void main(String[] args) {
		int arr[]= {4,8,1,24,5,3,2,20};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number");
		int num =25;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				int temp=arr[i]+arr[j];
				if(num==temp)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
