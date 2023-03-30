package br.ucsal.ecobes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button salvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.main_texto_entrada);
        salvar = findViewById(R.id.main_button_salvar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = texto.getText().toString();

                Log.d("MainActivity", "Usuário digitou " + valor);
                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("TEXTO_DIGITADO", valor);
                startActivity(intent);;
            }
        });
    }
}