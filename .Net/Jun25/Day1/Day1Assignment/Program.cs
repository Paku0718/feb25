namespace Day1Assignment
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee(1, "Paras", 123465, 10);
            Employee o2 = new Employee(1, "Paras", 123465);
            Employee o3 = new Employee(1, "Paras");
            Employee o4 = new Employee(1);

            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.WriteLine(o3);
            Console.WriteLine(o4);
        }
    }

    public class Employee 
    {
        private string name;
        private int empNo;
        private decimal basic;
        private short deptNo;

        public string Name
        {
            get { return name; }
            set 
            { 
                if (string.IsNullOrWhiteSpace(value))
                {
                    throw new ArgumentException("Name cannot be null or empty.");
                }
                name = value;
            }
        }

        public int EmpNo
        {
            get { return empNo; }
            set 
            { 
                if (value <= 0)
                {
                    throw new ArgumentException("Employee number must be greater than zero.");
                }
                empNo = value; 
            }
        }
        public decimal Basic
        {
            get { return basic; }
            set 
            { 
                if (value < 10000 || value > 200000)
                {
                    throw new ArgumentException("Basic Salary must be between 10000 and 200000.");
                }
                basic = value; 
            }
        }
        public short DeptNo
        {
            get { return deptNo; }
            set 
            { 
                if (value <= 0)
                {
                    throw new ArgumentException("Department number must be greater than zero.");
                }
                deptNo = value; 
            }
        }

        //method to calculate net salary
        public decimal GetNetSalary()
        {
            return Basic + (Basic * 0.4m) + (Basic * 0.2m); // Assuming a fixed 20% HRA for simplicity
        }

        //Constructor to initialize properties
        public Employee(int empNo=1, string name="Default name", decimal basic=20000, short deptNo=2)
        {
            EmpNo = empNo;
            Name = name;
            Basic = basic;
            DeptNo = deptNo;
        }

        public Employee(int empNo, string name, decimal basic) : this(empNo, name, basic, 1) { }
        public Employee(int empNo, string name) : this(empNo, name, 10000, 1) { }
        public Employee(int empNo) : this(empNo, "Unknown", 10000, 1) { }
        public Employee() : this(0, "Unknown", 10000, 1) { } // Default constructor

        // Optional: override ToString for display
        public override string ToString()
        {
            return $"EmpNo: {EmpNo}, Name: {Name}, Basic: {Basic}, DeptNo: {DeptNo}, Net Salary: {GetNetSalary()}";
        }

    }
}
