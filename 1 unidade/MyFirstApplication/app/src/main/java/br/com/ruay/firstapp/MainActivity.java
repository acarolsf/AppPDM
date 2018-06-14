package br.com.ruay.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button sorteio_bt;
    TextView tx_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sorteio_bt = (Button) findViewById(R.id.sorteio_bt);

        tx_resultado = (TextView) findViewById(R.id.tx_resultado);




    }

    public void sortear() {

                int x;

                Random rand = new Random();

                x = rand.nextInt(100);

                tx_resultado.setText(""+ x);
    }
}
