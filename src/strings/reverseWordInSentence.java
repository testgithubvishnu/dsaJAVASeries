package strings;

public class reverseWordInSentence {
    public static  void main(String[] args)
    {
        String str="Hey i am a Java programmer";
        String temp= "";
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                sb.append(str.charAt(i));
            }
            else {
               // String res=str.substring;
                sb.reverse();
                temp+=sb;
                temp+=" ";
                sb.delete(0,str.length());
            }
        }
       // sb.append(" ");
        sb.reverse();
        temp+=sb;
        System.out.println(temp);

    }
}
