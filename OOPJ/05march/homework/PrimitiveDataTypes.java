public class PrimitiveDataTypes {
    // Instance variables (class-level) to show default values
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        // Explicitly assigned values
        byte assignedByte = 10;
        short assignedShort = 200;
        int assignedInt = 1000;
        long assignedLong = 100000L;
        float assignedFloat = 10.5f;
        double assignedDouble = 99.99;
        char assignedChar = 'A';
        boolean assignedBoolean = true;

        // Display default values (only applicable for class-level variables)
        System.out.println("Default Values of Primitive Data Types (Class-Level):");
        System.out.println("Default byte: " + defaultByte);
        System.out.println("Default short: " + defaultShort);
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default long: " + defaultLong);
        System.out.println("Default float: " + defaultFloat);
        System.out.println("Default double: " + defaultDouble);
        System.out.println("Default char: '" + defaultChar + "' (empty space)");
        System.out.println("Default boolean: " + defaultBoolean);
        System.out.println();

        // Display assigned values
        System.out.println("Assigned Values of Primitive Data Types:");
        System.out.println("Assigned byte: " + assignedByte);
        System.out.println("Assigned short: " + assignedShort);
        System.out.println("Assigned int: " + assignedInt);
        System.out.println("Assigned long: " + assignedLong);
        System.out.println("Assigned float: " + assignedFloat);
        System.out.println("Assigned double: " + assignedDouble);
        System.out.println("Assigned char: " + assignedChar);
        System.out.println("Assigned boolean: " + assignedBoolean);
    }
}
