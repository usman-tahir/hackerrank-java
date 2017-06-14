package introduction;

import java.util.*;
import java.security.*;

public class IntToString {

    class DoNotTerminate {
        public static class ExitTrappedException extends SecurityException {
            private static final long serialVersionUID = 1;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();

            String s = "" + n;

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!");
        }
    }
}