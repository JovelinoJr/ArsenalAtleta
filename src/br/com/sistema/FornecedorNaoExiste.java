/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.exception;

/**
 *
 * @author Thiago William
 */
public class FornecedorNaoExiste extends Exception {
    
    public FornecedorNaoExiste(String mensagem) {
        super("Este Fornecedor Não Existe");
    }
    
}
