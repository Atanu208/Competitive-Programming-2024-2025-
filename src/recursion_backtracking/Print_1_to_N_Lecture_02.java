package recursion_backtracking;
public class Print_1_to_N_Lecture_02 {
//    Using two input
//    public void Print_1_to_N(int num,int i)
//    {
//        if(num<i)
//        return;
//        System.out.println(i);
//        Print_1_to_N(num,i+1);
//    }

//    Using single input
    public void Print_1_to_N(int num)
    {
        if(num==0)
        return;
        Print_1_to_N(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Print_1_to_N_Lecture_02 obj=new Print_1_to_N_Lecture_02();
        obj.Print_1_to_N(5);
    }
}
