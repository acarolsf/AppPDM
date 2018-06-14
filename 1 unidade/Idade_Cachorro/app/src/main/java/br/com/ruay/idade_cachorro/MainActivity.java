package br.com.ruay.idade_cachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt_di;
    private TextView idade_h;
    private EditText idade_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarTela();
        configurarBotoes();
    }

    private void configurarBotoes() {
        bt_di.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String  idadeDigitado = idade_c.getText().toString();

                if(idadeDigitado.isEmpty()){
                    idade_h.setText("Nenhuma idade digitada.");
                } else {
                    int idade = Integer.parseInt(idadeDigitado);
                    int idadeC = idade * 7;
                    idade_h.setText("" + idadeC + " anos humanos");
                }

            }
        });
    }

    private void configurarTela() {
        bt_di = (Button) findViewById(R.id.bt_di);
        idade_h = (TextView) findViewById(R.id.idade_h);
        idade_c = (EditText) findViewById(R.id.idade_c);
    }
}
