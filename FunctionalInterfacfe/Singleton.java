package FunctionalInterfacfe;

public class Singleton {

        private static Singleton instance ;

        private Singleton(){

        }

        public static Singleton getInstance(){
                if(instance == null)
                {
                        instance = new Singleton();
                }
                return instance;
        }

        public void showmessage()
        {
                System.out.println("Shreyansh is here");
        }

}

class Main{

        public static void main(String[] args)
        {
                Singleton singleton = Singleton.getInstance();
                singleton.showmessage();;
        }
}
