package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Predicate;
public class PredefinedInterface_PredicateExample2 {

	public static void main(String[] args) {
    Predicate<Integer> p = x -> x%2==0;
    boolean res = p.test(100);
	    if (res)
	    {
	    	System.out.println("Even Number");
	    }
	    else
	    {
	    	System.out.println("Odd Number");
	    }
	}
}
