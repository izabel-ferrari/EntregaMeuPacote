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

public class menu_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_usuario);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.tela_inicial_toolbar);
        Button btn_solicitar = findViewById(R.id.tela_inicial_btn_solicitar);
        Button btn_acompanhar = findViewById(R.id.tela_inicial_btn_acompanhar);
        Button btn_consultar = findViewById(R.id.tela_inicial_btn_consultar);
        Button btn_configurar = findViewById(R.id.tela_inicial_btn_configurar);
        Button btn_sair = findViewById(R.id.tela_inicial_btn_sair);

        setSupportActionBar(toolbar);

        btn_solicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, nova_entrega.class);
                context.startActivity(intent);
            }
        });

        btn_acompanhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Acompanhar", Toast.LENGTH_LONG).show();
            }
        });
        btn_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, historico_entregas.class);
                context.startActivity(intent);
            }
        });

        btn_configurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, config_usuario.class);
                context.startActivity(intent);
            }
        });

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, splash_screen.class);
                context.startActivity(intent);
            }
        });
    }

}
