import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("数当てゲームです。答えは2桁の自然数です。");
        Scanner scan = new Scanner(System.in);
        int num_ans = 53;
        int num_chance = 5;
        int num_in = 0;
        while(num_chance>0){
            while(true){
                try{
                    System.out.println("残りチャンス:"+num_chance);
                    num_in = scan.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("数字を入力してください");
                    scan.next();
                }
            }
            if (num_in == num_ans){
                System.out.println("当たり");
                System.exit(0);
            }
            else if (num_in-num_ans>=20){
                System.out.println("20以上小さく！");
            }
            else if (num_ans-num_in>=20){
                System.out.println("20以上大きく！");
            }
            else if (num_in > num_ans){
                System.out.println("もっと小さく！");
            }
            else{
                System.out.println("もっと大きく！");
            }
            System.out.println("");
            num_chance-=1;
        }
        System.out.println("残りチャンスが0となったので、失敗です。。");
        scan.close();
    }
}
