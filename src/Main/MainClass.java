package Main;

import java.util.Scanner;

import Cclass.Cclass;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a=0, b=0, num=0;
	
	
	while(true) {
	System.out.print("========숫자프로그램==========\n 1.최소 공배수\n 2.최대 공약수 \n 3.두 수의 합\n >>>>> : ");
		num = input.nextInt();
		System.out.println("두 숫자를 입력하시오");
		a =input.nextInt();
		b= input.nextInt();		
		Cclass c = new Cclass();
	switch(num){
		case 1:
		case 2:
		case 3: System.out.println("두 수의 합 : "+c.Sum(a, b)); break;
		
	}
	}
}
}
