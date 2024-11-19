package recursion_backtracking;

public class Print_Array_Lecture_04 {
    public void Print_Array(int[] arr,int len)
    {
        if(len == arr.length)
            return;
        System.out.println(arr[len]);
        Print_Array(arr,len+1);
    }

    public static void main(String[] args) {
        Print_Array_Lecture_04 obj=new Print_Array_Lecture_04();
        int[] array={23,45,67,43,85};
        obj.Print_Array(array,0);
    }
}
