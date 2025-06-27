namespace ExceptionHandling
{
    internal class Program
    {
        static void Main()
        {
            class1 obj = new class1();
            try
            {
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100/x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exception occured");
            }
            catch
            {
                Console.WriteLine("Exception Occured");
            }
            Console.WriteLine("code after try");

        }

        public class class1
        {
            private int p1;
             
            public int P1
            {
                get { return p1; }
                set { p1 = value; }
            }
        }
    }
}
