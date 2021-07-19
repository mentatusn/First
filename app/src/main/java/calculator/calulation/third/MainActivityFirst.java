package calculator.calulation.third;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityFirst extends AppCompatActivity {

    Integer first;
    Integer second;
    String fStr = "128";
    String sStr = "128";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = Integer.parseInt(fStr);
        second = Integer.parseInt(sStr);

        for(int i=0;i<1000;i++){
            first = Integer.parseInt(i+"");
            second = Integer.parseInt(i+"");
            Log.d("mylogs",i+" "+(first==(second)));
        }


        if(first==(second)){

            ((TextView)findViewById(R.id.textView)).setText("Равно");
        }else{
            ((TextView)findViewById(R.id.textView)).setText("Не равно");
        }
    }
}