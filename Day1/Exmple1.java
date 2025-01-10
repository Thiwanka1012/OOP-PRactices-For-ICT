class Box{

    int height;
    int wigth;
    int length;



}

public class Exmple1 {
    public static void main(String[] args) {

        int arr[];
        arr=new int[10];
        System.out.println(arr);

        arr[0]=50;
        System.out.println(arr[0]);

        Box b1=new Box();
        System.out.println(b1);

        b1.length=100;
        System.out.println(b1.length);
    }
}
