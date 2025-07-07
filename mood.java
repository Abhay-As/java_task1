import java.util.HashMap;
import java.util.Scanner;
public class mood{
    public static void main(String[]args){
        HashMap<String, String> moodMap = new HashMap<>();
        moodMap.put("happy", "😊 Stay positive!");
        moodMap.put("sad", "😢 It's okay to feel down sometimes.");
        moodMap.put("tired", "😴 Get some rest!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How are you feeling today? ");
        String mood = scanner.nextLine().toLowerCase();

        if (moodMap.containsKey(mood)) {
            System.out.println(moodMap.get(mood));
        } else {
            System.out.println("Hmm, I don't know that mood. Try 'happy', 'sad', or 'tired'!");
        }

        scanner.close();

    }
}

