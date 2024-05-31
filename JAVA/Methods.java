// Jvdroid-main: Interpolation

import java.util.Scanner;
public class Methods{
	static double forw(int n,double x[],double y[][],double p){
	double Y=0;
	Scanner sc= new Scanner(System.in);
	for(int i=1;i<n;i++){
	    	for(int j=0;j<(n-i);j++){
	    		y[i][j]=y[i-1][j+1]-y[i-1][j];
	    			    		
	    		}
	    	}
	    
	    tableForward(n,x,y,true,false);
	    for(int i=0;i<n;i++){
	    	Y+=(getP(i-1,p,true)*y[i][0])/getFac(i);	    		          	
	    	}
	    return Y;
		}
	
	static double backw(int n,double x[],double y[][],double p){
	double Y=0;
	Scanner sc= new Scanner(System.in);
	for(int i=1;i<n;i++){
	    	for(int j=0;j<(n-i);j++){
	    		y[i][j]=y[i-1][j+1]-y[i-1][j];
	    			    		
	    		}
	    	}
	    
	    tableForward(n,x,y,false,true);
	    	    	    
	    for(int i=0;i<n;i++){
	    	Y+=(getP(i-1,p,false)*y[i][n-i-1])/getFac(i);	    		          	
	    	}
	    return Y;
		}
	
	static double getP(int n,double p, boolean isForw){
		double m=p;
		if(n<0){
			return 1;
			}
		else if(isForw){
		for(int i=1;i<=n;i++){
			m*=(p-i);
			}	
		}
		else {
		for(int i=1;i<=n;i++){
			m*=(p+i);
			}	
		}
		return m;
		}
	static double getFac(int n){
		double m=1;
		for(int i=1;i<=n;i++){
			m*=i;
			}
		return m;
		}
		
	static void tableForward(int n,double []x,double [][]y,boolean isForw,boolean isBack){
	for(int i=0;i<4*n;i++){
	    	for(int j=0;j<2*(n+1);j++){
	    		if(i%2==0){
	    		System.out.print("-----");	
	    			}
	    		else if(j%2==0){
	    		System.out.print("|");	
	    			}
	    		else if(i==1){
	    			if(j==1){
	    				System.out.print("    x   "); 
	    				}
	    			else if(j==3){
	    				System.out.print("    y   ");	
	    				}	
	    			else {
	    			System.out.print(" ∆("+(j/2 -1)+")y  ");	
	    				}
	    			}
	    		else if(j==1 && i%4==3){
	    			System.out.format("  %06.4f",x[i/4]);
	    			}
	    		else if(j==3 && i%4==3){
	    			if(((isBack && (i-j)/4==n-(j-1)/2) || (isForw && (i-j)/4==0))){
	    			System.out.print("**"); 	
	    				}
	    			else {
	    		System.out.print("  ");	
	    			}
	    			System.out.format("%06.4f",y[0][i/4]); 
	    			}
	    		else if((i+j)%4==2 && j>3 && i>=j && (i+j)<=(4*n +2)){
	    		if(((isBack && (i-j)/4==n-(j-1)/2) || (isForw && (i-j)/4==0))){
	    			System.out.print("**"); 	
	    				}
	    		else {
	    		System.out.print("  ");	
	    			}
	    		System.out.format("%06.4f",y[(j-3)/2][(i-j)/4]);	
	    			}
	    		else {
	    		System.out.print("        ");	
	    			}
	    		}
	    	System.out.println("");	
	    	}	
		}
		}