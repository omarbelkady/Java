public class Explicitcasting
{
    public static void main(String [] args)
    {
            String x= "1";
            Integer.parseInt(x)+2;//integer wrapper class for int primitive type
            String d= "4.1";			
            //CASTING SYNTAX: Float/double/String/Short/char.parseFloat/parseDouble/parseString/parseShort/parseChar
            //datatypeyouwanttoconvertto.parsedatatypeyouwanttoconvertto(nameofvariable)
            double n = Double.parseDouble(d)+2;
            System.out.println(n);
    }
}
