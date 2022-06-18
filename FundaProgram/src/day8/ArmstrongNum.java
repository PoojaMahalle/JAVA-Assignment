package day8;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, cnt=0;;
        
        while(temp != 0) //153  15  1
        {
        	cnt++; //sum=1 2 3
        	temp = temp / 10; //15 1 0
        }
        
        temp = num;
        
        while(temp != 0) //153
        {
        	int r = temp % 10;  //3
        	//int pow=Math.pow(r, cnt); //input is not double
        	int pow = 1;
        	for(int i=1; i<= cnt; i++) //i=1 i=2 i=3 i=4
        	{
        		pow = pow * r; //pow=1*3=3 pow=3*3=9 pow=9*3=27
        	}
        	temp = temp/10;
        	sum = sum+pow;
        }
        if(sum == num)
        {
        	System.out.println(num+" is a armstrong number");
        }
        else
        {
        	System.out.println(num+" is not a armstrong number");
        }
	}

}
