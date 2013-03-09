import java.util.Random;

public class RandomTest {
	public static String randomString(int i)
    {
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        for (int n = 0; ; n++)
        {
            int k = ran.nextInt(27);
            
            if (k == 0)
                break;
 
            sb.append((char)('`' + k));
            System.out.println('a'+1-1);
        }
 
        return sb.toString();
    }
 
    public static void main(String[] args){
        System.out.println(randomString(-229985452)+" "+randomString(-147909649));
    }
}
