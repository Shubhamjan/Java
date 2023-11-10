import java.util.Scanner;
public class TestEmpArr {
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("1. add new Employee\n 2. Modify salary \n3. display all\n \4. display by id \n 5. calculate salary by id\n 6. calculate Bonus\n7. exit\nchoice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. Salaried \n 2. Contract \n 3. vendor");
				int ch=sc.nextInt();
				EmployeeService.addnewemployee(ch);
				break;
			case 2:
				System.out.println("enter the id to modify sal");
				int id=sc.nextInt();
				System.out.println(EmployeeService.SetSalary(id));
			case 3:
				EmployeeService.display();
				break;
			case 4:
				System.out.println("enter id to display");
				id=sc.nextInt();
				EmployeeService.SearchById(id);
				break;
			case 5:
				System.out.println("enter id to display  salary");
				id=sc.nextInt();
				System.out.println(EmployeeService.Calculatesal(id));
				break;
				
				
			case 6:
				System.out.println("enter id to display bonus");
				id=sc.nextInt();
				System.out.println(EmployeeService.getbonus(id));
//			case 7:
//				System.out.println("Enter the id and name");
//				 id=sc.nextInt();
//				 String nm=sc.nextLine();
//				 EmployeeService.updateName(id, nm);
//				
			case 7:
				System.out.println("exit");
				
				
				
			}
		}while(choice!=7);
	}

}
