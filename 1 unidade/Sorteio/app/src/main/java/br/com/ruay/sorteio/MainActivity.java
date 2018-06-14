package br.com.ruay.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button sorteio_bt;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sorteio_bt = (Button) findViewById(R.id.sortear_bt);
        resultado = (TextView) findViewById(R.id.resultado);


    }

    public void sortear(View view) {
        int x;

        Random rand = new Random();

        x = rand.nextInt(100);

        resultado.setText(""+ x);
    }
}
