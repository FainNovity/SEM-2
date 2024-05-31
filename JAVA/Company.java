class Member {
	String name;
	int age;
	String phoneNum;
	double salary;
	String address;
	
	void printSalary(){
		System.out.println("Salary : "+salary); 
		}
	void printCommon(){
		System.out.println("Name : "+name); 
		System.out.println("Age : "+age); 
		System.out.println("Phone Number : "+phoneNum); 
		System.out.println("Address : "+address);
		printSalary(); 
		
	}
}

class Employee extends Member {
	String specialization;
	Employee(String name,int age,String phoneNum,double salary,String address,String specialization){
		super.name=name;
		super.age=age;
		super.phoneNum=phoneNum;
		super.salary=salary;
		super.address=address;
		this.specialization=specialization;
		} 
	
	
	void printDetails(){
		System.out.println("Post : Employee"); 
		printCommon();
		System.out.println("Specialization : "+specialization);
		System.out.println(""); 
		}
	}
	
class Manager extends Member {
	String department;
	
	Manager(String name,int age,String phoneNum,double salary,String address,String department){
		super.name=name;
		super.age=age;
		super.phoneNum=phoneNum;
		super.salary=salary;
		super.address=address;
		this.department=department;
		} 
	
	void printDetails(){
		System.out.println("Post : Manager"); 
		printCommon();
		System.out.println("Department : "+department); 
		System.out.println(""); 
		}
	}

public class Company {
	public static void main(String[] args) {
		Employee e= new Employee("harsh",19,"123446686",40000,"rajkot","web dev");
		Manager m= new Manager("HARSH",19,"123446686",60000,"rajkot","web");
		e.printDetails();
		m.printDetails();
		
	}
}