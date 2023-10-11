package IPhone;

import IPhone.AparelhoTelefonico.Telefone;
import IPhone.NavegadorInternet.Safari;
import IPhone.ReprodutorMusical.Ipod;

public class Iphone {
    public static void main(String[] args) {
        Telefone meuTelefone = new Telefone();
        meuTelefone.ligar("123-456-789");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();

        Ipod meuIpod = new Ipod();
        meuIpod.tocar();
        meuIpod.selecionarMusica("James Blunt - Same Mistake");
        meuIpod.pausar();

        Safari meuSafari = new Safari();
        meuSafari.exibirPagina("https://github.com/DurezahGeek");
        meuSafari.adicionarNovaAba("www.google.com");
        meuSafari.atualizarPagina();
    }
}




