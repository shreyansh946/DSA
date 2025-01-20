class SingletonClass {

    private int value;

    // Private static instance of the class
    private static SingletonClass instance;

    // Private constructor to prevent instantiation
    private SingletonClass() {}

    // Public method to get the single instance of the class
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // Setter and getter for the value
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        SingletonClass singleValue = SingletonClass.getInstance();

        // Set the value
        singleValue.setValue(10);

        // Get and print the value
        System.out.println("Value: " + singleValue.getValue());
    }
}
