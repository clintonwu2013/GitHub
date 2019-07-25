package tw.tsunglin.test;

public class ArraySplit 
{
    public static void main( String[] args )
    {
        String str= "a,b,c,d,e,f,g";
        String[] array = str.split(",");
        
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]+"1");
        }
    }
}
