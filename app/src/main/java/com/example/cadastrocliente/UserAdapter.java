package com.example.cadastrocliente;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

// 1. Tornar a classe 'public' para a MainActivity enxergá-la
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    // 2. MUDANÇA: Criar a lista que vai guardar os nomes dos usuários
    private List<String> listaUsuarios;

    // 3. MUDANÇA: Criar um CONSTRUTOR para receber a lista da MainActivity
    public UserAdapter(List<String> lista) {
        this.listaUsuarios = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 4. MUDANÇA: Inflar o layout de cada linha (usando um padrão do Android para teste)
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // 5. MUDANÇA: Pegar o nome na posição correta e colocar no TextView
        String nome = listaUsuarios.get(position);
        holder.tvNome.setText(nome);
    }

    @Override
    public int getItemCount() {
        // 6. MUDANÇA: Retornar o tamanho REAL da lista (se for 0, não aparece nada)
        return listaUsuarios != null ? listaUsuarios.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // 7. MUDANÇA: Ligar o ID do XML ao objeto Java
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }
}