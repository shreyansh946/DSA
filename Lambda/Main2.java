package Lambda;

public class Main2
{
        public static void main(String[] args)
        {
            GenericClass<Integer> value = new GenericClass<Integer>(2);
            int number = value.getPrintValue();
            System.out.println(number);
        }
    
}
