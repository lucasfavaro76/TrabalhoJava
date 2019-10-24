/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhojava.DAO;

import br.com.trabalhojava.model.RacaCao;
import br.com.trabalhojava.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC 05
 */
public class RacaCaoDAOImpl implements GenericDAO {
    
    private Connection conn;

    public RacaCaoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        RacaCao racacao = (RacaCao) object;
        
        PreparedStatement stmt = null;

        String sql = "INSERT INTO raca_cao(desc_raca) VALUES(?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, racacao.getDesc_raca());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao cadastrar Raça! Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> raca_caes = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT *  FROM raca_cao";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                RacaCao raca_cao = new RacaCao();
                raca_cao.setId_raca(rs.getInt("id_raca"));
                raca_cao.setDesc_raca(rs.getString("desc_raca"));

                raca_caes.add(raca_cao);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar a Raça dos Cães! Erro: " + ex.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
            }
        }
        return raca_caes;
    }

    @Override
    public Boolean excluir(int idObject) {
        return null;
        /*PreparedStatement stmt = null;
        String sql = "delete from usuario where id_usuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir Usuario. ERRO: " + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);

            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexão!! ERRO: " + ex.getMessage());
            }
        }*/
    }

    @Override
    public Boolean alterar(Object object) {
        return null;
        /*Usuario usuario = (Usuario) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set nome_usuario = ?, cpf_usuario = ?, login_usuario = ?, senha_usuario = ? where id_usuario = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getCpfUsuario());
            stmt.setString(3, usuario.getLoginUsuario());
            stmt.setString(4, usuario.getSenhaUsuario());
            stmt.setInt(5, usuario.getIdUsuario());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Problemas ao alterar Usuário! Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
            }
        }*/
    }

    @Override
    public Object carregar(int idObject) {
        return null;
       /*List<Object> tipo_usuarios = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT *  FROM tipo_usuario";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                TipoUsuario tipo_usuario = new TipoUsuario();
                tipo_usuario.setId_tipo_usuario(rs.getInt("id_usuario"));
                tipo_usuario.setDesc_tipo_usuario(rs.getString("nome_usuario"));

                tipo_usuarios.add(tipo_usuario);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar o tipo do Usuario! Erro: " + ex.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
            }
        }
        return tipo_usuarios;*/
    }

    
}
