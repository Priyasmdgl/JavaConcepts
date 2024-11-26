package java1;

public class ParameterizedConstructor {
          int employeeid;
          String employeename;
          ParameterizedConstructor(int id, String name) {
			employeeid = id;
			employeename = name;
		}
          public void employee() {
        	  System.out.println(employeeid);
        	  System.out.println(employeename);
          }
	public static void main(String[] args) {
		ParameterizedConstructor constructor = new ParameterizedConstructor(1, "Raghav");
	    constructor.employee();
	    ParameterizedConstructor constructor2 = new ParameterizedConstructor(2, "Jayanthi");
	    constructor2.employee();

	}

}
