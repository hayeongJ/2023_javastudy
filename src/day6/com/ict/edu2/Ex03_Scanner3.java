package day6.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 근무시간이 8시간까지는 시간당 9620이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
        // 현재 근무한 시간이 10이다. 
        // 얼마를 받아야 하는가?
        System.out.print("근무시간 : ");
        
        int worktime = scan.nextInt();
        int pay = 9620;
        int overpay = (int) (pay*1.5);
        int time = 8;
        int res=0;
        
        if (worktime > time) {
			res = ((worktime-time))*overpay + (time*pay);
		} else {
			res = (time*pay);
		}
        System.out.println("지급액은 " + res + " 원 입니다.");
        System.out.println("==============================");
        
		
        // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         
         int menu = scan.nextInt();
         int mocha = 3500;
 		 int latte = 4000;
 		 int ame = 3000;
 		 int juice = 3500;
         int money = 10000;
         int change = 0;
         int p = 2;
         String coffee = "";
         
         if (menu==1) {
        	coffee = "카페모카";
 			change = money -(int) ((mocha*p)*1.1);
		} else if (menu==2) {
			coffee = "카페라떼";
 			change = money -(int) ((latte*p)*1.1);
		} else if (menu==3) {
			coffee = "아메리카노";
 			change = money -(int) ((ame*p)*1.1);
		} else if (menu==4) {
			coffee = "과일쥬스";
 			change = money -(int) ((juice*p)*1.1);
		} {
			
		}{

		}{

		}
         
		 System.out.println(coffee + " 주문하였습니다.>>" + " 잔돈은 " + change + "원 입니다.");
         System.out.println("==============================");
        /*
         int menu = scan.nextInt();
         int dan2 = 0;
         String drink ="";
         int total = 0;
         int vat = 0;
         int in = 10000;
         int out =0;
         int su = 2;
         
         if(menu==1) {
         	dan2 =3500;
         	drink = "카페모카";
         }else if(menu==2){
         	dan2 =4000;
         	drink = "카페라떼";
         }else if(menu==3){
         	dan2 =3000;
         	drink = "아메리카노";
         }else if(menu==4){
         	dan2 = 3500;
         	drink = "과일쥬스";
         }
         total = dan * su;
         vat = (int)(total * 0.1);
         out = in - (total+vat);
         System.out.println("잔돈:"+out);
         }
         }
         
         */
         
         
		// 나라를 입력하면 수도가 출력되게 하자
		// 한국 -> 서울, 중국 -> 베이징, 일본 -> 도쿄, 미국->워싱턴, 이외에는 데이터 없음
		// (switch~case)
         
         System.out.print("나라 : ");       
         String str = scan.next();
           
         switch (str) {
		case "한국" : str = "서울"; break;
		case "중국" : str = "베이징"; break;
		case "미국" : str = "워싱턴"; break;
		default: str = "데이터 없음";
			break;
		}
         System.out.println(str + "입니다.");
         
         
         
	}
}
