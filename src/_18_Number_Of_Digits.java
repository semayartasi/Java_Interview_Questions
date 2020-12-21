import javax.crypto.spec.PSource;

public class _18_Number_Of_Digits {
    //1234 4
    //123=3
    public static void main(String[] args) {
        long num = 123422221;
        int count = 0;
        while (num != 0) {
            num = num / 10; //123
            ++count;
        }
        System.out.println("numbers of digits: "+count);
    }
}
