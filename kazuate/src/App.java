import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int keyNum = 36;
        for(int i = 0; i < 5; i++){
            System.out.println("10以上99以下の整数を予想してください．>");
            int guessNum = scan.nextInt();
            if(guessNum == keyNum){
                System.out.println("正解です!");
                break;
            }
            else if (guessNum > keyNum){
                System.out.println("答えは，" + guessNum + "より小さいです．");
            }
            else if (guessNum < keyNum){
                System.out.println("答えは，" + guessNum + "より大きいです．");
            }
            if(Math.abs(guessNum - keyNum) >= 20){
                System.out.println("答えは，" + guessNum + "と20以上離れています");
            }
            else{
                System.out.println("答えと" + guessNum + "との差は20未満です");
            }
        }
    }
}
