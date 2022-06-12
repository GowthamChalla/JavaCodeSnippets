package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Consumer;
public class PredefinedInterface_ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<Integer> c = x -> System.out.println(x);
		c.accept(10);       
	}
}
