namespace InheritanceExample1
{
    internal class Program
    {
        static void Main()
        {
            class o1 = new Class();
        }
    }

    public class BaseClass
    {
        public int A { get; set; }
    }
    public class Class : BaseClass
    {
        public int B { get; set; }
        public Class()
        {
            A = 10; // Accessing property from base class
            B = 20; // Accessing property from derived class
        }
}
    
}
