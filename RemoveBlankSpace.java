public class RemoveBlankSpace {

    public static void main(String [] args)
    {
        String str = "j  a  va   st   a    r";

        String trimmedstr = str.replaceAll("\\s","");

        System.out.println(trimmedstr);
    }
}
