class Fibonachi {
    public void fibonachi(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public void fibonachitillnumber(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        while (a < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
