import java.util.Scanner;

//class that implements the runnable interface for the thread
class prime implements Runnable{
	int num;
	
	//prime consturtor takes a parameter num
	public prime(int num) {
		
		this.num = num;
	}

	//overriden run method that is used to start the thread
	@Override
	public void run() {
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

//class that contain main method 
public class EightTwo {
	
	//main method
	public static void main(String args[]){
		
		//scanner class object that is used to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no:");
		int num =sc.nextInt();
		
		//creating thread class object
		Thread t1 = new Thread(new prime(num));
		
		//startinf the thread
		t1.start();   
		sc.close();
	}
}
