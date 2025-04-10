package static2.ex;

public class MathArrayUtils {

    private  MathArrayUtils() {
        //인스턴스 생성 불가 처리
    }

    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return (double)sum/array.length;
    }

    public static int min(int[] array){
        int max = array[0];
        for(int i : array){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    public static int max(int[] array){
        int min = array[0];
        for(int i : array){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
