package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Function;
public class PredefinedInterface_FuctionExample3 {

	public static void main(String[] args) {
	Function<String,String> f = x -> x.toUpperCase();
	String str = f.apply("Welcome");
	System.out.println(str);
	}
}
