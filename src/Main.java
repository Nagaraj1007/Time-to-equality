
public class Main {

    public static int minimumTime (int array[]){
        int maxElement = Integer.MIN_VALUE;
        for (int elements : array){
            maxElement = Math.max(maxElement, elements);
        }
        int time = 0;
        for (int elements : array){
            time += (maxElement - elements);
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(minimumTime(new int[]{2,4,1,3,2}));
    }
}