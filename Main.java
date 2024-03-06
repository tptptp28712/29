package Main;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	 String hobbys = scanner.nextLine();
	 // 昇順or降順
	 switch(hobbys){
	 case "昇順":
	  Ken.ken sub = new Ken.ken();
			sub.publicMethod();
	break;
	case "降順":
	     Ken.ken2 sub = new Ken.ken2();
			sub.publicMethod2();
	break;
	 }
    }
}
