import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- ICT Tip With DIL: KB to Byte Converter ---");
        System.out.print("Enter value in Kilobytes (KB): ");
        
        double kb = input.nextDouble();
        double bytes = kb * 1024; // 1 KB = 1024 Bytes

        System.out.println(kb + " KB is equal to " + bytes + " Bytes.");
        System.out.println("Happy Learning!");
        
        input.close();
    }
}