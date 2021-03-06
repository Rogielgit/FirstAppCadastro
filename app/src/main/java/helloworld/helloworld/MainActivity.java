package helloworld.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button registrarBnt;
    CheckBox mostarSenha;
    TextView senhaET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       senhaET =  (TextView) findViewById(R.id.idSenhaUser);

        registrarBnt = (Button) findViewById(R.id.button);
        mostarSenha = (CheckBox) findViewById(R.id.mostraSenha);

        mostarSenha.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View v) {
                if (mostarSenha.isChecked()){
                    senhaET.setTransformationMethod(null);
                }
                else
                {
                    senhaET.setTransformationMethod(new PasswordTransformationMethod());
                }

            }
        }

        );

        registrarBnt.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Cadastro ok")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent  i = new Intent(MainActivity.this, SegundaTela.class);
                        startActivity(i);

                    }

                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "user cancel", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.create().show();
            }
        }

        );
    }
}
