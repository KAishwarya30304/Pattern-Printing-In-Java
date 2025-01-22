package pat_print;
import java.util.*;
public class ch_pat {
	public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter a charater value for string1: ");
      char str1=scanner.next().charAt(0);
      System.out.println("enter a charater value for string2: ");
      char str2=scanner.next().charAt(0);
for(char i=str1;i<=str2;i++) {
	for(char j=str1;j<=i;j++)
	 {
		System.out.print(j);
	}
	System.out.println();
}
}
}


