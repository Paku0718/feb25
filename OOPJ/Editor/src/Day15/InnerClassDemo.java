package Day15;

class OuterClass1 {
    // Inner Class inside OuterClass
    class InnerClass {
        void show() {
            System.out.println("Hello from Inner Class!");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass1 outer = new OuterClass1();
        
        // Creating an instance of InnerClass using OuterClass instance
        OuterClass1.InnerClass inner = outer.new InnerClass();
        
        // Calling method of InnerClass
        inner.show();
    }
}
