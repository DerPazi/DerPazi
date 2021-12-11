package at.pazi.gfc;

public class EuclidGCF {

    //calcualtes the greatest common factor of two positive integers using euclids algorithm
    public static int getGCF(int a, int b){
        //when both integers are 0 then the function will return 0
        if(a + b == 0)
            return 0;
        int r;
        while((r=a%b)!=0){
            a=b;
            b=r;
        }
        return b;
    }
}
