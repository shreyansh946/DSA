package Lambda;

public class GenericClass<T> {

      private  T value;

      public GenericClass(T value)
      {
          this.value = value;
      }


        public T getPrintValue(){
            return value;
        }

        public void setPrintValue(T value)
        {
            this.value   = value;
        }


}

