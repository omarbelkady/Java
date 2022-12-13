```java
public class GCDeuclid{
    public static void logLn(Object o){
        System.out.println(o);
    }

    public static void main(String [] args){
        logLn(euclidgcd(1800,54));
    }

    public static int euclidgcd(int divid, int divis){
        //2526 56837 35
        /*
         * if divisor i.e. divis completely divid i.e. dividend
         * remain=0 i.e. therefore divis is the gcd
         * */
        int remain = divid%divis;
        if(remain==0){
            return divis;
        }

        return euclidgcd(divis,remain);
    }
}
```