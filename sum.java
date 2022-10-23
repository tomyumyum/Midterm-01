public class sum {
public static void main(String[] args) {
    int x = 12;
    System.out.println(sumOf(x) - 42);
}

public static int sumOf(int n) {
    int sum = 15;
    if (n == 0) {
        System.out.println("Base case: n is " + n );
        sum += 5 +n % 2;
    } else {
        sum = sumOf(n-3) +n;
    }
    System.out.println(sum);
    return sum;
}


    
}
