
<%@page import="java.util.List"%>
<%@page import="br.com.trabalhojava.model.RacaCao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html;" charset=UTF-8">
        <title>Cadastro de Cães</title>
    </head>
    <body>

        <div class="body_bg">

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



            <main class="site-main">
                <div class="container teste">
                    <hr>                 
                    <p class="text-center" color="black" >${mensagem}</p> 

                    <!--Replace this action with your own mailchimp post URL. Don't remove the "". Just paste the url inside "".-->
                    <form action="CadastrarCao" method="POST" class="p-5 needs-validation" novalidate>                                



                        <div class="row">
                            <div class="col-md-12  mb-3">
                                <input type="hidden" name="id_usuario" />
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="col-md-6  mb-2">
                                <label for="nome_cao">Nome do Cão:</label>
                                <input type="text" minlength="6" name="nome_cao"  class="form-control" placeholder="Digite o nome do animal" required />
                            </div>
                            <div class="col-md-6  mb-2" >
                                <label for="idade_cao">Idade do Cão</label>
                                <input type="number" minlength="8" name="idade_cao" placeholder="Digite a idade do animal" class="form-control" required/>

                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-2">
                                <label for="peso_cao">Peso do Cão</label>
                                <input type="number" step="0.01" name="peso_cao" placeholder="Digite o peso do animal" class="form-control" required/>
                            </div>
                            <div class="col-md-6  mb-2" >
                                <label for="id_raca">Raça do Cão</label>
                                <select id="desc_tipo" name="id_raca" class="form-control">
                                    <option value="" selected>Selecione uma das opções</option>

                                    <%
                                        List<RacaCao> racas = (List<RacaCao>) request.getAttribute("racas");
                                        for (RacaCao raca : racas) {

                                    %>

                                    <option value="<%=raca.getId_raca()%>"><%=raca.getDesc_raca()%></option>
                                    <%}%>
                                </select>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col-md-4 mb-3">
                                <input class="btn_1 d-none d-sm-block" type="submit" name="Enviar" value="Enviar" required/>
                            </div>
                        </div>
                    </form>                    
                </div>
            </main>


            <footer class="footer">

            </footer>
        </div>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.1.min.js" type="text/javascript"></script>
    </body>
</html>
