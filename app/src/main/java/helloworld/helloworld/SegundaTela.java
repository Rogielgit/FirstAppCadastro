package helloworld.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by computeiro on 22/08/17.
 */

public class SegundaTela extends AppCompatActivity {


    Button proximoVerif;
    EditText senhaET;
    EditText senhaRepetida;
    EditText nomePessoa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);

        proximoVerif = (Button) findViewById(R.id.idproximo);
        senhaET = (EditText) findViewById(R.id.idsenha);
        senhaRepetida = (EditText) findViewById(R.id.idrepetSenha);

        nomePessoa = (EditText) findViewById(R.id.nome);


        proximoVerif.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String senha = senhaET.getText().toString();
                        String repetsenha = senhaRepetida.getText().toString();
                        if (!senha.equals(repetsenha)) {
                            Toast.makeText(SegundaTela.this, getString(R.string.erro_senha), Toast.LENGTH_SHORT).show();
                        } else {
                            Intent i = new Intent(SegundaTela.this, Terceira_tela.class);
                            i.putExtra("nomePessoa", nomePessoa.getText().toString());
                            startActivity(i);
                        }
                    }
                });

    }
}
