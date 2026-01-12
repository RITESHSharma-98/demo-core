public class star {
    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int f = 0;

    public static void printStar2(int m) {
        for (int i = 1; i <= m; i++) {
            f = i;
            int n=m;
            i = (i <= n / 2) ? (i) : (n - i + 1);
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

            i = (f <= n / 2) ? (i) : (n - i + 1);
        }
    }

    public static void printStar3(int n) {
        for (int i = 1; i <= n; i++) {
            f = i;
            i = (i <= n / 2) ? (i) : (n - i + 1);
            for (int c = 1; c <= 2; c++) {
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (i - 1); j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n-i); j++) {
                    System.out.print(" ");
                }

            }
            System.out.println();

            i = (f <= n / 2) ? (i) : (n - i + 1);
        }
    }
}
