package helloworld.helloworld;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by computeiro on 29/08/17.
 */

public class Terceira_tela extends AppCompatActivity {


    String [] paises = {"Argentina","Bolivia", "Brasil", "Chile", "Colômbia", "Peru"};
    //int bandeira =
    ListView lista_paises;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);


        lista_paises = (ListView) findViewById(R.id.lista_paises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Terceira_tela.this, R.layout.lista_paises, R.id.pais, paises);
        lista_paises.setAdapter(adapter);

    }
}
