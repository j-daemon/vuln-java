import java.io.*;

public class VulnApp {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            String userCommand = args[0];
            // Intentional OS Command Injection
            Runtime.getRuntime().exec("ping -c 4 " + userCommand);
        }
    }
}
