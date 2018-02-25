package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import pcs3853.entregameupacote.R;

public class confirma_entrega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirma_entrega);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.confirma_entrega_toolbar);
        Button prosseguir = findViewById(R.id.confirma_entrega_prosseguir);
        Button cancelar = findViewById(R.id.confirma_entrega_cancelar);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        prosseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, finaliza_entrega.class);
                context.startActivity(intent);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, menu_usuario.class);
                context.startActivity(intent);
            }
        });
    }

}
