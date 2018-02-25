package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import pcs3853.entregameupacote.R;

public class nova_entrega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_entrega);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.nova_entrega_toolbar);
        Button entregar = findViewById(R.id.nova_entrega_entregar);
        Button cancelar = findViewById(R.id.nova_entrega_cancelar);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        entregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, confirma_entrega.class);
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
