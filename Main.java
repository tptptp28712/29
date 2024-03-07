package Main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
			String hobbys = scanner.nextLine();
			  Ken.ken sub = new Ken.ken();
			 // 昇順or降順
			 switch(hobbys){
			 case "昇順":
					sub.publicMethod();
			break;
			case "降順":
					sub.publicMethod2();
			break;
			 }
		}
    }
}
