
public class Student {
	int id;
	String name;
public Student(int myid, String myname) {
	id=myid;
	name=myname;
	
	if(id%2!=0)
	System.out.println(myname);
}
}
