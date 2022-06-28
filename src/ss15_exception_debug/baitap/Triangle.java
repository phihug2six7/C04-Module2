package ss15_exception_debug.baitap;

public class Triangle {
    int a,b,c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0 ) {
            throw new IllegalTriangleException("Số bạn nhập không phải số nguyên dương");
        }else if (a+b<=c || a+c<=b || c+b<=a){
            throw new IllegalTriangleException("3 cạnh bạn nhập không phải của tam giác");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("Số bạn nhập là 3 cạnh của tam giác");
        }
    }

    public Triangle() {
    }

}
