import java.util.Scanner;

class Add {
	private int a,b;
	public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
	}
	public int calculate() {
			return a+b;
	}
}

class Mul {
	private int a, b;
	public void setValue(int a, int b){
			this.a = a;
			this.b = b;
	}
	public int calculate() {
			return a*b;
	}
}
class Sub {
		private int a, b;
		public void setValue(int a, int b){
				this.a = a;
				this.b = b;
		}
		public int calculate() {
				return a-b;
			
		}
}

class Div {
		private int a, b;
		public void setValue(int a, int b) {
				this.a = a;
				this.b = b;
		}
}
