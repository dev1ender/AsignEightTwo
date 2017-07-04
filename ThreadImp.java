import java.util.Scanner;

class Prime extends Thread{
	
	int num;
	
	public Prime(int num) {
		
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=true;
		
		for(int i=2;i<=num/2;i++){ //loping till the half of the num and checking is enterd no is prime or not
			if(num%i==0){
				flag =false;
				
			}
		}
		if(flag==true){
			System.out.println(num+" is prime");
		}
		else{
			System.out.println(num+" is not prime");
		}
	}
	
}

public class ThreadImp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no:");
		int num =sc.nextInt();
		Thread T1= new Prime(num);
		T1.start();
		sc.close();
	}

}
