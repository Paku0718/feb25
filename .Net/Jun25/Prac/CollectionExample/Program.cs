using System.Collections;

namespace CollectionExample
{
    internal class Program
    {
        //static void Main()
        //{
        //    ArrayList objArrayList = new ArrayList();
        //    objArrayList.Add("Paras");
        //    objArrayList.Add(10);
        //    objArrayList.Add(1.234);
        //    objArrayList.Add(true);

        //    objArrayList.Insert(0, "Inserted");
        //    //objArrayList.Insert(1, "John");
        //    objArrayList.RemoveAt(2);


        //    //foreach(object item in objArrayList)
        //    //{
        //    //    Console.WriteLine(item); 
        //    //}
        //    for (int item =0; item<objArrayList.Count; item++)
        //    {
        //        Console.WriteLine(objArrayList[item]);
        //    }


        //}

        //static void Main()
        //{
        //    ArrayList objArrayList = new ArrayList();
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");


        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");


        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.Add("a");
        //    Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //    objArrayList.TrimToSize();
        //    Console.WriteLine($"after trim Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        //}
        static void Main()
        {
            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(50, "Isha");
            objDictionary.Add(30, "Shriram");
            objDictionary.Add(10, "Shubham");
            objDictionary.Add(20, "Rohan");
            objDictionary.Add(40, "Ritik");

            objDictionary[60] = "Vikram";
            objDictionary[50] = "changed value";

            objDictionary.Remove(60); //key
            objDictionary.RemoveAt(0); //index

            foreach (DictionaryEntry item in objDictionary)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }

            objDictionary.GetByIndex(0); //value at index 0
            objDictionary.GetKey(0);//key at index 0
            IList keys = objDictionary.GetKeyList();
            IList value = objDictionary.GetValueList();

            //objDictionary.IndexOfKey(key);
            //objDictionary.IndexOfValue(value);

            ICollection keys2 = objDictionary.Keys;
            ICollection values2 = objDictionary.Values;

            //objDictionary.SetByIndex(index, value);

        }
    }
}
