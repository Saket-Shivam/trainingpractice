import java.util.function.Predicate;
import java.util.function.Supplier;

//import java.util.function.Consumer;
//	
//
//
//
//public class Demo {
//	static void display(String user) {
//		System.out.println("Good Morning "+ user);
//	}
//	static void displayVal(int value) {
//		System.out.println(value);
//	}
//	public static void main(String[] args) {
//		Consumer<String> cons= Demo::display;
//		cons.accept("bhanu");
//		
//		Consumer<Integer> consTwo=Demo::displayVal;
//		consTwo.accept(8);
//	}
//}
// Java Program to demonstrate
// Consumer's accept() method

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Demo {
//	public static void main(String args[])
//	{
//		
//		Consumer<Integer> display = a -> System.out.println(a);
//
//		display.accept(10);
//
//		
//		Consumer<List<Integer> > modify = list ->
//		{
//			for (int i = 0; i < list.size(); i++)
//				list.set(i, 2 * list.get(i));
//		};
//
//		// Consumer to display a list of numbers
//		Consumer<List<Integer> >
//			dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
//
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(1);
//		list.add(3);
//
//		// Implement modify using accept()
//		modify.accept(list);
//
//		// Implement dispList using accept()
//		dispList.accept(list);
//	}
//}



//import java.util.function.Consumer;
//
//public class Demo {
//
//    public static void main(String[] args) {
//
//        Consumer<String> print = x -> System.out.println(x);
//        print.accept("i");   
//        
//        Consumer<String> print1 = x -> System.out.println(x);
//        print1.accept("am");   
//        
//        Consumer<String> print2 = x -> System.out.println(x);
//        print2.accept("eating");   
//
//    }
//
//}

//import java.util.function.Predicate;
//public class Demo{
//	static Boolean CheckSalary(int Salary) {
//		if(Salary<10000) {
//			return false;
//		}else {
//			return true;
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		Predicate<Integer> pre=Demo :: CheckSalary;
//		boolean re=pre.test(12000);
//		System.out.println(re);
//		
//		
//		
//		
//	}
//}

//import java.util.function.Predicate;
//import java.util.function.Supplier;
//
//
//public class SupplierTest{
//	static void testName(Supplier<? extends human> supplier) {
//		human hu=supplier.get();
//		hu.dance();
//	}
//}
//public class Demo{
//	public static void main (String[] args) {
//		testName()->new human();
//		testName()->new human();
//		not implemented..took another example
//	}
//}


//public class Demo{
//	public static void main(String args[]) {
//		int[] nums= {1,2,90,3,4,5};
//		int highest=greatest(nums);
//		System.out.println(highest);
//	}
//	public static int greatest(int[] num) {
//		int maximum=num[0];
//		for(int numbers:num) {
//			if(numbers>maximum) {
//				maximum=numbers;
//			}
//		}
//		return maximum;
//	}
//}
import java.util.function.BiFunction;
class Sum{
	public static int add(int a,int b) {
		return a+b;
	}
}
public class Demo{
	public static void main (String[] args) {
		BiFunction<Integer,Integer,Integer> addition= Sum::add;
	int sums=addition.apply(11, 2);
	System.out.println(sums);
	}
	
}
















































