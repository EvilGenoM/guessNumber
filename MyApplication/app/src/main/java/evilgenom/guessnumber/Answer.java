package evilgenom.guessnumber;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Евгений on 24.08.2017.
 */

public class Answer {
    ArrayList<Integer> stateNumber = new ArrayList<Integer>();

    void add(int answ){
        stateNumber.add(answ);
    }

    String getInfo(){
        int state1 = 0, state2 = 0;
        String info = "";
        Iterator<Integer> stateIter = stateNumber.iterator();
        while(stateIter.hasNext()){
            switch (stateIter.next()){
                case 0:
                    break;
                case 1:
                    state1++;
                    break;
                case 2:
                    state2++;
                    break;
                default:
                    break;
            }
        }
        if(state1 != 0 && state2 != 0){
            info=state1+" Прямых "+state2+" Диагоналей";
        } else {
            info="Ничего";
        }
        return info;
    }

}
