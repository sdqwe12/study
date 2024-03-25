public class Main {
    public static void main(String[] args) {
        int[] lottoN = new int[45];
    //입력 for
        // 1번째부터 비교해라
        //0번~끝까지 비교 같은게 있으면 counter 증가
        //똑같은게 없을 때까지 해라
        //인젤리제이 정렬 단축키
        //ctrl + alt +1
        int counter = 0;
        aa: for (int i = 0; i < lottoN.length; i++) {
            lottoN[i] = (int)(Math.random()*45)+1;

            counter = 0;
            for (int j = 0; j < i; j++) {
                if ( lottoN[i] == lottoN[j]) {
                    counter++;
                }
                if (counter > 0) {
                    lottoN[i] = (int) (Math.random()*45)+1;
                    counter = 0;
                } else {
                    break;
                }
            }
            System.out.println("counter = "+counter);
        }
    //출력 for
        for (int i = 0; i < lottoN.length; i++) {
            System.out.print(lottoN[i]+" ");
        }
    }
}