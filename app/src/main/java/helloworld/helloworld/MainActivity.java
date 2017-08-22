package helloworld.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registrarBnt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        registrarBnt = (Button) findViewById(R.id.button);
        registrarBnt.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {

                Intent  i = new Intent(MainActivity.this, SegundaTela.class);
                startActivity(i);

             }
        }


        );
    }
}
