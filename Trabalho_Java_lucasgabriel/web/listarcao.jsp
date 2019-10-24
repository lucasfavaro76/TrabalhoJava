<%@page import="br.com.trabalhojava.model.Cao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
        <link href="css/datatables.css" rel="stylesheet" type="text/css"/>
        <link href="css/dataTables.bootstrap4.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cães</title>
    </head>
    <body>
        <div class="body_bg">            
            <div class="app-container body-tabs-shadow fixed-sidebar fixed-header">
                <header class="main_menu single_page_menu">
                    <div class="container">
                        <div class="row align-items-center">
                            <div class="col-lg-12">
                                <nav class="navbar navbar-expand-lg navbar-light">
                                    <a class="navbar-brand" href="index.jsp">
                                        <img src="img/logo.png" alt="logo"> </a>
                                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                            aria-expanded="false" aria-label="Toggle navigation">
                                        <span class="menu_icon">
                                            <i class="fas fa-bars"></i>
                                        </span>
                                    </button>                                                                                                    

                                    <div class="collapse navbar-collapse main-menu-item" id="navbarSupportedContent">
                                       <ul class="navbar-nav">
                                            <li class="nav-item">
                                                <a class="nav-link" href="index.jsp">Home</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="ListarRaca">Cadastro</a>
                                            </li> 
                                            <li class="nav-item">
                                                <a class="nav-link" href="cadastrarraca.jsp">Cadastrar Raça</a>
                                            </li> 
                                            <li class="nav-item">
                                                <a class="nav-link" href="ListarCao">Listar</a>
                                            </li> 
                                        </ul>
                                    </div>                                
                                </nav>
                            </div>
                        </div>
                    </div>

                </header> 
            </div>



            <section style="padding-top: 9vh;">
                <div class="responsive-table">
                    <table id="myTable" class="align-middle table table-striped table-hover">

                        <thead>
                            <tr>

                                <th class="text-center">#</th>                                            
                                <th>NOME</th>
                                <th class="text-center">IDADE</th> 
                                <th class="text-center">PESO</th>
                                <th class="text-center">RAÇA</th>
                                <th class="text-center">AÇÃO</th>
                                <th class="text-center">AÇÃo</th>


                            </tr>

                        </thead>

                        <tbody>
                            <%
                                List<Cao> caes = (List<Cao>) request.getAttribute("caes");
                                for (Cao cao : caes) {
                            %>

                            <tr class="line">
                                <td class="text-center text-muted"><%=cao.getId_cao()%></td>
                                <td>
                                    <div class="widget-content p-0">
                                        <div class="widget-content-wrapper">
                                            <!--<div class="widget-content-left mr-3">
                                                <div class="widget-content-left">
                                                    <img width="40" class="rounded-circle" src="assets/images/avatars/4.jpg" alt="">
                                                </div>
                                            </div>-->
                                            <div class="widget-content-left flex2">
                                                <div class="widget-heading"><%=cao.getNome_cao()%></div>

                                            </div>
                                        </div>
                                    </div>
                                </td>                        

                                <td class="text-center">
                                    <%=cao.getIdade_cao()%>
                                </td>

                                <td class="text-center">
                                    <%=cao.getPeso_cao()%>
                                </td>
                                <td class="text-center">
                                    <%=cao.getRacaCao().getDesc_raca()%>
                                </td>

                                <td class="text-center">        
                                    <a href="CarregarCao?idCao=<%=cao.getId_cao()%>"><button class="btn btn-warning">ALTERAR</button></a>
                                </td>
                                <td class="text-center">
                                    <a href="ExcluirCao?idCao=<%=cao.getId_cao()%>"><button class="btn btn-danger">EXCLUIR</button></a>
                                </td>
                            </tr>                                   

                            <% }%>
                        </tbody>

                    </table>
                </div>
            </section>
        </div>
        <script src="js/jquery-1.12.1.min.js" type="text/javascript"></script>
        <script src="js/datatables.js" type="text/javascript"></script>
        <script src="js/paginacao.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
