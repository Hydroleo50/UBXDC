import java.util.Scanner;

public class binxdcon {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("XD TO BINARY CONVERTER");
        System.out.println("To convert from xd to binary, type 1");
        System.out.println("To convert from binary to xd, type 2");
        System.out.println("To convert a String to xd, type 3");
        System.out.println("To convert xd to String, type 4");
        System.out.print("Conversion type:");
        int d = scanner.nextInt();
        switch (d) {
            case 1: {
                System.out.println("(I am not done implementing multiple lines yet, so)");
                System.out.print("Type your String of 'xd's now, all into one line:");
                System.out.println(xdtoBinary());
                break;
            }
            case 2: {
                System.out.println("(I am not done implementing multiple lines yet, so)");
                System.out.print("Type your binary now, in one line:");
                System.out.println(binarytoXd());
                break;
            }
            case 3:
                //System.out.print("Type your String now:");
                    System.out.println("NOT IMPLEMENTED YET!!");
                    break;
            case 4:
                //System.out.print("Type your xd-binary now:");
                    System.out.println("NOT IMPLEMENTED YET!!");
                    break;
            default: System.out.println("Shit broke");
            break;
        }
    }

    public static String xdtoBinary()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        s = s.replace('x', '1');
        s = s.replace('d', '0');
        return s;
    }

    public static String binarytoXd()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        s = s.replace('1', 'x');
        s = s.replace('0', 'd');
        return s;
    }
}
