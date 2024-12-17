import java.util.*;

public class gfgArray{
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(8);
        array.add(9);
        array.add(7);
        array.add(5);
        int[] arrayy= new int[array.size()];
        int a=0;
        for(int i=array.size()-1; i>=0;i--){
            arrayy[a]=array.get(i);
            a++;
        }
        System.out.println(Arrays.toString(arrayy));
    }
}
