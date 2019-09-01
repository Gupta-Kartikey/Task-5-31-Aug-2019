import java.util.HashMap;

public class ProjectEmp {

	public static void main(String[] args) {
		Emp e1=new Emp("kartikey", "dev", "it", 234334525, 1);
		Emp e2=new Emp("akansha", "dev", "mkt", 431524456, 2);
		Emp e3=new Emp("prateeksha", "dev","hr", 33436436, 3);
		Emp e4=new Emp("prakhar", "dba", "hr", 34654564, 4);
		Emp e5=new Emp("rishabh", "dba", "it", 45633246, 5);

		Project p1=new Project(1, "fb");
		Project p2=new Project(2, "fis");
		Project p3=new Project(3, "ibm");
		Project p4=new Project(4, "tcs");
		Project p5=new Project(5, "Worldpay");
		
		HashMap <Emp,Project>map=new HashMap<>();
		map.put(e1, p5);
		map.put(e2, p4);
		map.put(e3, p2);
		map.put(e5, p3);
		map.put(e4, p1);
		
		System.out.println(map);
	}

}
