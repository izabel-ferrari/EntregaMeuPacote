package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pcs3853.entregameupacote.R;

public class finaliza_entrega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finaliza_entrega);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.finaliza_entrega_toolbar);
        Button acompanhar = findViewById(R.id.finaliza_entrega_acompanhar);
        Button detalhes = findViewById(R.id.finaliza_entrega_detalhes);
        Button voltar = findViewById(R.id.finaliza_entrega_voltar);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        acompanhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Acompanhar", Toast.LENGTH_LONG).show();
            }
        });

        detalhes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detalhe_entrega.class);
                context.startActivity(intent);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, menu_usuario.class);
                context.startActivity(intent);
            }
        });

    }

}
