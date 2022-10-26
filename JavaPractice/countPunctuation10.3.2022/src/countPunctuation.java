import java.util.Scanner;
public class countPunctuation {
    public static void main(String[] args) {
        String text;
        System.out.println("Please enter your text.");
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();
        int l = text.length();
        int period=0, questionmark=0, exclamation_point=0,comma=0, semicolon=0, colon=0, dash=0, hyphen=0, brackets=0, quotation_marks=0; 
        for(int i=0; i<l; i++){
            switch(text.charAt(i)){
                case  '.':
                    period ++;
                    break;
                case '?':
                    questionmark ++;
                    break;
                case '!':
                    exclamation_point ++;
                    break;
                case ',':
                    comma ++;
                    break;
                case ';':
                    semicolon ++;
                    break;
                case ':':
                    colon ++;
                    break;
                case '—':
                    dash ++;
                    break;
                case '-':
                    hyphen ++;
                    break;
                case '(':
                    brackets ++;
                    break;
                case ')':
                    brackets ++;
                    break;
                case '"':
                    quotation_marks ++;
                    break;
            }
        }
        System.out.println("period '.' : " + period);
        System.out.println("questionmark '?' : " + questionmark);
        System.out.println("exclamation_point '!' : " + exclamation_point);
        System.out.println("comma ',' : " + comma);
        System.out.println("semicolon ';' : " + semicolon);
        System.out.println("colon ':' : " + colon);
        System.out.println("dash '—' : " + dash);
        System.out.println("hyphen '-' : " + hyphen);
        System.out.println("brackets '(' or ')' : " + brackets);
        System.out.println("quotation marks '\"' : " + quotation_marks);
    }
}
