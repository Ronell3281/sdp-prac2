package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public static int Task1(List<Integer> a, List<Integer> b) {

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < (a.size())) {
                sum = sum + a.get(b.get(i));
            }

        }
        return sum;

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
    public static boolean Task3 (String inp) {
        char[] ch = new char[inp.length()];
        for (int i = 0; i <= ch.length(); i++){
            if (ch[i] == '('){
                char lbrace = ch[i];
                while (lbrace){
                    if (ch[i++] != ')'){
                        return false;
                    }else{
                        return true;
                    }
                }
            }
        }
    }

}
