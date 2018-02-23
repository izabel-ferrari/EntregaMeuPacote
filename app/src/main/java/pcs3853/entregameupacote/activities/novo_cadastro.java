package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import pcs3853.entregameupacote.R;

public class novo_cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_cadastro);

        final Context context = this;

        EditText input_nome = findViewById(R.id.novo_cadastro_input_nome);
        EditText input_sobrenome = findViewById(R.id.novo_cadastro_input_sobrenome);
        EditText input_email = findViewById(R.id.novo_cadastro_input_email);
        EditText input_senha = findViewById(R.id.novo_cadastro_input_senha);
        Button btn_cadastrar = findViewById(R.id.novo_cadastro_btn_cadastrar);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tela_inicial.class);
                context.startActivity(intent);
            }
        });

    }
}
