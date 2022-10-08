import java.util.Scanner;
public class String_duplicatechar {

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char chararr[] = str.toCharArray();

        for(int i = 0;i< chararr.length ; i++)
        {

            for(int j = i+1; j < chararr.length; j++)
            {
                if (chararr[i]==chararr[j])
                {
                    System.out.println(chararr[i]);
                    chararr[j] = 0;
                }

            }

        }

    }
}
