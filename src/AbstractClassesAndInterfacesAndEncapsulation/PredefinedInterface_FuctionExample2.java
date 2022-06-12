package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Function;

public class PredefinedInterface_FuctionExample2 {

	public static void main(String[] args) 
	{
		Function<String,Integer> f = x -> x.length();
		int len = f.apply("Welcome");
		System.out.println(len);
	}

}
