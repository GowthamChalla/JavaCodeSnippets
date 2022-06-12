package AbstractClassesAndInterfacesAndEncapsulation;
import java.util.function.*;

public class Sample 
{
	public static void main(String[] args) 
	{
	   Supplier<Integer> f = () -> 39;
       System.out.println(f.get());
	}
}
