package com.example.cadastrocliente;
/*
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    // ATENÇÃO: Tornamos a lista estática para ser acessível de qualquer lugar
    public static List<String> listaNomes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adiciona dados iniciais apenas se a lista estiver vazia
        if (listaNomes.isEmpty()) {
            listaNomes.add("Leonardo Rocha");
        }

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new UserAdapter(listaNomes);
        recyclerView.setAdapter(adapter);

        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // MUDANÇA: Quando voltamos para esta tela, avisamos o adapter que a lista mudou
        adapter.notifyDataSetChanged();
    }
}
 */

// Importação das bibliotecas necessárias do ecossistema Android e Java
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

// Classe principal que estende AppCompatActivity para ganhar recursos de interface moderna
public class MainActivity extends AppCompatActivity {

    // Declaração dos componentes visuais e do adaptador da lista
    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    // ATENÇÃO: Atributo estático (static) permite que os dados persistam na memória
    // enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activities)
    public static List<String> listaNomes = new ArrayList<>();

    // Método de inicialização da Activity (Ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Vincula o arquivo de layout XML (activity_main.xml) a esta classe Java
        setContentView(R.layout.activity_main);

        // Regra de negócio: alimenta a lista com um nome inicial se ela estiver vazia
        if (listaNomes.isEmpty()) {
            listaNomes.add("Leonardo Rocha");
        }

        // Mapeamento do componente RecyclerView do XML para o objeto Java
        recyclerView = findViewById(R.id.recycler_view);

        // Define o LayoutManager: organiza os itens da lista em uma coluna vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Instancia o adaptador passando a nossa lista de nomes
        adapter = new UserAdapter(listaNomes);

        // Conecta o adaptador ao RecyclerView para que os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        // Mapeamento do botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        // Configura o evento de clique usando Expressão Lambda (Java 8+)
        btnCadastrar.setOnClickListener(v -> {
            // Cria uma Intent (Intenção) para navegar da MainActivity para a CreateUser
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });
    }

    // Método chamado sempre que a tela volta a ficar visível para o usuário
    @Override
    protected void onResume() {
        super.onResume();
        // Avisa o adaptador que a fonte de dados (listaNomes) pode ter sido alterada
        // na outra tela, forçando a atualização visual da lista (refresh)
        adapter.notifyDataSetChanged();
    }
}