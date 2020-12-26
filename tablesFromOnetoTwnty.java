/**
 * tablesFromOnetoTwnty
 */
public class tablesFromOnetoTwnty {

    public static void main(String args[]) {
        for(int i=1;i<=20;i++)
        {   
            System.out.println("Table for "+i);
            System.out.println();
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+"  X  "+j+" = "+(i*j));
            }
            System.out.println("********************************************************");
        }
    }
}