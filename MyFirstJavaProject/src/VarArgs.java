public class VarArgs {
    public static void main(String[] args){
        System.out.println(avr(Math.PI, Math.E));
    }
    static int add(int... numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum+=number;
        }
        return sum;
    }

    static double avr(double... numbers) {
        int sum = 0;

        if(numbers.length == 0) {
            return -1;
        }

        for(double number: numbers) {
            sum+=number;
        }
        sum /= numbers.length;
        return sum;
    }
}
