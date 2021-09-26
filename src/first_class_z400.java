import javax.swing.*;
import java.util.Scanner;

public class first_class_z400 {

    public static void main(String[] args){

        System.out.println("Witaj świecie! ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Witaj "+name);
        JOptionPane.showMessageDialog(null, name);

    }


}
