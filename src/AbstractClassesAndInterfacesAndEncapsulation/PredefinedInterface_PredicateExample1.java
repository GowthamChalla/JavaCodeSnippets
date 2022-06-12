package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Predicate;
public class PredefinedInterface_PredicateExample1 {

	public static void main(String[] args) {
		Predicate<Integer> p = x -> x>0;
		boolean res = p.test(100);
		if (res)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Zero or Negative Number");
		}
	}
}
