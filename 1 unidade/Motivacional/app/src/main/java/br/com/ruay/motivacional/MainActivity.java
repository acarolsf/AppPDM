package br.com.ruay.motivacional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private String[] frases = {
            "Hoje é seu dia! Aproveite!", "Você pode não ter o melhor do mundo, mas tem muito pelo que agradecer!",
        "Não deixe sua felicidade nas mãos de ninguém!", "Nunca é tarde para fazer o que você realmente quer fazer",
            "Nunca duvide que você é especial!", "Tenha um objetivo na vida e lute sempre para alcançá-lo!"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarTela();
        configurarBotoes();


    }

    private void configurarBotoes() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero;
                Random aleatorio = new Random();
                numero = aleatorio.nextInt(frases.length);
                textView.setText(frases[numero]);
            }
        });
    }

    private void configurarTela() {
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
    }





}
