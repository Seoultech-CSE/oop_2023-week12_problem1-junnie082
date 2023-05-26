import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Double> list = new ArrayList<Double>();
        System.out.print("Enter five integers and five doubles: ");


        for (int i = 0; i < 10; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for (int i = 0; i < 10; i++) {
            if (list.get(i) == list.get(i).intValue()) System.out.print(list.get(i).intValue());
            else System.out.print(list.get(i));

            System.out.print(" ");
        }
    }

    public static void sort(ArrayList<Double> list) {
        
        list.sort(null);
       
    }
}
