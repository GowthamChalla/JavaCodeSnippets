package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Supplier;
public class PredefinedInterface_SupplierExample1 {

	public static void main(String[] args) {
		Supplier<Integer> t = () -> 39;
		int x = t.get();
		System.out.println(x);
	}
}
