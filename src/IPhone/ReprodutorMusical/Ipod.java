package IPhone.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    private boolean reproduzindoMusica = false;

    @Override
    public void tocar() {
        if (!reproduzindoMusica) {
            System.out.println("Iniciando a reprodução de música.");
            reproduzindoMusica = true;
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pausar() {
        if (reproduzindoMusica) {
            System.out.println("Pausando a reprodução de música.");
            reproduzindoMusica = false;
        } else {
            System.out.println("Nenhuma música está sendo reproduzida.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (reproduzindoMusica) {
            System.out.println("Selecionando a música: " + musica);
        } else {
            System.out.println("Não é possível selecionar música quando a reprodução está pausada.");
        }
    }
}
