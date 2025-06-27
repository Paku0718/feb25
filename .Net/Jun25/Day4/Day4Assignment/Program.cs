using System.Runtime.ConstrainedExecution;

namespace Day4Assignment
{
    internal class Program
    {
        static void Main()
        {
            Manager m = new Manager("Alice", 10, "HR Manager", 20000);
            Console.WriteLine($"Manager Salary: {m.CalcNetSalary()}");

            GeneralManager gm = new GeneralManager("Bob", 20, "GM Operations", 30000, "Car, Stock Options");
            Console.WriteLine($"General Manager Salary: {gm.CalcNetSalary()}");

            CEO ceo = new CEO("Charlie", 30, 60000);
            Console.WriteLine($"CEO Salary: {ceo.CalcNetSalary()}");
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public abstract class Employee : IDbFunctions
    {
        private static int empCounter = 1;

        public string Name
        {
            get => name;
            set
            {
                if (string.IsNullOrWhiteSpace(value))
                    throw new ArgumentException("Name cannot be blank.");
                name = value;
            }
        }
        private string name;

        public readonly int EmpNo;

        public short DeptNo
        {
            get => deptNo;
            set
            {
                if (value <= 0)
                    throw new ArgumentException("DeptNo must be greater than 0.");
                deptNo = value;
            }
        }
        private short deptNo;

        public abstract decimal Basic { get; set; }

        public abstract decimal CalcNetSalary();

        public Employee(string name, short deptNo)
        {
            EmpNo = empCounter++;
            Name = name;
            DeptNo = deptNo;
        }

        public abstract void Insert();
        public abstract void Update();
        public abstract void Delete();
    }

    public class Manager : Employee
    {
        private string designation;

        public string Designation
        {
            get => designation;
            set
            {
                if (string.IsNullOrWhiteSpace(value))
                    throw new ArgumentException("Designation cannot be blank.");
                designation = value;
            }
        }

        private decimal basic;

        public override decimal Basic
        {
            get => basic;
            set
            {
                if (value < 10000 || value > 50000)
                    throw new ArgumentException("Basic must be between 10,000 and 50,000 for Manager.");
                basic = value;
            }
        }

        public Manager(string name, short deptNo, string designation, decimal basic)
            : base(name, deptNo)
        {
            Designation = designation;
            Basic = basic;
        }

        public override decimal CalcNetSalary()
        {
            return Basic + (0.3m * Basic); // Simple example
        }

        public override void Insert() => Console.WriteLine("Insert Manager to DB");
        public override void Update() => Console.WriteLine("Update Manager in DB");
        public override void Delete() => Console.WriteLine("Delete Manager from DB");
    }


    public class GeneralManager : Manager
    {
        public string Perks { get; set; }

        private decimal basic;

        public override decimal Basic
        {
            get => basic;
            set
            {
                if (value < 20000 || value > 70000)
                    throw new ArgumentException("Basic must be between 20,000 and 70,000 for General Manager.");
                basic = value;
            }
        }

        public GeneralManager(string name, short deptNo, string designation, decimal basic, string perks)
            : base(name, deptNo, designation, basic)
        {
            Perks = perks;
            Basic = basic;
        }

        public override decimal CalcNetSalary()
        {
            return Basic + (0.5m * Basic); // Different logic
        }

        public override void Insert() => Console.WriteLine("Insert GeneralManager to DB");
        public override void Update() => Console.WriteLine("Update GeneralManager in DB");
        public override void Delete() => Console.WriteLine("Delete GeneralManager from DB");
    }


    public class CEO : Employee
    {
        private decimal basic;

        public override decimal Basic
        {
            get => basic;
            set
            {
                if (value < 50000)
                    throw new ArgumentException("Basic must be at least 50,000 for CEO.");
                basic = value;
            }
        }

        public CEO(string name, short deptNo, decimal basic)
            : base(name, deptNo)
        {
            Basic = basic;
        }

        public sealed override decimal CalcNetSalary()
        {
            return Basic + (0.8m * Basic); // Highest allowance
        }

        public override void Insert() => Console.WriteLine("Insert CEO to DB");
        public override void Update() => Console.WriteLine("Update CEO in DB");
        public override void Delete() => Console.WriteLine("Delete CEO from DB");
    }



}
