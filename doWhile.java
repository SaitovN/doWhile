package academy.devonline.java.basic.section01_setup.section05_setup;

public class doWhile {
    public static void main(String[] args) {
//        var i= 100;
//        while (i>=1){
//            System.out.print(i-- + " ");
//        }
//        System.out.println();
//        { var r= 100;
//
//            do {
//                System.out.print(r-- +" ");
//            }while (r >=1);
//            System.out.println();
//
//        }
    int n = -1;
    for (int i = 0; i<n;i++){
        System.out.println("For ->"+i);
    }
    int i = 0;
    while (i<n){
        System.out.println("while -> "+ i++);
    }
    i = 0;
    do {
        System.out.println("do ->"+ i++);
    }while (i<n);









    }
}
