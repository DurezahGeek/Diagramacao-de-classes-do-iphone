package IPhone.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    private boolean emLigacao = false;

    @Override
    public void ligar(String numero) {
        if (!emLigacao) {
            System.out.println("Discando o número: " + numero);
            emLigacao = true;
        } else {
            System.out.println("Já está em uma chamada telefônica.");
        }
    }

    @Override
    public void atender() {
        if (!emLigacao) {
            System.out.println("Atendendo uma chamada telefônica.");
            emLigacao = true;
        } else {
            System.out.println("Já está em uma chamada telefônica.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!emLigacao) {
            System.out.println("Correio de voz ativado.");
        } else {
            System.out.println("Você não pode ativar o correio de voz durante uma chamada.");
        }
    }
}
