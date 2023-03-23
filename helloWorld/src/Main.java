public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(restar(5,2));
        System.out.println(multiplicar(5,3));
    }

    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public int dividir(int num1, int num2){
        if(num2 != 0){
            return num1/num2;
        }
            return 0;
    }
}