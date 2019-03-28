import java.util.Scanner;

class Day {
		private String work; // 하루의 할 일을 나타내는 문자열
		public void set(String work) { this.work = work; }
		public String get() { return work; }
		public void show () {
				if(work == null) System.out.println("없습니다.");
				else System.out.println(work + "입니다.");
		}
}

public class MonthSchedule {
		private int nDays;
		private Day [] days; // Day 객체 배열
		private Scanner scanner;
		
		public MonthSchedule(int nDays) {
				this.nDays = nDays;
				this.days = new Day [nDays];
				for(int i=0; i<days.length; i++) {
						days[i] = new Day();
				}
				scanner = new Scanner(System.in);
			
		}
		
		private void input() {
				System.out.println("날짜(1~30)?");
				int day = scanner.nextInt();
				System.out.println("할일(빈칸없이입력)?");
				String work = scanner.next();
				day--;
				
				if(day < 0 || day > nDays) { // 0~29 만 유효
						System.out.println("날짜 잘못 입력하였습니다.!");
						
						return;
				}
				days[day].set(work);
		}
}