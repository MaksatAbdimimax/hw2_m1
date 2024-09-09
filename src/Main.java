public class Main {

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 28));
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 28));
        System.out.println(permission(generateRandomAge(), 50));
    }

    public static String permission(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age <= 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
     double age =  Math.random()*100;
     return  (int) age;
    }
}