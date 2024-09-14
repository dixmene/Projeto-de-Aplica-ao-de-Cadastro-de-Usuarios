## Projeto de Aplicação de Cadastro de Usuários

### Descrição do Projeto

Este projeto consiste em uma aplicação para cadastro de usuários com uma interface gráfica simples desenvolvida em Java utilizando a biblioteca Swing. A aplicação permite que o usuário cadastre, consulte e remova registros de usuários, oferecendo uma interface intuitiva e fácil de usar.

### Objetivos

- Criar uma interface gráfica amigável para interação com o usuário.
- Implementar funcionalidades básicas como cadastro, consulta e remoção de usuários.
- Fornecer feedback visual na interface sobre as ações realizadas.

### Estrutura do Projeto

O projeto é organizado da seguinte forma:

```
CadastroApp
└── src
    └── CadastroApp.java
```

- `CadastroApp.java`: Contém o código-fonte da aplicação.

### Código-Fonte

Aqui está o código completo da aplicação:

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroApp {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextArea resultadoArea;

    public CadastroApp() {
        // Configuração da janela principal
        frame = new JFrame("Cadastro de Usuários");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Criação dos componentes da interface
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton consultarButton = new JButton("Consultar");
        JButton removerButton = new JButton("Remover");
        
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Adiciona os componentes à janela
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(cadastrarButton);
        frame.add(consultarButton);
        frame.add(removerButton);
        frame.add(new JScrollPane(resultadoArea));

        // Configura os eventos dos botões
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        consultarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultarUsuarios();
            }
        });

        removerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerUsuario();
            }
        });

        // Exibe a janela
        frame.setVisible(true);
    }

    private void cadastrarUsuario() {
        String nome = nomeField.getText();
        String email = emailField.getText();
        resultadoArea.append("Usuário cadastrado: " + nome + " (" + email + ")\n");
        nomeField.setText("");
        emailField.setText("");
    }

    private void consultarUsuarios() {
        resultadoArea.append("Consultando usuários...\n");
    }

    private void removerUsuario() {
        String nome = nomeField.getText();
        resultadoArea.append("Usuário removido: " + nome + "\n");
        nomeField.setText("");
    }

    public static void main(String[] args) {
        new CadastroApp();
    }
}
```

### Como Funciona

1. **Interface Gráfica**: A aplicação utiliza `JFrame` para criar a janela principal, `JLabel` para labels, `JTextField` para campos de texto e `JTextArea` para exibir resultados e feedback.

2. **Funcionalidades**:
   - **Cadastrar Usuário**: Adiciona um usuário com base nas informações fornecidas e exibe uma mensagem de confirmação na área de resultados.
   - **Consultar Usuários**: Simula a consulta dos usuários e exibe uma mensagem correspondente na área de resultados.
   - **Remover Usuário**: Remove um usuário especificado e exibe uma mensagem de confirmação na área de resultados.

3. **Eventos**:
   - **Botão Cadastrar**: Adiciona o usuário com as informações fornecidas.
   - **Botão Consultar**: Simula a consulta dos usuários registrados.
   - **Botão Remover**: Remove o usuário especificado.

### Compilação e Execução

1. **Compilar**: Navegue até o diretório do projeto e compile o código com o comando:
   ```bash
   javac src/CadastroApp.java
   ```

2. **Executar**: Execute o código compilado com o comando:
   ```bash
   java -cp src CadastroApp
   ```

### Conclusão

Este projeto ilustra o uso de Java Swing para criar uma interface gráfica básica, manipulando eventos e atualizando a interface com feedback para o usuário. É uma aplicação prática que pode ser expandida com funcionalidades adicionais, como persistência de dados em um banco de dados ou a implementação de mais operações sobre os usuários.

---
![image](https://github.com/user-attachments/assets/efb1a6d0-f3eb-4a7c-8564-a4ad843f62d3)
