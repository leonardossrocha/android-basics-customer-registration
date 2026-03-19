# Cadastro de Clientes - Android Básico 📱

Este projeto foi desenvolvido como material de apoio para a disciplina de **Desenvolvimento Mobile** no curso de Análise e Desenvolvimento de Sistemas (ADS). O objetivo é demonstrar os conceitos fundamentais de navegação entre telas, manipulação de layouts e exibição de listas dinâmicas.

## 🎯 Objetivos de Aprendizado
* Gerenciamento de ciclo de vida de **Activities**.
* Comunicação entre telas via **Intents**.
* Implementação do padrão **Adapter** com **RecyclerView**.
* Design de interface utilizando **ConstraintLayout** e **Material Design**.

---

## 🏗️ Estrutura do Projeto

O aplicativo é composto por três pilares principais:

1. **MainActivity.java**: Porta de entrada do app. Gerencia a exibição da lista e a navegação para o formulário.
2. **CreateUser.java**: Tela de entrada de dados (formulário) que utiliza componentes de Material Design.
3. **UserAdapter.java**: O "mapeador" que conecta a lista de dados (Java) aos elementos visuais (XML).

---

## 🛠️ Tecnologias e Conceitos Utilizados

### Unidades de Medida
* **DP (Density-independent Pixels)**: Utilizado para garantir que botões e margens tenham o mesmo tamanho físico em qualquer densidade de tela.
* **SP (Scale-independent Pixels)**: Utilizado para textos, respeitando as configurações de acessibilidade e escala de fonte do usuário.

### Layouts
* **ConstraintLayout**: Usado na tela principal para um posicionamento flexível e eficiente dos elementos.
* **LinearLayout**: Usado no formulário para empilhamento vertical simples e intuitivo dos campos.

---

## 🚀 Como executar o projeto

1. Faça o clone deste repositório:
   ```bash
   git clone [https://github.com/leonardossrocha/android-basics-customer-registration.git](https://github.com/leonardossrocha/android-basics-customer-registration.git)