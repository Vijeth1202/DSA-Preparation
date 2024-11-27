import java.util.List;

public class BirthDayCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int num=0;
        int tallest=Integer.MIN_VALUE;
        
        for(int i=0;i<candles.size();i++)
        {
            if(candles.get(i)==tallest )
            {
                
                num++;
            }
            if(candles.get(i)>tallest)
            {
                tallest=candles.get(i);
                num=1;
            }
        }
        return num;
    }

}
