import java.util.Scanner;

class Day {
		private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
		public void set(String work) { this.work = work; }
		public String get() { return work; }
		public void show () {
				if(work == null) System.out.println("�����ϴ�.");
				else System.out.println(work + "�Դϴ�.");
		}
}

public class MonthSchedule {
		private int nDays;
		private Day [] days; // Day ��ü �迭
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
				System.out.println("��¥(1~30)?");
				int day = scanner.nextInt();
				System.out.println("����(��ĭ�����Է�)?");
				String work = scanner.next();
				day--;
				
				if(day < 0 || day > nDays) { // 0~29 �� ��ȿ
						System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");
						
						return;
				}
				days[day].set(work);
		}
}