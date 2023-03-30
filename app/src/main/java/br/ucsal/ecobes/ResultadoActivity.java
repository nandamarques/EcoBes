package br.ucsal.ecobes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ResultadoActivity extends AppCompatActivity {

    private TextView label;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        label = findViewById(R.id.resultado_text_label);
        fab = findViewById(R.id.resultado_fab_voltar);

        String valor = getIntent().getStringExtra("TEXTO_DIGITADO");
        Log.d("ResultadoActivity", "Texto que chegou:" + valor);

        label.setText(valor);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ResultadoActivity.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });

    }
}