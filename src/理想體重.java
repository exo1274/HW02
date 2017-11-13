public class 理想體重 {
    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System .in);
        System.out.println("請輸入1或2(1.男2.女)");
        int x=sc.nextInt() ;
        System.out.print("請輸入身高：");
        int y=sc.nextInt() ;
        System.out.print("請輸入體重：");
        int z=sc.nextInt() ;
        if (x==1){
            double a =(y-80)*0.7;
            {System.out.println("男性標準體重是："+a);

                if (z<=a+a*0.1&z>=a-a*0.1){
                    System.out.println("正常體重" ) ;}
                else if (z<=a+a*0.2&z>=a-a*0.1){
                    System.out.println("體重過輕" ) ;}
                else if (z<=a+a*0.2&z>=a-a*0.1){
                    System.out.println("體重過重" ) ;}
                else if (z<a-a*0.2){
                    System.out.println("體重不足" ) ;}
                else if (z>a+a*0.2)
                    System.out.println("肥胖" ) ;}
        }
        if (x==2) {
            double b = (y - 70) * 0.6;
            System.out.println("女性標準體重是：" + b);
            if (z<=b+b*0.1&z>=b-b*0.1){
                System.out.println("正常體重" ) ;}
            else if (z<b+b*0.2&z>=b-b*0.1){
                System.out.println("體重過輕" ) ;}
            else if (z>=b-b*0.2&z<b+b*0.1){
                System.out.println("體重過重" ) ;}
            else if (z<b-b*0.2){
                System.out.println("體重不足" ) ;}
            else if (z>b+b*0.2){
                System.out.println("肥胖" ) ;}

        }
    }
}
