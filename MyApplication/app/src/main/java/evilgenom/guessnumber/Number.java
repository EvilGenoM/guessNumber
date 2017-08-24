package evilgenom.guessnumber;

/**
 * Класс описывающий объект Number
 * Created by Евгений on 24.08.2017.
 */

public class Number {
    private int nmb;

    Number(int nmb){
        this.nmb = nmb;
    }

    Answer compareNmb(int nmb){
        Answer answer = new Answer();
        for(int i = 0; i<4; i++) {
            answer.add(equalNum(nmb % 10, i));
            nmb /= 10;
        }
        return answer;
    }

    private int equalNum(int num, int i){
        int fakeNmb = this.nmb;
        int answ = 0;
        for(int j = 0; j<4; j++){
            if(num == fakeNmb%10){
                if(j==i){
                    answ = 1;
                } else{
                    answ = 2;
                }
                break;
            }
            fakeNmb /= 10;
        }
        return answ;
    }

}
