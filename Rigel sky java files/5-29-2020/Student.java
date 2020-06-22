public class student
{			
		private Scanner sc;
		
		prvate int studid;
		private string name;
		public student()
		{
				sc=new Scanner(System.in)
		}
		public void acceptDetails()
		{
				System.out.println("Enter Student id ");
				studid=sc.nextInt();
				System.out.println("Student Name");
				name=sc.next();
		}
		public void displayDetails()
		{
				System.out.println(DEtails are "+studid+"   "+name);
		}
}
public class StudMain
{
		private Student studarray[];
		public StudMain()
		{
		stuarray=new Student[S];
		
		}
		public void addDetails()
		{
		for(int x=0;x<stuarray.length;i++)
		{
				Student s=new Student();
				s.acceptDetails();
				stuarray[x]=s;
		
		}
		public void displayDetails()
		}
				for(Student s1:stuarray)
				{
				s1.displayDetails();
				}
		}
public  static void main(String ar[])
		{
				StudMain smain=new StudMain();
				smain.addDetails();
				smain.display();
		}
		
		}
	
}