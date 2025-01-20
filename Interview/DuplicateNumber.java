package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class D {

    public static void main(String[] args)
    {

        int arr[] = {2,3,2,4,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
            {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }

}
