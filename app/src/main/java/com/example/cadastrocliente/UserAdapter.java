package com.example.cadastrocliente;
/*
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

 */


// Importações necessárias para inflar layouts, gerenciar Views e a lista de dados
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

// Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecyclerView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    // Atributo privado que armazena a referência dos dados que serão exibidos
    private List<String> listaUsuarios;

    // CONSTRUTOR: Permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> lista) {
        this.listaUsuarios = lista;
    }

    // MÉTODO 1: Cria "do zero" o visual de uma linha da lista (ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater transforma o arquivo XML em um objeto View Java
        // Aqui usamos um layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);

        // Retorna uma nova instância da nossa classe interna ViewHolder com a View criada
        return new ViewHolder(view);
    }

    // MÉTODO 2: Vincula (Bind) os dados de um objeto da lista a uma linha específica da tela
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Recupera o dado da lista baseado na posição que o Android está desenhando agora
        String nome = listaUsuarios.get(position);

        // Define o texto no componente visual que está guardado dentro do 'holder'
        holder.tvNome.setText(nome);
    }

    // MÉTODO 3: Informa ao Android quantos itens a lista possui ao todo
    @Override
    public int getItemCount() {
        // Se a lista existir, retorna o tamanho; caso contrário, retorna zero
        return listaUsuarios != null ? listaUsuarios.size() : 0;
    }

    // CLASSE INTERNA ViewHolder: Serve para "segurar" as referências dos componentes de cada linha
    // Evita chamadas repetitivas ao findViewById, melhorando a performance (Reciclagem)
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Referência para o TextView da linha
        TextView tvNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Faz o mapeamento do ID do layout para o objeto Java
            // android.R.id.text1 é o ID padrão do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }
}