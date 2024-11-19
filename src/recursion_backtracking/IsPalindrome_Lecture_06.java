package recursion_backtracking;

public class IsPalindrome_Lecture_06 {
    public void IsPalindrome(String name,int i,int temp)
    {
        if(temp == name.length()/2)
        {
            System.out.println("Palindrom");
            return;
        }
        if(i == name.length()/2) {
            System.out.println("Not Palindrom");
            return;
        }
        if(name.charAt(i)== name.charAt(name.length()-(i+1))) {
            temp=temp+1;
        }
        IsPalindrome(name, i + 1, temp );

    }
    public static void main(String[] args) {
        String name="naman";
        IsPalindrome_Lecture_06 obj=new IsPalindrome_Lecture_06();
        obj.IsPalindrome(name,0,0);
    }
}
