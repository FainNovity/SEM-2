
import java.util.Scanner;

public class Interpolation {
	public static void main(String[] args) {
		int n;
		double st,h,p,X,Y=0;
		
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter Total no. of arguments :");
		n=sc.nextInt();
				
		double []x=new double[n];
		double [][]y=new double[n][n];
		
		System.out.println("Enter difference between two consequencial arguments: ");
		h=sc.nextDouble();
	    System.out.println("Enter first argument X(0) :");
	    st=sc.nextDouble();
	    
	    for(int i=0;i<n;i++){
	    x[i]= st+(i*h);
	    System.out.println("Enter value for X("+i+") :");
	    y[0][i]=sc.nextDouble();
	    	
	    	}
	    System.out.println("Enter value of X : ");
	    X=sc.nextDouble();
	    if(X<(st+h)){
	    p=(X-st)/h;
	    Y= Methods.forw(n,x,y,p);	    	    		}
	    else if(X>(st+h*(n-2))){
	    p=(X-(st+h*(n-1)))/h;
	    Y= Methods.backw(n,x,y,p);	    	    		}
	    System.out.println("Your Answer should be : "+Y);	    
	}

	
			
	
}