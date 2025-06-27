namespace ClassBasics
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello, World!");
            System.Console.WriteLine("aa");
            System.Console.WriteLine("h w");

            Class1 obj;
            obj = new Class1();
            obj.Display("Paras");

            Console.WriteLine(obj.Add(10, 20, 30));
            Console.WriteLine(obj.Add(10, 20));
            Console.WriteLine(obj.Add(10));
            Console.WriteLine(obj.Add());


            //named parameters
            Console.WriteLine(obj.Add(b: 20, a: 10, c: 30));
            Console.WriteLine(obj.Add(c: 30, a: 10));
            Console.WriteLine(obj.Add(a: 10));

            obj.DoSomething1();

        }
    }
}
namespace Payroll
{
    public class Employee { }
    public class Manager { }
    public class Department { }
}
public class Class1
{
    public void Display(string abc)
    {
        System.Console.WriteLine("Hello class 1" + abc);
    }

    //public int Add(int a, int b)
    //{
    //    return a + b;
    //}

    public int Add(int a = 0, int b = 0, int c = 0)
    {
        return a + b + c;
    }

    public void DoSomething1()
    {
        int i = 100; // local variable
        Console.WriteLine(i);
        DoSomething2();
        Console.WriteLine(i);

        void DoSomething2()//local function
        {
            Console.WriteLine(++i);
        }

        //void DoSomething2(string s) //error - cannot overload a local func
        //{
        //    //local func can access local variables declared in the outer function
        //    Console.WriteLine(++i);
        //}

        static void DoSomething3()
        {
            //static local func CANNOT access local variables declared in the outer function
            //Console.WriteLine(++i); //error
        }


    }
}


namespace Cricket
    {
    public class Player { }
    public class Manager { }
}

namespace n1
{
    namespace n2
    {
               public class C1 { }
    }
}