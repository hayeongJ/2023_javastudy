package day11.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Ex08_method로 만들어진 객체만 저장하는 배열 (=객체형 배열 = 참조 자료형 배열)
		
		Ex08_method[] arr = new Ex08_method[5];
		
		for (int i = 0; i < 5; i++) {
			Ex08_method person = new Ex08_method();
			
			System.out.println("이름 : ");
			person.name = scan.next();
			
			System.out.println("국어 : ");
			person.kor = scan.nextInt();
			
			System.out.println("영어 : ");
			person.eng = scan.nextInt();
			
			System.out.println("수학 : ");
			person.math = scan.nextInt();
			
			person.sum = person.kor+person.eng+person.math;
			person.avg = (int)(person.sum/3.0*10)*10.0;
			
			if(person.avg>=90) {
				person.hak = "A";
			}else if(person.avg>=80) {
				person.hak = "B";
			}else if(person.avg>=70) {
				person.hak = "C";
			}else {
				person.hak = "F";
			}
			person.rank =1;
			arr[i]=person;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j)continue;
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		Ex08_method tmp = new Ex08_method();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank>arr[j].rank) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.print(arr[i].rank + "\t");
		}
		
	}
}
