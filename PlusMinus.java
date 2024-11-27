import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
            int n=arr.size();
            float pos=0,neg=0,zero=0;
            
            for(int i=0;i<n;i++)
            { int ele=arr.get(i);
                if(ele>0)
                    pos++;
                else if(ele<0)
                    neg++;
                else if(ele==0)
                    zero++;
                   
            }
           
            System.out.printf("%1.6f %n",pos/n);
            System.out.printf("%1.6f %n",neg/n);
            System.out.printf("%1.6f %n",zero/n);
    }
}
