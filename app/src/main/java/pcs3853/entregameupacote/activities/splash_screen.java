package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pcs3853.entregameupacote.R;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Context context = this;

        setContentView(R.layout.splash_screen);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Button btn_cadastrar = findViewById(R.id.splash_screen_btn_cadastrar);
        TextView txt_entre_aqui = findViewById(R.id.splash_screen_txt_entre_aqui);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, novo_cadastro.class);
                context.startActivity(intent);
            }
        });

        txt_entre_aqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Entrar", Toast.LENGTH_LONG).show();
            }
        });
    }
}
