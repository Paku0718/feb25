namespace prac
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //IntegerStack intStack = new IntegerStack(5);
            //intStack.Push(10);
            //intStack.Push(20);
            //Console.WriteLine(intStack.Pop()); // Outputs: 20

            MyStack<int> o1 = new MyStack<int>(3);
            o1.Push(10);
            o1.Push(20);
            o1.Push(30);
            Console.WriteLine(o1.Pop());
            Console.WriteLine(o1.Pop());
            Console.WriteLine(o1.Pop());

            MyStack<string> o2 = new MyStack<string>(3);
            o2.Push("Hello");
            o2.Push("World");
            o2.Push("Generics");
            Console.WriteLine(o2.Pop());
            Console.WriteLine(o2.Pop());
            Console.WriteLine(o2.Pop());


        }
    }
    class IntegerStack
    {
        int[] arr;

        public IntegerStack(int Size)
        {
            arr = new int[Size];
        }
        int Pos = -1;
        
        public void Push(int i)
        {
            if(Pos == (arr.Length - 1))
            {
                throw new Exception("Stack is Full");
            }
            arr[++Pos] = i;
        }

        public int Pop() {
            if (Pos == -1) 
            {
                throw new Exception("Stack is Empty");
            }
            return arr[Pos--];
        }
    }

    class StringStack
    {
        String[] arr;

        public StringStack(int Size) 
        {
            arr = new String[Size];
        }

        int Pos=-1;
        public void Push(String i)
        {
            if(Pos == (arr.Length - 1))
            {
                throw new Exception("Stack is full");
            }
            arr[++Pos] = i;
        }
        public String Pop()
        {
            if (Pos == -1)
            {
                throw new Exception("Stack is empty");
            }
            return arr[Pos--];
        }
    }

    class MyStack<T>
    {
        T[] arr;

        public MyStack(int Size)
        {
            arr = new T[Size];
        }
        int Pos = -1;

        public void Push(T i)
        {
            if(Pos == (arr.Length - 1))
            {
                throw new Exception("Stack is Full");
            }
            arr[++Pos] = i;
        }

        public T Pop()
        {
            if(Pos == -1)
            {
                throw new Exception("Stack is empty");
            }
            return arr[Pos--];
        }
    }
}
