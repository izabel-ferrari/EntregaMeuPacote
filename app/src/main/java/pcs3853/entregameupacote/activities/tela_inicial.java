package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pcs3853.entregameupacote.R;

public class tela_inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.toolbar);
        Button btn_solicitar = findViewById(R.id.tela_inicial_btn_solicitar);
        Button btn_acompanhar = findViewById(R.id.tela_inicial_btn_acompanhar);
        Button btn_consultar = findViewById(R.id.tela_inicial_btn_consultar);
        Button btn_configurar = findViewById(R.id.tela_inicial_btn_configurar);
        Button btn_sair = findViewById(R.id.tela_inicial_btn_sair);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Voltar", Toast.LENGTH_LONG).show();
            }
        });

        btn_solicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Solicitar", Toast.LENGTH_LONG).show();
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
                Toast.makeText(getBaseContext(), "Consultar", Toast.LENGTH_LONG).show();
            }
        });

        btn_configurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Configurar", Toast.LENGTH_LONG).show();
            }
        });

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Sair", Toast.LENGTH_LONG).show();
            }
        });
    }

}
