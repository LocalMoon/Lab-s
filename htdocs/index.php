<html>
<head> 
    <title> Start page </title> 
    <link rel="stylesheet" href="style.css">
    <!-- <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600&family=Poppins:wght@100;200;400;600;800&display=swap" rel="stylesheet"> -->

    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body{
            font-family: 'Manrope';
        }
        body:not(h2){
            text-align: center;
        }
         .wrapper{
            width: 100vw;
            height: 100vh;
            ;
        }
        .main{
            position: absolute;
            top: 9%;
            left: 50%;
            transform: translateX(-50%);
            display: flex;
            flex-direction: column;
            row-gap: 20px;
        }
        table{
            display: block;
            border: 3px solid #222;
            border-collapse: collapse;
            max-height: 400px;
            overflow: auto;
            border-radius: 4px;
            box-shadow: 0 4px 4px rgb(0 0 0 / 30%);
            background-color: rgba(255, 255, 255, 0.8);
        }
        tr{
            /* border: 3px solid #222; */
            

        }
        th{
           
           background-color: #0000CD;
           color: rgba(255, 255, 255, 0.8);
       }
       .sticky{
           /* position: sticky;
           top: 0px; */
           outline: 1px solid #222
       }
       th, td{
           padding: 5px 30px;
           /* border: 3px solid #222; */
       }
       thead{
           background-color: #222;
           position: sticky;
           top: 0px;
       }
       a{
           text-decoration: none;
       }
       .edit:link, .edit:visited{
           font-weight: 600;
           color: green;
       }
       .delete:link, .delete:visited{
           font-weight: 600;
           color: #f34723;
       }
       .btn{
           box-shadow: 0 0 60px rgba(5, 28, 160, 0.671);
           display: block;
           width: 50%;
           padding: 7px 0;
           background: #222;
           border-radius: 10px;
           border: none;
           font-size: 12px;
           font-weight: 500;
           line-height: 20px;
           color: #fff;
           margin: 0 auto;
       }

       .main-f{
           padding-top: 100px;
           max-width: 1200px;
           margin: 0 auto;
       }
       main h2{
           margin-bottom: 30px;
           color: white;
       }
       /* .btn-f{
           display: block;
           max-width: 20%;
           padding: 5px 20px;
           /* background: #222; */
           border-radius: 10px;
           border: none;
           font-size: 12px;
           font-weight: 500;
           line-height: 20px;
           color: #fff;
           margin: 0 auto;
           margin-bottom: 20px;
       } */

       table::-webkit-scrollbar {
   width: 3px;                                /* ширина scrollbar */
   background-color: transparent;        /* цвет дорожки */
}

table::-webkit-scrollbar-thumb {
   background-color: #222;    /* цвет плашки */
   border-style: none;                             /* padding вокруг плашки */
}

    </style>




</head>
<body>
    
<script>
    var openSite = function() {
        console.log(1);
        openedWindow = window.open('index2.php');
        // openedWindow.close();
        // window.close();
    }
</script>

<?php

// Ищем возможные ошибки
$link = mysqli_connect("localhost", "root", "root", "users");
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);// включаем сообщения об ошибках
$mysqli = new mysqli("localhost", "root", "root", "users"); // коннект с сервером бд
$mysqli->set_charset("utf8mb4"); // задаем кодировку

?>
    <div class="wrapper" style="background-color: gray;">
        <main class="main-f">
            <a href="#" onclick="openSite()" class='btn-f' style="margin-top: 120px; height: 200px; line-height: 180px; box-sizing: border-box; font-size: 30px"> Open site </a>
        </main>
    </div>
</body> 
</html>