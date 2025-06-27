namespace ObjectInitializers
{
    internal class Program
    {
        static void Main()
        {
            Class1 o1 = new Class1();
            o1.Prop1 = 10;
            o1.Prop2 = 20;
            o1.Prop3 = 30;

            //object initializer syntax
            Class1 o2 = new Class1() { Prop1 = 10, Prop2 = 20, Prop3 = 30};
            Class1 o3 = new Class1 { Prop1 = 10, Prop2 = 20, Prop3 = 30};


    Console.WriteLine("Prop1: " + o1.Prop1); // Accessing the property
        }
    }

    public class Class1
    {
        public int Prop1 { get; set; } // auto-implemented property
        public int Prop2 { get; set; } // auto-implemented property
        public int Prop3 { get; set; }


    }
}
