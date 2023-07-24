package product;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to ----");
		
		do {
			System.out.println("1.Go to See the available products");
			System.out.println("2.See my cart");
			System.out.println("3.Conform order");
			System.out.println("------------------------------------------------");
			System.out.println("4.Enter new Items to the website(Company empoloyes only)");
			System.out.println("5.Update product price");
			System.out.println("6.Delete a product");
			System.out.println("Enter choice : ");
			int choice=sc.nextInt();
			switch (choice) {
			
			case 1:
			
				System.out.println("List all the Available products");
				DBmaintain.ShowTable();
		
		
				int id1=sc.nextInt();
					
				CalculateProduct cp=new CalculateProduct();
				Product_info pie=new Product_info();
				DBmaintain db=new DBmaintain();
				
				pie.setid(id1);
			
				
				long pri=db.GetCal(pie);
			    pie.setPrice(pri);
				long kim=pie.getPrice();
				System.out.println(kim);
			
				
			int id2=sc.nextInt();
			pie.setid2(id2);
			long pri2=db.GetCal(pie);
			pie.setToatlPrice(pri2);
			long min=pie.getTotalPrice();
			System.out.println(min);


				
				break;
			
				
			case 4:
				
				System.out.println("Enter the Empolyee password : ");
				int Euser=sc.nextInt();
				int pw=2310;
				if(Euser==pw) {
					Product_info pi=new Product_info();
					System.out.println("Enter product Id : ");
					int id=sc.nextInt();
					System.out.println("Enter product Name : ");
					String ProductName=sc.next();
					System.out.println("Enter product Price : ");
					long Price=sc.nextLong();
					pi.setid(id);
					pi.setProductName(ProductName);
					pi.setPrice(Price);
					DBmaintain.NewEmp(pi);
					System.out.println("Added successfully.....");
				}else {
					System.out.println("Invalid password...");
				}
				break;
			case 5:
				System.out.println("Enter the Empolyee password");
				int Euser1=sc.nextInt();
				int pw1=2310;
				if(Euser1==pw1) {
					Product_info pi=new Product_info();
					System.out.println("Enter the unique product you want to change");
					int ProID=sc.nextInt();
					System.out.println("Enter the amount ");
					long Price=sc.nextLong();
					pi.setid(ProID);
					pi.setPrice(Price);
					DBmaintain.UpdatePrice(pi);
				
					
				}else {
					System.out.println("Invalid Password.....");
				}
				break;
			case 6:
				System.out.println("Enter the id you want to delete : ");
				int id=sc.nextInt();
				DBmaintain.DeletePro(id);
				break;
				
			}
			
		
				
				}while(true);
		
	
	
	}

}