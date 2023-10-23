import java.util.Scanner;

class jr{
    public static void main(String[] args) {
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age){
            case 18:
                System.out.println("Ты закончил школу");
                break;
            case 10:
                System.out.println("Ты учишься в школе");
                break;
            default:
                System.out.println("Ты не в том возрасте чтобы тут сидеть");
        }
    }
}










