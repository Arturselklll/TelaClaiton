import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

    private JPanel mainPanel;

    public MainForm(){

        btnValidar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //obter nome do input
                        String nomeDigitado = txtNome.getText();

                        txtResultado.setText(nomeDigitado);
                    }
                }
        );

    }

    private JButton btnValidar;
    private JLabel txtResultado;
    private JTextField textField1;
    private JLabel lnlNome;

    public static void main(String[] args) {
        //cria a minha primeira tela (tv)
        JFrame frame = new JFrame("minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ajusta a minha tv no tamanho do meu painel
        frame.pack();
        frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);
    }
}

