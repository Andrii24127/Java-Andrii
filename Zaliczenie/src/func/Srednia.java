package func;

public class Srednia {
	private int num;
	private int num2;
	
	public Srednia(){
		num = 0;
		num2 = 0;
	}
	
	public Srednia(int value, int value2){
		num = value;
		num2 = value2;		
	}
	
	public double getSrednia(){
		System.out.print(((num + num2) / 2.0f));
		return ((num + num2) / 2.0f);
	}
}
