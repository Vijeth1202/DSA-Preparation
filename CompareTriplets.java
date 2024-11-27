import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
                int al=0,bo=0;
                
                for(int i=0,j=0;i<a.size()&& j<b.size();i++,j++)
                {
                    if(a.get(i)>b.get(j))
                        al++;
                    else if(a.get(i)<b.get(j))
                        bo++;      
                }
                
            return Arrays.asList(al,bo); 
                
        }    
}
    

