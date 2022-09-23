# Java_answer
항해 99 1주차 - spring 주특기 java 과제 깃허브 업로드

Question01 클래스
문제1. 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디서 잘못 작성된 것일까요?
public class Hello {
    public static void main(String[] args) {
        int var1=5;
        int var2=2;
        
        double var3=var1/var2;
        
        int var4=(int)(var3*var2);
        
        System.out.println(var4);
    }

}

문제1번 답안: 위의 코드에서 
      double var3 = (double) var1 / var2; 로 (double)을 붙여줘야 합니다.
      
      위의 코드대로 한다면
      double var3 = var1/var2; 에서 var3 의 값을 
      System.out.println(var3) 출력을 하면 2가 출력됩니다.
      
      var1/ var2 앞에 (double)을 붙여주면 
      double var3 = (double) var1 / var2; 에서 var3의 값을 
      System.out.println(var3) 출력을 하면 2.5가 출력됩니다.
      
      int var4 = (int)(var3*var2); 에서 var4에 기대한 결과 5가 들어가기 위해서는 
      double var3 = var1/var2; 을 
      double var3 = (double) var1 / var2; 로 변경해줘야 합니다.
      
문제 1번 답안 코드:
public class Question01 {
    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2;

        int var4 = (int)(var3*var2);
        System.out.println(var4);
    }
}
      

Question02 클래스
문제2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? ( 증감연산자에 대해 알아보세요!)
public class Question02 {
    public static void main(String[] args) {

        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);

    }
}
답안 : 31

Question03 클래스
문제3. while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때
나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
눈의 합이 5가 아니면 계속 주사위를 던지고, 
눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.

답안 : 
while 조건문을 이용해서 무조건 true 안에 들어가도록 하고, 
숫자 두개 저장되는 변수 num1, num2 를 선언 합니다.
정수니까 int 를 붙이고 Math.random() 소수점으로 나오므로 (int) 를 붙여 int로 강제 형변환 합니다.
Math.random() 소수점으로 0~1 사이를 출력하기 때문에 *6을하고
+1을 하면 1~6의 숫자가 출력 됩니다.
if 조건문을 사용해서 두개의 변수를 더한 값이 5가되면 break로 빠저나오게 합니다.

답안 코드 :
public class Question03 {
    public static void main(String[] args) {
        System.out.println("시작!");
        while (true) {

            int num1 = (int) (Math.random() *6) + 1;
            int num2 = (int) (Math.random() *6) + 1;
            
            System.out.println("(" + num1 + "," + num2 + ")");

            if(num1 + num2 == 5) {

                System.out.println("끝");
                break ;

            }
        }
    }

}


