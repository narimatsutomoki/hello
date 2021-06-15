import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("数当てゲーム");
        Scanner scan = new Scanner(System.in);
        int num_chance = 5;
        int num = 53;
        while(num_chance>0){
            System.out.println("残りチャンス:"+num_chance);
            int num_in = scan.nextInt();
            if (num_in == num){
                System.out.println("当たり");
                System.exit(0);
            }
            else if (num_in-num>=20){
                System.out.println("20以上小さく！");
            }
            else if (num-num_in>=20){
                System.out.println("20以上大きく！");
            }
            else if (num_in > num){
                System.out.println("もっと小さく！");
            }
            else{
                System.out.println("もっと大きく！");
            }
            System.out.println("");
            num_chance-=1;
        }
        
        scan.close();
    }
}
