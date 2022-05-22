import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value, count = 0, sum = 0;
        double average;
        System.out.print("Hangi sayıya kadar 3 ve 4 e tam olarak bölünen sayıların ortalamasını bulmak istersiniz : ");
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        if(value>=0){
            for(int i=1;i<=value;i++){
                if(i%3==0 && i%4==0){
                    count++;
                    sum += i;
                }
            }average = (double)sum/count;
            System.out.println(value+" değerine kadar  3 ve 4 e tam olarak bölünen sayıların ortalaması : "+average);
        }else {
            System.out.println("0'dan büyük bir değer giriniz");
        }

    }
}
