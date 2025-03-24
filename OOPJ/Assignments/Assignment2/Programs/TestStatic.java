class TestStatic {
    static {
        System.out.print("Static block initialized.");
    }

    public static void main(String[] args) {
        System.out.print("  Main method executed.");
    }
}