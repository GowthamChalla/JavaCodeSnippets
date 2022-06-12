package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.Function;

public class PredefinedInterface_FuctionExample1 
{
	public static void main(String[] args) 
	{
	  Function<Integer,Integer> f = x -> x*x*x;
	  int res = f.apply(10);
	  System.out.println(res);
	}
}
