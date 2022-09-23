public class Question01 {
    public static void main(String[] args) {
        /*
        문제 1번 : 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요 ?
        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        int var4 = (int)(var3*var2);
        System.out.println(var4);
        */

        // 답안: (double)을 val1/ var2 앞에 붙여줘야 var3 이 2.5로 출력되어 , var3*var2 가 5의 값을 가지게 되고
        // var4 5 가 값으로 들어가게 되어
        // System.out.println(var4); 출력시 5가 출력됩니다.

        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2;

        int var4 = (int)(var3*var2);
        System.out.println(var4);
    }
}
