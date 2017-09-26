package helloworld.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by computeiro on 29/08/17.
 */

public class Terceira_tela extends AppCompatActivity {


    String[] paises = {"Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Peru"};
    int[] bandeiras = {R.drawable.argentina, R.drawable.bolivia, R.drawable.brasil,
            R.drawable.chile, R.drawable.colombia, R.drawable.peru};
    ListView lista_paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        lista_paises = (ListView) findViewById(R.id.lista_paises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Terceira_tela.this,
                R.layout.lista_paises, R.id.pais, paises);

        lista_paises.setAdapter(adapter);

         Intent i = getIntent();

        String nomePessoa = i.getStringExtra("nomePessoa");

        TextView textView = (TextView) findViewById(R.id.nomePessoa);
        textView.setText(nomePessoa);

        lista_paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView bandeira = (ImageView) findViewById(R.id.bandeira_selecionada);
                bandeira.setImageResource(bandeiras[position]);
            }
        });

    }
}

