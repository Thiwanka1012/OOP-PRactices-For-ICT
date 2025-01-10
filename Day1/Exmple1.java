class Box{
    int length;
    int width;
    int height;

    public void setSize(int l,int h,int w){
        length=l;
        width=w;
        height=h;

    }

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume is"+volume);
    }


    public void printArea(){
        int area;
        area=2*length*width+2*width*height+2*width*length;
        System.out.println("Area is"+area);
    }


}




public class Exmple1 {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.setSize(10,20,30);

        b1.printArea();
        b1.printVolume();



        Box b2=new Box();
        b2.setSize(20,60,80);

        b2.printArea();
        b2.printVolume();

    }
}
