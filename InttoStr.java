import java.util.*;
public class InttoStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        scan.nextLine();

        String s = Integer.toString(n);

        if(n == (Integer.parseInt(s))){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        scan.close();

        
    }
    
}
