package br.com.ruay.gasolinaoualcool;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button check;
    private EditText p_alcool;
    private EditText p_gas;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarTela();
        configurarBotoes();
    }

    private void configurarBotoes() {
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pA_digitado = p_alcool.getText().toString();
                String pG_digitado = p_gas.getText().toString();

                if(pA_digitado.isEmpty() || pG_digitado.isEmpty()){
                    resultado.setText("Digite os valores!");
                } else {
                    double gas = Double.parseDouble(pG_digitado);
                    double alcohol = Double.parseDouble(pA_digitado);
                    double var = alcohol/gas;
                    if (var < 0.7){
                        resultado.setText("Abasteça com Álcool");
                    } else {
                        resultado.setText("@string/ab_gas");
                    }
                }
            }
        });
    }

    private void configurarTela() {
        check = (Button) findViewById(R.id.check);
        p_alcool = (EditText) findViewById(R.id.p_alcool);
        p_gas = (EditText) findViewById(R.id.p_gas);
        resultado = (TextView) findViewById(R.id.resultado);
    }


}
