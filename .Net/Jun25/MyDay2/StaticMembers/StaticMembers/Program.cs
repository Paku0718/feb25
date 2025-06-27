namespace StaticMembers
{
    internal class Program
    {
        static void Main()
        {
            Class1 o1 = new Class1() { i=10};
            Class1 o2 = new Class1() { i=20};
            //Class1.s_i = 12345;
            Class1.s_i= 12345; // static member can be accessed without an instance of the class
            Class1.StaticDisplay(); // static method can be called without an instance of the class

        }
    }

    public class Class1
    {
        public int i;
        //common data for the class - single copy
        public static int s_i;

        public void Display()
        {
            Console.WriteLine("Display");
            Console.WriteLine(i); // instance member can be accessed from instance method
            Console.WriteLine(s_i); // static member can be accessed from instance method

        }

        public static void StaticDisplay()
        {
            Console.WriteLine("StaticDisplay");
            //Console.WriteLine(i);//error - cannot access instance member from static context - object reference required
            Console.WriteLine(s_i);
        }

        private int prop1;
        public int Prop1
        {
            set
            {
                if (value > 100)
                    Console.WriteLine("invalid value");
                else
                    prop1 = value;
            }
            get
            {
                return prop1;
            }
        }

        private static int prop2;
        public static int Prop2
        {
            set
            {
                if (value > 100)
                    Console.WriteLine("invalid value");
                else
                    prop2 = value;
            }
            get
            {
                return prop2;
            }
        }


    }
}
