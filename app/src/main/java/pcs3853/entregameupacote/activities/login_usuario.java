package pcs3853.entregameupacote.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pcs3853.entregameupacote.R;

public class login_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_usuario);

        final Context context = this;

        Toolbar toolbar = findViewById(R.id.tela_login_toolbar);
        EditText input_nome = findViewById(R.id.tela_login_input_email);
        EditText input_sobrenome = findViewById(R.id.tela_login_input_senha);
        Button btn_entrar = findViewById(R.id.tela_login_btn_entrar);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, menu_usuario.class);
                context.startActivity(intent);
            }
        });

    }
}
