package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import pcs3853.entregameupacote.R;

public class historico_entregas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historico_entregas);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.historico_entregas_toolbar);
        TextView detalhes = findViewById(R.id.historico_detalhe_mais_detalhes);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        detalhes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detalhe_entrega.class);
                context.startActivity(intent);
            }
        });


    }

}
