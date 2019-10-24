<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>

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




            <section class="banner_part">
                <div class="container">

                    <p class="text-center" style="color: #fff;">${mensagem}</p>

                    <div class="row align-items-center justify-content-between">
                        <div class="col-lg-6 col-md-8">
                            <div class="banner_text">
                                <div class="banner_text_iner">
                                    <h1>Dogs</h1>
                                    <p>Cadastre o seu cão aqui!!</p>

                                    <a href="ListarRaca" class="btn_1">Cadastrar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>        
        </div>
        <script src="js/jquery-1.12.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
