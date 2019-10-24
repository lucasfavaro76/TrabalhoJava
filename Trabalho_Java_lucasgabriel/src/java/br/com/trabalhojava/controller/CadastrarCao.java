/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhojava.controller;

import br.com.trabalhojava.DAO.CaoDAOImpl;
import br.com.trabalhojava.DAO.GenericDAO;
import br.com.trabalhojava.model.Cao;
import br.com.trabalhojava.model.RacaCao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC 05
 */
@WebServlet(name = "CadastrarCao", urlPatterns = {"/CadastrarCao"})
public class CadastrarCao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            request.setCharacterEncoding("UTF-8");
            
            String nome_cao = request.getParameter("nome_cao");
            Integer idade_cao = Integer.parseInt(request.getParameter("idade_cao"));
            Double peso_cao = Double.parseDouble(request.getParameter("peso_cao"));
            Integer id_raca = Integer.parseInt(request.getParameter("id_raca"));

            String mensagem = null;

            Cao cao = new Cao();
            cao.setNome_cao(nome_cao);
            cao.setIdade_cao(idade_cao);
            cao.setPeso_cao(peso_cao);
            cao.setRacaCao(new RacaCao(id_raca));

            try {
                GenericDAO dao = new CaoDAOImpl();
                if (dao.cadastrar(cao)) {
                    mensagem = "Cão cadastrado com sucesso";
                } else {
                    mensagem = "Problemas ao cadastrar cão";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println("Problemas no Servlet ao cadastrar Usuário! Erro: " + e.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
