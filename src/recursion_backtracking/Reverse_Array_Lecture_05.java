package recursion_backtracking;

public class Reverse_Array_Lecture_05 {
    public void Reverse_Array(int[] arr,int i)
    {
        if(i >= arr.length/2)
        return;

        int temp=arr[i]; //85
        arr[i]=arr[arr.length-(i+1)]; // 23
        arr[arr.length-(i+1)]=temp;
        Reverse_Array(arr,i+1);
    }

    public static void main(String[] args) {
        Reverse_Array_Lecture_05 obj=new Reverse_Array_Lecture_05();
        int[] arr={1,2,3,4,5,6};
        obj.Reverse_Array(arr,0);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
