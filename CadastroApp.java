
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
        frame = new JFrame("Cadastro de Usuários");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton consultarButton = new JButton("Consultar");
        JButton removerButton = new JButton("Remover");

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(cadastrarButton);
        frame.add(consultarButton);
        frame.add(removerButton);
        frame.add(new JScrollPane(resultadoArea));

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
