package Lambda;

public class SingleLazy {

    private static SingleLazy instance;

    private SingleLazy() {
    }

    public static SingleLazy getInstance() {
        if (instance == null) {
            instance = new SingleLazy();
        }
        return instance;

    }
        public void showMessage ()
        {
            System.out.println("Singleton instance method called.");
        }
}

class Main1 {
    public static void main(String[] args) {
        SingleLazy singleton = SingleLazy.getInstance();
        singleton.showMessage();
    }
}