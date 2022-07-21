package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
<<<<<<< HEAD
    public static int Task1(List<Integer> a, List<Integer> b) {

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < (a.size() - 1)) {
                sum = sum + a.get(b.get(i));
            }

        }
        return sum;

    }
=======
     public List<Integer> Task2(List<Integer> list) {
        int size = list.size(); //gets size of list
        if (list.isEmpty()){
            return list; //returns list if it's empty
        }
        else{
            for(int i =0; i<size;i++){ //loops through each element in list
                int element = list.get(i); //gets element at index
                String s = Integer.toString(element); //converts into to string
                if (s.length()==1){ //if lement only has one character it removes it from list 
                    list.remove(i);
                }
                else{
                    String split = s.substring(1, s.length() -1); //splits character from second character to end
                    int newElement = Integer.parseInt(split); // converts split string back to integer
                    list.add(i, newElement); //adds element at specified position
                }
        }
            return list;

     }
    }

    public static List<Integer> Task4(List<Integer> a, List<Integer> b)
    {
        List<Integer> c =new ArrayList<Integer>();  

        if(a.size() == b.size())
        {
            int listLength = a.size();
            int halfListSize = 0;
            
            for(int i=0; i < listLength; i++)
            {
                c.add(a.get(i) + b.get(listLength - 1 - i));
            }
            return c;
        }
        
        return null;
    }

>>>>>>> origin/g19h4806
}
