package recursion_backtracking;
public class Factorial_Lecture_03 {
    public int factorial(int num)
    {
        if(num==1)
            return 1;
        return  num * factorial(num-1);
    }
    public static void main(String[] args) {
        Factorial_Lecture_03 obj=new Factorial_Lecture_03();
        int factorial=obj.factorial(5);
        System.out.println(factorial);
    }
}
