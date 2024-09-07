import java.util.Scanner;

@SuppressWarnings("unused")
public class PR12 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
    
        System.out.println("Masukkan angka kesini: ");
        angka = input.nextInt();

        if (angka == 1 || angka == 3 || angka == 5 || angka == 7 || angka == 9) {
            System.out.println("Bilangan Ganjil");          
        }
        else if (angka == 2 || angka == 4 || angka == 6 || angka == 8 || angka == 10){
            System.out.println("Bilangan Genap");  
        }
        else {
            System.out.println("Angka diluar jangkauan");
        }
    }
}
