import java.util.Scanner;

public class IncomeTax {		
	static void calculateTax(double ti) { 
		double tax=0,cess=0; 
		if(ti > 300000 && ti <= 500000) tax = (ti-300000)*0.1; 
        else if(ti > 500000 && ti <= 1000000) tax = 200000 + (ti-500000)*0.2; 
        else if(ti > 1000000) tax = 1200000 + (ti-1000000)*0.3; 
		cess = tax * 0.03; 
		System.out.println("Total tax: "+tax+" Total cess: "+cess); 
		System.out.println("Tax payable:"+(tax+cess)); 
	} 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter Total Income: "); 
		double total_income = sc.nextDouble();  
		calculateTax(total_income);  
		sc.close(); 	
	}
}