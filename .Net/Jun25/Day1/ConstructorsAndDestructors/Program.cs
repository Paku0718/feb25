namespace ConstructorsAndDestructors
{
    internal class Program
    {
        static void Main()
        {
            Class1 obj = new Class1(); // Creating an instance of Class1
            obj.Prop1 = 10; // Setting a value to the property
            Console.WriteLine("Prop1: " + obj.Prop1); // Accessing the property
            Console.WriteLine("Prop2: " + obj.Prop2); // Accessing the property
            Console.WriteLine("Prop3: " + obj.Prop3); // Accessing the property

            Class1 obj2 = new Class1(); // Creating another instance of Class1
            obj2.Prop1 = 20; // Setting a value to the property
            Console.WriteLine("Prop1 of obj2: " + obj2.Prop1); // Accessing the property of the second instance
            Console.WriteLine("Prop2 of obj2: " + obj2.Prop2); // Accessing the property of the second instance
            Console.WriteLine("Prop3 of obj2: " + obj2.Prop3); // Accessing the property of the second instance

        }
    }

    public class Class1
    {
        public int Prop1 { get; set; } // auto-implemented property
        public int Prop2 { get; set; }
        
        public int Prop3 { get; set; }

        public Class1() // Default constructor
        {
            Console.WriteLine("Default constructor called");
        }


        //public Class1() //constructor
        //{
        //    Console.WriteLine("con call");
        //    Prop1 = 1;
        //    Prop2 = 2;
        //    Prop3 = 3;
        //}

        //public Class1(int Prop1, int Prop2, int Prop3)
        //{
        //    Console.WriteLine("Parameterized constructor called with values: " + Prop1 + ", " + Prop2 + ", " + Prop3);
        //    this.Prop1 = Prop1;
        //    this.Prop2 = Prop2;
        //    this.Prop3 = Prop3;
        //}


        public Class1(int Prop1=1, int Prop2=2, int Prop3 = 3)
        {
            Console.WriteLine("cons called");
            this.Prop1 = Prop1;
            this.Prop2 = Prop2;
            this.Prop3 = Prop3;
        }


        // Destructor (finalizer)
        //~public Class1() // Destructor
        //{
        //    Console.WriteLine("Destructor called");
        //}
    }
}
