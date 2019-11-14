/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    public Connection pegaConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/sorteador", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
