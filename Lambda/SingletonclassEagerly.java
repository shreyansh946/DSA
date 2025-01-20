package Lambda;

public class SingletonclassEagerly {

    private static  final SingletonclassEagerly instance  = new SingletonclassEagerly();

    private SingletonclassEagerly(){

    }

    public static SingletonclassEagerly getInstance()
    {
        return instance;
    }
    public void showMessage()
    {
        System.out.println("Singleton instance method called.");
    }
}


class Main{
        public static void main(String[] args)
        {
            SingletonclassEagerly singletonclassEagerly =  SingletonclassEagerly.getInstance();
            singletonclassEagerly.showMessage();
        }

}
