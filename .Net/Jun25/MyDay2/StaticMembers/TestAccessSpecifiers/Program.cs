namespace TestAccessSpecifiers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }

    public class BaseClass
    {
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
    }

    public class DerivedClass : BaseClass
    {
        public void AccessMembers()
        {
            PUBLIC = 1; // Accessible
            // PRIVATE = 2; // Not accessible
            PROTECTED = 3; // Accessible
            INTERNAL = 4; // Accessible
            PROTECTED_INTERNAL = 5; // Accessible
            // PRIVATE_PROTECTED = 6; // Not accessible in this context
        }
    }
}
