namespace FieldsAndProperties
{
    internal class Program
    {
        //static void Main()
        //{
        //    Class1 obj = new Class1();
        //    //obj.i = 12345;
        //    //Console.WriteLine(obj.i); // Accessing the field of Class1
            
            
        //    //obj.Seti(101); // Setting a valid value
        //    //Console.WriteLine(obj.Geti());
        
        //    obj.Prop1 = 10; // Setting a valid value
        //    Console.WriteLine(obj.Prop1); // Accessing the property
        //}
        static void Main1() 
        { 
            
        }

        static void Main()
        {
            Class1 obj = new Class1();
            obj.Prop4 = 'a'; // Setting a value to the auto-implemented property
            //obj.i = 12345; // Accessing the field of Class1
            //Console.WriteLine(obj.i); // Accessing the field of Class1

        }
    }

    public class Class1
    {
        //private int i; // field - class level variable
        //public void Seti(int VALUE)
        //{
        //    if (VALUE < 100)
        //    {
        //        i = VALUE;
        //    }
        //    else { 
        //        Console.WriteLine("invalid i");
        //    }
        //}
        //public int Geti()
        //{
        //    return i;
        //}


        private int prop1;
        public int Prop1
        {
            set 
            {
                if (value < 100)
                    prop1 = value;
                else
                    Console.WriteLine("invalid prop1");
            }
            get 
            {
                return prop1;
            }
        }

        private string prop2;
        public string Prop2
        {
            set
            {
                    prop2 = value;
            }
            get
            {
                return prop2;
            }
        }

        public string Prop3;
        //automatic property /auto-implemented property
        //When there is no validation logic, we can use auto-implemented properties
        //The compiler automatically creates a private, anonymous field that can only be accessed through the property's get and set accessors.
        public int Prop4 { get; set; } // auto-implemented property

        //TODO - create a read-only property(only get accessor) that returns the current date and time
    }
}
