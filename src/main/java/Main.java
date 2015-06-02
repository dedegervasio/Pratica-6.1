
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import java.util.HashMap;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

public class Main {

    public static void main(String[] args) {
        Time time1 = new Time("Dragões do Oriente");
        Time time2 = new Time("Serpentes insípidas");
        

        time1.addJogador("Goleiro", new Jogador(24, "Hansel"));
        time1.addJogador("Atacante", new Jogador(21, "Zeus"));
        time1.addJogador("Zagueiro", new Jogador(31, "Fran"));

        time2.addJogador("Goleiro", new Jogador(42, "Gretel"));
        time2.addJogador("Atacante", new Jogador(12, "Hera"));
        time2.addJogador("Zagueiro", new Jogador(13, "Baltier"));
        
        System.out.println("Times:  " + time1.getNome() + "  " + time2.getNome());
        System.out.println("Goleiros:  " + time1.getJogadores().get("Goleiro") + "  " + time2.getJogadores().get("Goleiro"));
        System.out.println("Atacantes:  " + time1.getJogadores().get("Atacante") + "  " + time2.getJogadores().get("Atacante"));
        System.out.println("Zagueiros:  " + time1.getJogadores().get("Zagueiro") + "  " + time2.getJogadores().get("Zagueiro"));
        
    }
}
