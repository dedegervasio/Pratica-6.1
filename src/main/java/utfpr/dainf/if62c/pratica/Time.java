/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author a1614193
 */
public class Time {
    private HashMap<String, Jogador> jogadores = new HashMap<>();       //A string deve ser completa com a posição de cada jogador
    private String nome = new String();
    
    public Time(String nome)
    {
        this.nome = nome;
    }
    
    public HashMap getJogadores()
    {
        return this.jogadores;
    }
    
    public void addJogador(String position,Jogador player)
    {
        this.jogadores.put(position,player);
    }
    
    public String getNome()
    {
        return this.nome;
    }
}
