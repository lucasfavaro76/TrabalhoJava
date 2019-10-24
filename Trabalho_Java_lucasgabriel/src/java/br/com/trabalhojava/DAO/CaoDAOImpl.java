
package br.com.trabalhojava.DAO;

import br.com.trabalhojava.model.Cao;
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
public class CaoDAOImpl implements GenericDAO {

    private Connection conn;

    public CaoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Cao cao = (Cao) object;

        PreparedStatement stmt = null;

        String sql = "INSERT INTO cao(nome_cao, idade_cao, peso_cao, fk_raca) VALUES(?, ?, ?, ?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cao.getNome_cao());
            stmt.setInt(2, cao.getIdade_cao());            
            stmt.setDouble(3, cao.getPeso_cao());
            stmt.setInt(4, cao.getRacaCao().getId_raca());
            
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao cadastrar Cão! Erro: " + e.getMessage());
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
        List<Object> caes = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from cao INNER JOIN raca_cao on cao.fk_raca = raca_cao.id_raca order by cao.nome_cao";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cao cao = new Cao();
                cao.setId_cao(rs.getInt("id_cao"));
                cao.setNome_cao(rs.getString("nome_cao"));
                cao.setIdade_cao(rs.getInt("idade_cao"));
                cao.setPeso_cao(rs.getDouble("peso_cao"));                                                
                cao.setRacaCao(new RacaCao(rs.getInt("id_raca"),rs.getString("desc_raca")));

                caes.add(cao);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Usuario! Erro: " + ex.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
            }
        }
        return caes;
        
    }

    @Override
    public Boolean excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "delete from cao where id_cao = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir Cão. ERRO: " + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);

            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexão!! ERRO: " + ex.getMessage());
            }
        }
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
       PreparedStatement stmt = null;
        ResultSet rs = null;
        Cao cao = null; 
        String sql = "select * from cao where cao.id_cao = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while(rs.next()){
                cao = new Cao();
                cao.setId_cao(rs.getInt("id_cao"));
                cao.setNome_cao(rs.getString("nome_cao"));
                cao.setIdade_cao(rs.getInt("idade_cao"));
                cao.setPeso_cao(rs.getDouble("peso_cao"));
                cao.setRacaCao(new RacaCao(rs.getInt("id_raca"),rs.getString("desc_raca")));
                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao Listar usuario!!! ERRO: " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt,rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão!!! ERRO: " + ex.getMessage());
            }
        }
        return cao;
    }
    
}
