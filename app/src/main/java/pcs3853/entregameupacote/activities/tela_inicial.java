package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pcs3853.entregameupacote.R;

public class tela_inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Context context = this;

        setContentView(R.layout.tela_inicial);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Button buttonCadastre = findViewById(R.id.buttonSplashScreenCadastre);
        buttonCadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, novo_cadastro.class);
                context.startActivity(intent);
            }
        });
    }
}
