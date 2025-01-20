package Lambda;

interface addable{
    int addition(int a,int b);
}

class addableImpl implements addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class lambdaparameter {

    public static void main(String[] args)
    {
        addable addition = (int a,int b) -> (a+b);
      int result =  addition.addition(20,40);
      System.out.println(result);
    }

}
