import java.util.*;
class GenStack<T>
{
	T arr[];
	int top;
	GenStack(T a[])
	{
		this.arr=a;
		top=-1;
	}
	public void push(T ele)
	{
		if(top==arr.length-1)
		{
			System.out.println("Error:Stack Full");
			return;
		}
		else
		{
			arr[++top]=ele;
		}
	}
	public String pop()
	{
		if(top==-1)
		{
			System.out.println("Error:Stack Empty");
			return null;
		}
		else
			return arr[top--].toString();
	}
	void display()
	{
		int temp=top;
		while(top!=-1)
		{
			System.out.println(this.pop());
		}
		top=temp;
	}
}
class Employee
{
	String name;
	int id;
	Employee(String n,int i)
	{
		name=n;
		id=i;
	}
	public String toString()
	{
		return ("Name: "+name+" I.D: "+id);
	}
}
class Student
{
	String name;
	int regno;
	Student(String n,int rn)
	{
		name=n;
		regno=rn;
	}
	public String toString()
	{
		return ("Name: "+name+" Registration number: "+regno);
	}
}
class Question1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee E[]=new Employee[2];
		Student S[]=new Student[2];
		Employee eref;
		Student sref;
		GenStack<Employee> emp=new GenStack<Employee>(E);
		GenStack<Student> stu=new GenStack<Student>(S);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name and id of employee");
			String name=sc.next();
			int id=sc.nextInt();
			eref=new Employee(name,id);
			emp.push(eref);
		}
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name and registration number of student");
			String name=sc.next();
			int regno=sc.nextInt();
			sref=new Student(name,regno);
			stu.push(sref);
		}
		emp.display();
		stu.display();
	}
}
