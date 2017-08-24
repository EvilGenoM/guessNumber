package evilgenom.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number number = new Number(randomNumber());
    }

    int randomNumber(){
        int number = 0;
        for(int i = 0; i<4; i++) {
            Random random = new Random();
            if(i!=0) number *= 10;
            number += equalNmb(random.nextInt(9), number);
        }
        return number;
    }

    int equalNmb(int random, int number){
        int Nmb = random;
        int fakeNumber = number;
        Random random1 = new Random();
        do{
            if(number == 0 && random != 0){
                break;
            }
            if(number == 0 && random == 0){
                Nmb = equalNmb(random1.nextInt(9), number);
            } else{
                if(Nmb == fakeNumber%10){
                    Nmb = equalNmb(random1.nextInt(9), number);
                }
                fakeNumber /= 10;
            }

        }while(fakeNumber>0);

        return Nmb;
    }
}
