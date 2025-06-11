package Arrays;

/*import java.util.Arrays;
import java.util.LinkedList;
public class MissingCharacter
{
    public static void main(String[] args) {
            char ch[] = {'a', 'z'};
            Arrays.sort(ch);
            LinkedList<Character> l1 = new LinkedList<>();
            for (char i = 'a'; i <= 'z'; i++) {
                boolean flag= false;
                for (int j = 0; j < ch.length; j++) {
                    if (i == ch[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag==true) {
                    l1.add(i);
                }
            }
            System.out.println("Missing characters: " + l1);
        }
    }   */
//output= Missing characters: [b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y]



public class MissingCharacter
{
    public static void main(String[] args)
    {
        char ch[] = {'a', 'b', 'c','d'};
        char choice = 'a';
        char result = ' ';

        for (int i = 0; i < ch.length; i++)
        {
            if (choice != ch[i])
            {
                result = choice;
                break;
            }
            choice++;
        }
        System.out.println(result);
    }
}
