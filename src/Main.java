public class Main {
    public static void main(String[] args) {
        //3
        String permissionForWalk = permission(30, 45);
        System.out.println(permissionForWalk);
        String permissionForWalk2 = permission(21, 22);
        System.out.println(permissionForWalk2);
        String permissionForWalk3 = permission(19, 25);
        System.out.println(permissionForWalk3);
        String permissionForWalk4 = permission(46, -10);
        System.out.println(permissionForWalk4);

//5
        String permissionForWalk5 = permission(generateRandomAge(), -19);
        System.out.println(permissionForWalk5);
//4
        int randomAge = generateRandomAge();
        System.out.println("Random age is " + randomAge );

    }

    //1 && //2

    public static String permission(int age, int temeprature) {

        if ((age >= 20 && age <= 45) && (temeprature >= -20 && temeprature <= 30)) {
            return "It is permitted to walk:)";

        } else if (age < 20 && (temeprature >= 0 && temeprature <= 28)) {
            return "It is permitted to walk!!!";
        } else if (age > 45 && (temeprature >= -10 && temeprature <= 25)) {
            return "It is permitted to walk";
        } else return "Stay at home";
    }

    //4
    public static int generateRandomAge(){
        int a=10;
        int b=100;
        int x= a + (int)(Math.random() * ((b - a) + 1));
        return  x;
    }




}