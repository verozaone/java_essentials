import java.util.Arrays;

public class MainArgsExample {
    public static void main(String[] args) {
        if (args.length > 0) {

            System.out.println("Arguments array: "+Arrays.toString(args));
            System.out.println(args.length + " Arguments provided!");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were passed to the program.");
        }
    }
}