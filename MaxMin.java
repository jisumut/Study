import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner.sc = Scanner(System.in);

        int intArray[];
        intArray = new int[N];
        for(int i=0; i<N; i++)
            intArray[i] = sc.nextInt();

        Arrays.sort(intArray);
        System.out.println(intArray[0] + " " + intArray[n-1]);
    }
}