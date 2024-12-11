import java.util.Scanner;
public class CipherTest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Cipher cipher = new CeasarCipher();
        System.out.println("Текст енгіз:");
        String i = scanner.nextLine();
        System.out.println("сдвиг жаса быр сан жаз:");
        int b = scanner.nextInt();
        String e = cipher.encrypt(i, b);
        System.out.println("защифрованный:" + e);
        String t = cipher.decrypt(i, b);
        System.out.println("расшиорфанный:" + t);
        scanner.close();
    }}





