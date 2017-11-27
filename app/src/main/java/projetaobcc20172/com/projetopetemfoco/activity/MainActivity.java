package projetaobcc20172.com.projetopetemfoco.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import projetaobcc20172.com.projetopetemfoco.R;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth usuarioFirebase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sair;

        sair = (Button)findViewById(R.id.botao_sair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deslogarUsuario();
            }
        });
    }

    private void deslogarUsuario(){

        usuarioFirebase.signOut();

        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
