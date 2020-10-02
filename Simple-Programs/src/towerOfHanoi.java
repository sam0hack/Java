import java.util.*;
class tOHanoi
{
    void recur(int n,int s,int m,int d)
    {
        if(n==1)
        {
            System.out.println("Move disc "+n+" from "+s+"->"+d);
        }
        else
        {
            recur(n-1,s,d,m);
            System.out.println("Move disc "+n+" from "+s+"->"+d);
            recur(n-1,m,s,d);
        }
    }
    void main(int n)
    {
        tOHanoi obj=new tOHanoi();
        obj.recur(n,1,2,3);
    }
}