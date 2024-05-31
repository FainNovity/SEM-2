/*
Declare a class called book having author_name as private data member. 
Extend book class to have two sub classes called book_publication & paper_publication. Each of these classes have private member called title. 
Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author. Use command line arguments for inputting data.
*/
import java.util.*;
class Book {
	private String author;
	Book(String author){
		this.author=author;
		}
	Book(){
		
		}
	public void setAuthor(String author){
		this.author=author;
		}
	public String getAuthor(){
		return author;
		}
		void display(){
			System.out.println("Author : "+author); 
			}
	}
	
class Paper_pub extends Book {
	private String title;
	Paper_pub(String title, String author){
		this.title=title;
		setAuthor(author);
		}
		void display() {
			System.out.println("Author : "+getAuthor()); 
			System.out.println("Paper publication name : "+title); 
			}
	}
class Book_pub extends Book {
	private String title;
	Book_pub(String title,String author){
		this.title=title;
		setAuthor(author);
		}
	void display() {
			System.out.println("Author : "+getAuthor()); 
			System.out.println("Book publication name : "+title); 
			}
	}
	
public class Bookstore{	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n;
		String aut;
		System.out.println("No. of entries : ");
		n=sc.nextInt();
		Book b[]= new Book[n];
		for(int i=0;i<n;i++){
			
			boolean isPaper;
			boolean isBook;
			String name;
			System.out.println("Enter author name : "); 
			 aut=sc.next();
			System.out.println("For book publication, enter true:");
			do {
		          sc= new Scanner(System.in);
            try {
                 if(sc.nextBoolean()){
                 	isBook=true;
                 	System.out.println("Enter name of publication : "); 
                 	name= sc.next();
                 	b[i]= new Book_pub(name,aut);                 
                 	break;
                 	}             
                 else {       
                 System.out.print("Enter true for paper publication : ");         	
                 if(sc.nextBoolean()){
                 	isPaper=true;
                 	System.out.println("Enter name of publication : "); 
                 	name= sc.next();
                 	b[i]= new Paper_pub(name,aut);
                 	
                 	break;
                 	} 
                 else {
                 	b[i]= new Book(aut);
                 	break;
                 	}           	
                 }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        } while (true);
        
			}
		System.out.println("Enter name of author : "); 
		aut= sc.next();
		for(int i=0;i<n;i++){
			if(b[i].getAuthor()==aut){
				b[i].display();
				break;
				}
			else if(i==n-1){
				System.out.println("Author not found!!!"); 
				}
			}
	}
}
