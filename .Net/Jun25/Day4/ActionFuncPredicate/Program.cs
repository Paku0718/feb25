using System.Collections;
using System.Linq;
using System.Text.Json;
using System.Threading.Channels;

namespace ActionFuncPredicate;

internal class Program
{
//    static void Main()
//    {
//        Action o1 = Display;
//        o1();

//        Action<string> o2 = Display;
//        o2("aaaa");

//        Action<string, int> o3 = Display;
//        o3("aaa", 123);

//        List <Employee> e= new List<Employee>
//        {
//            new Employee { EmpNo = 1, Basic = 5000 },
//            new Employee { EmpNo = 2, Basic = 15000 },
//            new Employee { EmpNo = 3, Basic = 20000 }
//        };

//        e.Add(new()
//        {
//            EmpNo = 4, Basic = 12000,
//        });

//        e.Contains(new()
//        {
//            EmpNo = 4,
//            Basic = 12000,
//        });

//        e.ForEach(emp => Console.WriteLine($"EmpNo: {emp.EmpNo}, Basic: {emp.Basic}"));

//        //    Func<int, int> o2 = MakeDouble;
//        //    Console.WriteLine(o2(10));

//        //    Func<int, int, int> o3 = Add;
//        //    Console.WriteLine(o3(10,5));

//        //    Func<int, bool> o4 = IsEven;
//        //    Console.WriteLine(o4(10));

//        //    Predicate<int> o5 = IsEven;
//        //    Console.WriteLine(o5(10));

//        //    Employee emp = new Employee { EmpNo = 1, Basic = 5000 };
//        //    Func<Employee, bool> o6 = IsBasicGreaterThan10000;
//        //    Console.WriteLine(o6(emp));

//        //    Predicate<Employee> o7 = IsBasicGreaterThan10000;
//        //    Console.WriteLine(o7(emp)); ;
//        //}
//        static bool IsBasicGreaterThan10000(Employee emp)
//    {
//        if (emp.Basic > 10000)
//            return true;
//        else
//            return false;
//    }
//    static int MakeDouble(int a)
//    {
//        return a * 2;
//    }
//    static string GetTime()
//    {
//        return DateTime.Now.ToLongTimeString();
//    }
//    static bool IsEven(int a)
//    {
//        if (a % 2 == 0)
//            return true;
//        else
//            return false;
//    }
//    static int Add(int a, int b)
//    {
//        return a + b;
//    }
//    static void Display()
//    {
//        Console.WriteLine("Display");
//    }
//    static void Display(string s)
//    {
//        Console.WriteLine("Display" + s);
//    }
//    static void Display(string s, int i)
//    {
//        Console.WriteLine("Display" + s + i);
//    }
//}

    static void Main()
    {
        var students = new List<Student>
{
    new Student { Name = "Alice", Age = 20 },
    new Student { Name = "Alice", Age = 20 },
    new Student { Name = "Alice", Age = 20 },
    new Student { Name = "Bob", Age = 21 },
    new Student { Name = "Charlie", Age = 20 },
    new Student { Name = "Charlie", Age = 20 },
    new Student { Name = "Charlie", Age = 20 },
    new Student { Name = "David", Age = 22 },
    new Student { Name = "David", Age = 22 },
    new Student { Name = "David", Age = 22 },
    new Student { Name = "David", Age = 22 },
    new Student { Name = "Eva", Age = 21 },
};

        var groupResult = students
    .GroupBy(s => new { s.Age, FirstLetter = s.Name[0] });
      var result = groupResult.Select(g => new
      {
          g.Key.Age,
      
      });

    Console.WriteLine(JsonSerializer.Serialize(result));
    }

    public class Employee
{
    public int EmpNo { get; set; }
    public decimal Basic { get; set; }

}


}

public class Student
{
    public string Name { get; set; }
    public int Age { get; set; }
}


