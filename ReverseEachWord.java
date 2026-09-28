import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            System.out.print(reverse + " ");
        }
        sc.close();
    }
}
output:
Enter a sentence: i love india
i evol aidni 
