package recursion_backtracking;

public class Print_N_to_1_Lecture_01 {
    public void Print_N_to_1(int num)
    {
        if(num==0)
            return;
        System.out.println(num);
        Print_N_to_1(num-1);
    }
    public static void main(String[] args) {
        Print_N_to_1_Lecture_01 obj=new Print_N_to_1_Lecture_01();
        obj.Print_N_to_1(5);
    }
}
