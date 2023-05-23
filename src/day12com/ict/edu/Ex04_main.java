package day12com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Ex04_get_set[] arr = new Ex04_get_set[5];
			for(int i = 0; i <arr.length; i++)
			{		
				Ex04_get_set person = new Ex04_get_set();

				System.out.println("이름 : ");
				person.setName(scan.next());

				System.out.println("국어 : ");
				person.setKor(scan.nextInt());

				System.out.println("영어 : ");
				person.setEng(scan.nextInt());

				System.out.println("수학 : ");
				person.setMath(scan.nextInt());

				person.setSum(person.getKor() + person.getEng() + person.getMath());
				person.setAvg((int) (person.sum / 3.0 * 10) / 10.0);

				if (person.getAvg() >= 90) {
					person.hak="A";
				} else if (person.getAvg() >= 80) {
					person.hak = "B";
				} else if (person.getAvg() >= 70) {
					person.hak = "C";
				} else {
					person.hak = "F";
				}
				person.rank = 1;
				arr[i] = person;
			}
			for(int i = 0;i<arr.length;i++){
				for (int j = 0; j < arr.length; j++) {
					if (i == j)
						continue;
					if (arr[i].sum < arr[j].sum) {
						arr[i].rank++;
					}
				}
			}
			Ex04_get_set tmp = new Ex04_get_set(); // 객체 생성 해주는 것은 new

			for(
			int i = 0;i<arr.length-1;i++)
			{
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].getRank() > arr[j].getRank()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			for(int i = 0;i<arr.length;i++)
			{
				System.out.println();
				System.out.print(arr[i].name + "\t");
				System.out.print(arr[i].sum + "\t");
				System.out.print(arr[i].avg + "\t");
				System.out.print(arr[i].hak + "\t");
				System.out.print(arr[i].rank + "\t");
				System.out.println();
		}
}
}
	

