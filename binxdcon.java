import java.util.*;
import java.util.stream.Collectors;

public class binxdcon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("XD TO BINARY CONVERTER");
        System.out.println("To convert from xd to binary, type 1");
        System.out.println("To convert from binary to xd, type 2");
        System.out.println("To convert a String to xd, type 3");
        System.out.println("To convert xd to String, type 4");
        System.out.print("Conversion type:");

            try {
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
                    case 3: {
                        System.out.println("(I am not done implementing multiple lines yet, so)");
                        System.out.print("Type your String now, in one line:");
                        System.out.println(convertStringToXD());
                        break;
                    }
                    case 4: {
                        System.out.println("(I am not done implementing multiple lines yet, so)");
                        System.out.print("Type your xd-binary now, in one line:");
                        System.out.println(convertXDtoString());
                        break;
                    }
                    default:
                        System.out.println("Shit broke");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Usage: Just type the number 1, 2, 3 or 4 depending on what you need to do.");
            }
    }

    public static String xdtoBinary() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        s = s.replace('x', '1');
        s = s.replace('d', '0');
        return s;
    }

    public static String binarytoXd() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        s = s.replace('1', 'x');
        s = s.replace('0', 'd');
        return s;
    }

    public static String convertStringToXD() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char aChar : chars) {
            result.append(String.format("%8s", Integer.toBinaryString(aChar)).replaceAll(" ", "0"));
        }

        String s = result.toString();
        s = prettyXDnary(s, 8, " ");
        s = s.replace('1', 'x');
        s = s.replace('0', 'd');
        return s;
    }

    public static String convertXDtoString() {

        try {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace('x', '1');
        input = input.replace('d', '0');
        String[] parts = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            int val = Integer.parseInt(part, 2);
            String c = Character.toString(val);
            sb.append(c);
        }
            return sb.toString();
        }
        catch(NumberFormatException e) {
            System.out.println("Error, check if characters other than 'x' or 'd' are present, and remove them.");
            System.out.println("Also, make sure the Input format is correct.");
            System.out.println("Input format: xddxdxxd xddxddxd (...)");}
        return "Process terminated";
    }
    public static String prettyXDnary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }
        return result.stream().collect(Collectors.joining(separator));
    }
}
// THERE ARE NO COMMENTS ; THE CODE IS THE COMMENT! !!!! !!
// that's a joke. there are no comments because the finished tasks are trivial
// there will be comments for more complex stuff, probably