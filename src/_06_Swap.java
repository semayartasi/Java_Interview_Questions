public class _06_Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swapping");
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping");
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}
