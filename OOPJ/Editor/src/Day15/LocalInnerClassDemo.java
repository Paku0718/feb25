package Day15;

class OuterClass {
    void display() {
        // Local Inner Class inside display() method
        class LocalInner {
            void show() {
                System.out.println("Hello from Local Inner Class!");
            }
        }
        
        // Creating an instance of LocalInner and calling its method
        LocalInner inner = new LocalInner();
        inner.show();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        // Creating an instance of OuterClass and calling display()
        OuterClass outer = new OuterClass();
        outer.display();
    }
}

