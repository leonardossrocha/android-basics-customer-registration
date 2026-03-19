package com.example.cadastrocliente;

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