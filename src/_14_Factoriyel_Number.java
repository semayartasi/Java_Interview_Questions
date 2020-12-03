public class _14_Factoriyel_Number {
    public static void main(String[] args) {
        //!5=5*4*3*2*1
        //!4=4*3*2*1
        int num=5;
        int fac=1;
        for (int i = 1; i < num; i++) {
            fac=fac*i;
        }
        System.out.println("factoriye of "+num+" is"+fac);
    }
}
