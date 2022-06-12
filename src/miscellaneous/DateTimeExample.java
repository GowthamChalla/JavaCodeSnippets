package miscellaneous;

import java.time.LocalDate;
public class DateTimeExample {

	public static void main(String[] args)
	{
      LocalDate date = LocalDate.now();
      System.out.println(date.now());
      System.out.println(date.plusYears(10));
      System.out.println(date.plusMonths(1));
      System.out.println(date.plusWeeks(1));
      System.out.println(date.plusDays(1));
      System.out.println(date.minusYears(10));
      System.out.println(date.minusMonths(1));
      System.out.println(date.minusWeeks(1));
      System.out.println(date.minusDays(1));
   	}
}
