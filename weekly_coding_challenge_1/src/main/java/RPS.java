import java.util.Locale;

public class RPS {
    public static void main(String[] args){

        System.out.println(rps("rocK", "papEr"));
        System.out.println(rps("papEr", "roCk"));
        System.out.println( rps("pAper", "sCissors"));
        System.out.println(rps("scissors", "Scissors"));
        System.out.println(rps("sciSSors", "Paper"));
        System.out.println(rps("google", "biNg"));
    }

    public static String rps(String p1, String p2){
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();
        if(p1.equals(p2)){
            return "TIE";
        }
        else if(p1.equals("rock") && p2.equals("scissors") || p1.equals("paper") && p2.equals("rock") || p1.equals("scissors") && p2.equals("paper")){
            return "Player One Wins!";
        }
        else if(p2.equals("rock") && p1.equals("scissors") || p2.equals("paper") && p1.equals("rock") || p2.equals("scissors") && p1.equals("paper")){
            return "Player Two Wins!";
        }
        else{
            return "Invalid Arguments";
        }

    }

}
