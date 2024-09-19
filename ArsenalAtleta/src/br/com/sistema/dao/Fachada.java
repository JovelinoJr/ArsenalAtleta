/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConexaoBanco;
import br.com.sistema.model.Clientes;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Funcionarios;
import br.com.sistema.model.Produtos;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 

 */
public class Fachada {
    private static Fachada instance;
    
    private ClientesDAO clientesDAO;
    private FornecedoresDAO fornecedoresDAO;
    private FuncionariosDAO funcionariosDAO;
    private ProdutosDAO produtosDAO;
    
    public Fachada() {
       this.clientesDAO = new ClientesDAO();
       this.fornecedoresDAO = new FornecedoresDAO();
       this.funcionariosDAO = new FuncionariosDAO();
       this.produtosDAO = new ProdutosDAO();
    }
/* Começa a fachada dos Clientes */
    
    public void salvarCliente(Clientes cliente) {
       try {
           clientesDAO.Salvar(cliente);
       }  catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o Cliente " + e.getMessage());
       }
    }
    public void editarCliente(Clientes cliente) {
        try {
            clientesDAO.Editar(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Cliente :: " + e.getMessage());
        }
    }
    public void excluirCliente(Clientes cliente) {
        try {
            clientesDAO.Excluir(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Cliente : " + e.getMessage());
        }
    }
    public Clientes buscarCliente(String nome) {
        try {
            return clientesDAO.BuscarCliente(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente pelo Nome : " + e.getMessage());
            return null;
        }
    }
    public Clientes buscarClienteCpf(String cpf) {
        try {
            return clientesDAO.BuscarClienteCPF(cpf);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente pelo CPF : " + e.getMessage());
            return null;
        }
    }
    public List<Clientes> ListarCliente() {
        try {
            return clientesDAO.Listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Cliente: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    public List<Clientes> filtrarClientesPorNome(String nome) {
        try {
            return clientesDAO.Filtrar(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar Cliente pelo nome: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    /* Começa a fachada dos Fornecedores */
    
    public void salvarFornecedores(Fornecedores fornecedores) {
       try {
           fornecedoresDAO.Salvar(fornecedores);
       }  catch (Exception e) {
           System.out.println("Erro ao salvar fornecedor : " + e.getMessage());
       }
    }
    
    public void editarFornecedores(Fornecedores fornecedores) {
        try {
            fornecedoresDAO.Editar(fornecedores);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Fornecedor: " + e.getMessage());
        }
    }
    public void excluirFornecedores(Fornecedores fornecedores) {
        try {
            fornecedoresDAO.Excluir(fornecedores);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + e.getMessage());
        }
    }
    public Fornecedores BuscarFornecedores(String nome) {
        try {
            return fornecedoresDAO.BuscarFornecedores(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar fornecedores : " + e.getMessage());
            return null;
        }
    }
    public List<Fornecedores> Listar() {
        try {
            return fornecedoresDAO.Listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar fornecedores : " + e.getMessage());
            return new ArrayList<>();
        }
    }
    public List<Fornecedores> Filtrar(String nome) {
        try {
            return fornecedoresDAO.Filtrar(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar fornecedores : " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    /* Começa fachada dos Funcinarios */
    
    
    public void salvarFuncionario(Funcionarios funcionario) {
        try {
            funcionariosDAO.Salvar(funcionario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar funcionario: " + e.getMessage());
        }
    }

    public void editarFuncionario(Funcionarios funcionario) {
        try {
            funcionariosDAO.Editar(funcionario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar funcionario: " + e.getMessage());
        }
    }

    public void excluirFuncionario(Funcionarios funcionario) {
        try {
            funcionariosDAO.Excluir(funcionario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario: " + e.getMessage());
        }
    }

    public Funcionarios buscarFuncionarioPorNome(String nome) {
        try {
            return funcionariosDAO.BuscarFuncionario(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario por nome: " + e.getMessage());
            return null;
        }
    }

    public List<Funcionarios> listarTodosFuncionarios() {
        try {
            return funcionariosDAO.Listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Funcionario: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Funcionarios> filtrarFuncionariosPorNome(String nome) {
        try {
            return funcionariosDAO.Filtrar(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar funcionarios pelo nome: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void efetuarLogin(String email, String senha) {
        try {
            funcionariosDAO.efetuarlogin(email, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar login: " + e.getMessage());
        }
    }
    
    /* Começa a fachada dos Produtos */
    
    public void salvarProduto(Produtos produto) {
        try {
            produtosDAO.Salvar(produto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto: " + e.getMessage());
        }
    }

    // Método para editar um produto
    public void editarProduto(Produtos produto) {
        try {
            produtosDAO.Editar(produto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o produto: " + e.getMessage());
        }
    }

    // Método para excluir um produto
    public void excluirProduto(Produtos produto) {
        try {
            produtosDAO.Excluir(produto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto: " + e.getMessage());
        }
    }

    // Método para buscar um produto por nome
    public Produtos buscarProduto(String nome) {
        try {
            return produtosDAO.BuscarProdutos(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto: " + e.getMessage());
        }
        return null;
    }

    // Método para listar todos os produtos
    public List<Produtos> listarProdutos() {
        try {
            return produtosDAO.Listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os produtos: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    // Método para filtrar produtos por nome
    public List<Produtos> filtrarProdutosPorNome(String nome) {
        try {
            return produtosDAO.Filtrar(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar os produtos: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    // Método para adicionar estoque de um produto
    public void adicionarEstoque(int id, int qtd) {
        try {
            produtosDAO.adicionarEstoque(id, qtd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar estoque: " + e.getMessage());
        }
    }

    // Método para dar baixa no estoque de um produto
    public void baixarEstoque(int id, int qtd) {
        try {
            produtosDAO.baixaEstoque(id, qtd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao dar baixa no estoque: " + e.getMessage());
        }
    }

}
    
 
