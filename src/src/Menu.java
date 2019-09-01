import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	static ArrayList<Emp> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("1. Add Employee");
		System.out.println("2. View All Employee");
		System.out.println("3. Remove Employee");
		System.out.println("4. Clear Total Data");
		System.out.println("5. Change Salary");
		System.out.println("6. Search Employee");
		System.out.println("7. View Dept wise List");
		System.out.println("8. View Sorted Employee");
		System.out.println("9. Exit");
		System.out.println("Enter the desired option");

		int i = sc.nextInt();
		sc.nextLine();
		switch (i) {
		case 1:
			addEmp();
			break;
		case 2:
			viewEmp();
			break;
		case 3:
			removeEmp();
			break;
		case 4:
			clearData();
			break;
		case 5:
			changeSal();
			break;
		case 6:
			searchEmp();
			break;
		case 7:
			viewList();
			break;
		case 8:
			sort();
			break;
		case 9:
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("Select item from the menu");
			menu();
		}

	}

	public static void addEmp() {

		String ename, desig, dept;
		int sal, eno = 0;
		System.out.println("Enter name of Employee");
		ename = sc.nextLine();
		System.out.println("Enter dept(it/acts/mkt/hr) of Employee");
		dept = sc.nextLine();
		System.out.println("Enter Designation of Employee");
		desig = sc.nextLine();
		System.out.println("Enter Salary of the Employee");
		sal = sc.nextInt();
		sc.nextLine();
		eno = eno + 1;
		Emp e = new Emp(ename, desig, dept, sal, eno);
		list.add(e);
		Collections.sort(list);
		menu();
	}

	public static void viewEmp() {
		for (Emp em : list) {
			System.out.println(em);
		}
		menu();
	}

	public static void removeEmp() {
		if (list.isEmpty()) {
			System.out.println("No Employee available");
		} else {
			System.out.println("Enter the Employee id which you want to remove");
			int i = sc.nextInt();
			sc.nextLine();

			for (Emp em : list) {
				if (em.eno == i) {
					list.remove(em);
					System.out.println("Employee removed");
				} else
					System.out.println("No such Employee");
			}
		}
		menu();
	}

	public static void clearData() {
		list.clear();
		menu();
	}

	public static void changeSal() {
		if (list.isEmpty()) {
			System.out.println("No Employee available");
		} else {
			System.out.println("Employee id whose salary you want to edit");
			int i = sc.nextInt();
			sc.nextLine();
			for (Emp em : list) {
				if (em.eno == i) {
					System.out.println("Enter updated salary");
					int j = sc.nextInt();
					sc.nextLine();
					em.sal = j;
				} else {
					System.out.println("Employee not found");
				}
				menu();
			}
		}
	}

	public static void searchEmp() {
		if (list.isEmpty()) {
			System.out.println("No Employee available");
		} else {
			System.out.println("Employee id whom you want to search");
			int i = sc.nextInt();
			sc.nextLine();
			for (Emp em : list) {
				if (em.eno == i) {
					System.out.println("ed");
					int j = sc.nextInt();
					sc.nextLine();
					em.sal = j;
				} else {
					System.out.println("Employee not found");
				}
				menu();
			}
		}
	}

	public static void sort() {
		System.out.println("Sorting on basis of which field");
		System.out.println("1. Employee no. and Ascending");
		System.out.println("2. Employee no. and Descending");
		System.out.println("3. Employee name and Ascending");
		System.out.println("4. Employee name and Descending");
		System.out.println("5. Salery and Ascending");
		System.out.println("6. Salary and Descending");
		System.out.println("7. Designation and Ascending");
		System.out.println("8. Designation and Descending");
		System.out.println("9. Department and Ascending");
		System.out.println("10. Department and Descending");
		System.out.println("/n Enter your choice /n");
		int j=sc.nextInt();
		sc.nextLine();
		switch(j)
		{
		case 1:	
			Collections.sort(list);
			viewEmp();
			break;
		case 2:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.eno-o1.eno;
					return n;
				}
			});
			viewEmp();
			break;

		case 3:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o1.ename.compareToIgnoreCase(o2.ename);
					return n;
				}
			});
			viewEmp();
			break;

		case 4:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.ename.compareToIgnoreCase(o1.ename);
					return n;
				}
			});
			viewEmp();
			break;

		case 5:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o1.sal-o2.sal;
					return n;
				}
			});
			viewEmp();
			break;

		case 6:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.sal-o1.sal;
					return n;
				}
			});
			viewEmp();
			break;

		case 7:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o1.desig.compareToIgnoreCase(o2.desig);
					return n;
				}
			});
			viewEmp();
			break;
		case 8:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.desig.compareToIgnoreCase(o1.desig);
					return n;
				}
			});
			viewEmp();
			break;
		case 9:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.dept.compareToIgnoreCase(o1.dept);
					return n;
				}
			});
			viewEmp();
			break;
		case 10:
			list.sort(new Comparator <Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					int n= o2.dept.compareToIgnoreCase(o1.dept);
					return n;
				}
			});
			viewEmp();
			break;
		default:
			System.out.println("Choose a Valid Option");
		}
	}

	public static void viewList() {

		if (list.isEmpty()) {
			System.out.println("No Employee available");
		} else {
			ArrayList<Emp> listIt = new ArrayList<>();
			ArrayList<Emp> listActs = new ArrayList<>();
			ArrayList<Emp> listMkt = new ArrayList<>();
			ArrayList<Emp> listHr = new ArrayList<>();

			for (Emp em : list) {
				if (em.dept.equals("it")) {
					listIt.add(em);
				} else if (em.dept.equals("acts")) {
					listActs.add(em);
				} else if (em.dept.equals("mkt")) {
					listMkt.add(em);
				} else if (em.dept.equals("hr")) {
					listHr.add(em);
				} else
					System.out.println("Unkown department");
			}

			HashMap<String, ArrayList<Emp>> map = new HashMap<>();
			map.put("it", listIt);
			map.put("acts", listActs);
			map.put("mkt", listMkt);
			map.put("hr", listHr);
			//System.out.println(map);

			for (String s : map.keySet()) {
				for (Emp em : map.get(s)) {
					System.out.println("Depatment name:- " + em.dept);
					System.out.println(em);
				}
			}
			/*
			 * for(Emp em:listIt) { System.out.println(em); } for(Emp
			 * em:listActs) { System.out.println(em); } for(Emp em:listMkt) {
			 * System.out.println(em); } for(Emp em:listHr) {
			 * System.out.println(em); }
			 */

			menu();
		}
	}

	public static void main(String[] args) {
		menu();

	}

}
