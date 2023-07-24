package person_infos;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("                       ");
			System.out.println("1.Create new Person details");
			System.out.println("2.Show Person details");
			System.out.println("3.Delete Person ");
			System.out.println("4.Update the Person where you deleted");
			System.out.println("5.Search person by id");
			
			
			System.out.println("Enter choice : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter User Name : ");
				String name=sc.next();
				System.out.print("Enter User Gmail : ");
				String Gmail=sc.next();
				System.out.println("Enter Phone.No : ");
				String Phone=sc.next();
				Person_infos pi=new Person_infos();
				pi.setname(name);
				pi.setGmail(Gmail);
				pi.setPhone(Phone);
				DBmaintainence.CreateEmpolyee(pi);
				System.out.println("Succesfull");
				break;
			
			case 2:
				DBmaintainence.ShowData();
				break;
			case 3:
				System.out.print("Enter the User Id you want to delete : ");
				int id=sc.nextInt();
				DBmaintainence.DeleteData(id);
				System.out.println("Successfully deleted.....");
				break;
			case 4:
				System.out.println("Enter the Deleted row Id : ");
				int Id=sc.nextInt();
				System.out.print("Enter User Name : ");
				String Newname=sc.next();
				System.out.print("Enter User Gmail : ");
				String NewGmail=sc.next();
				System.out.print("Enter Phone.No : ");
				String NewPhone=sc.next();
				
				AlterDeleteRow ad=new AlterDeleteRow();
				ad.setid(Id);
				ad.setNewname(Newname);
				ad.setNewGmail(NewGmail);
				ad.setNewGmail(NewGmail);
				ad.setNewPhone(NewPhone);
				System.out.println("Added successfully....");
				
				DBmaintainence.AlterData(ad);
			
			case 5:
				System.out.print("Enter the Searching id :  ");
				int Sid=sc.nextInt();
				DBmaintainence.SearchDate(Sid);
				
		}
			
				
				
		
		}
		while(true);
		
	}
	}
