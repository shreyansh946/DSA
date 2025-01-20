package FunctionalInterfacfe;

public class GenericClass<T> {

    private T value;

    public GenericClass(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Box{" + "value=" + value +'}';
    }

    public static void main(String[] args)
    {
        GenericClass<Integer> genericClass = new GenericClass<>(123);

        System.out.println(genericClass.getValue());
    }





}
