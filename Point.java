                 /*mutable object :هو ميثود قبل للتغيير */
public class Point{                   /* أكتب إسم الميثود-1*/
    int length;                        /*أكتب التفاصيل المراد تعريفها -2*/
    int width;
    public void insert(int l,int w){   /*أكتب المدخلات*/
        length=l;
        width =w;
    }
    public void carculateArea(){
        System.out.println("Area= "+(length * width));
    }
    public static void main(String[]args){
        Point r1= new Point();
        r1.insert(11,5);
        r1.carculateArea();
    }
}
