package com.example.cadastrocliente;
/*
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;

public class CreateUser extends AppCompatActivity {

    TextInputEditText editNome, editEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if (!nome.isEmpty()) {
                // ADICIONA na lista estática da MainActivity
                MainActivity.listaNomes.add(nome + " (" + email + ")");

                // FECHA esta tela e volta para a anterior
                finish();
            }
        });
    }
}

 */


// Importação das classes necessárias para componentes visuais e ciclo de vida
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;

// Activity responsável pelo formulário de entrada de novos usuários
public class CreateUser extends AppCompatActivity {

    // Declaração dos componentes de entrada de texto (Material Design) e do botão
    TextInputEditText editNome, editEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Infla o layout XML específico desta tela (create_user.xml)
        setContentView(R.layout.create_user);

        // Vincula os IDs definidos no XML aos objetos Java (Mapeamento)
        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        // Configura o escutador de cliques (Listener) para o botão salvar
        btnSalvar.setOnClickListener(v -> {
            // Extrai o texto digitado nos campos e converte para String
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            // Validação simples: só permite salvar se o campo nome não estiver vazio
            if (!nome.isEmpty()) {

                // OPERAÇÃO DE DADOS: Acessa a lista estática da MainActivity
                // e adiciona os novos dados formatados
                MainActivity.listaNomes.add(nome + " (" + email + ")");

                // FINALIZAÇÃO: O método finish() encerra a Activity atual e remove-a da pilha,
                // fazendo com que o Android retorne automaticamente para a MainActivity
                finish();
            }
        });
    }
}