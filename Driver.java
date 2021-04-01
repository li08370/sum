public class Driver {
    public static void main(String[] args) {
        long value = (long) Math.pow(2, 1000);
        System.out.println(sum(value));
    }

    public static int places(long num){
        int place = 0;
        double tempNum = 10;
        while(num > tempNum){
            tempNum = Math.pow(10, place);
            place++;
        }
        return place-1;
    }

    public static long sum(long num){
        long sum = 0;
        int index = places(num);
        int orgIndex = places(num);
        while(index != 0){
           sum +=  (int)((num/Math.pow(10, index-1))%10);
           index--;
        }
            return sum;
    }
    //(2.516415E7)

}
