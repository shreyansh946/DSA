package Oops;

public abstract class Abrtract {

        private String name;

        public Abrtract(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void eat(){
            System.out.println(name +"is eating");
        }

    // Abstract method
     public abstract void makeSound();
}


