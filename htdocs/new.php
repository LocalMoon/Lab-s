<html>
    <head> 
        <title> Adding new auto </title> 
    </head>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600&family=Poppins:wght@100;200;400;600;800&display=swap" rel="stylesheet">
    <!-- <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body{
            font-family: 'Manrope';
        }

        .wrapper{
            width: 100vw;
            height: 100vh;
            background-image: linear-gradient(90deg, rgba(246,232,110,1) 0%, rgba(255,253,113,1) 25%, rgba(255,218,33,1) 100%);;
        }
        .main{
            position: absolute;
            top: 9%;
            left: 50%;
            transform: translateX(-50%);
        }
        h2{
            text-align: center;
        }

        .inpt__cont{
            display: flex;
            flex-direction: column;
            row-gap: 4px;;
        }
        .main{
            display: flex;
            flex-direction: column;
            row-gap: 10px;
        }
        form{
            display: flex;
            flex-direction: column;
            row-gap: 20px;
        }
        input[type='submit'], input[type='reset']{
            display: block;
            width: 100%;
            padding: 6px 0;
            background: #222;
            border-radius: 10px;
            border: none;
            font-size: 12px;
            font-weight: 500;
            line-height: 20px;
            color: #fff;
        }
        a{
            text-align: center;
            text-decoration: none;
            color: #222;
            font-weight: 600;
        }
        .inputs{
            display: flex;
            flex-direction: column;
            row-gap: 7px;
        }
        input, textarea{
            border-radius: 4px;
            padding: 5px;
            font-family: 'Manrope';
            border: none;
            background-color: rgba(255, 255, 255, 0.8);
        }
        textarea{
            resize: none;
        }
        textarea:focus{
            outline: none;
        }
        input:focus{
            outline: none;
        }
        label{
            font-weight: 600;
        }
        .btn{
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
    </style>
    -->
   <body>

        <div class="wrapper" style="background-color: #483D8B;">
            <main class="main">
                <!-- <h2>Adding new auto:</h2> -->

    <?php
        $link = mysqli_connect("localhost", "root", "root", "auto_salon");
        mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);// включаем сообщения об ошибках
        $mysqli = new mysqli("localhost", "root", "root", "auto_salon"); // коннект с сервером бд
        $mysqli->set_charset("utf8mb4"); // задаем кодировку
        $result = $mysqli->query('SELECT * FROM auto');
        $num_rows = mysqli_num_rows($result);
        if ($num_rows < 12){
            echo('
            <h2>Adding new auto:</h2>
            <form action="save_new.php" metod="get">
                <div class="inputs">
                    
                    <div class="inpt__cont">
                        <label>auto_mark:</label> <input name="auto_mark" size="50" type="text" pattern="[A-Za-z]{2,}" title="English letters only, min 2 symbols">
                    </div>
                    
                    <div class="inpt__cont">
                        <label>model:</label> <input name="model" size="20" type="text" pattern="[A-Za-z]{2,}" title="English letters only, min 2 symbols">
                    </div>
                    
                    <div class="inpt__cont">
                        <label>year:</label> <input name="year" size="20" type="number" min="1950" max="2023" step="1">
                    </div>
                    
                    <div class="inpt__cont">
                        <label>price:</label> <input name="price" size="30" type="number" min="50" max="1000000" step="0.1" lang="en">
                    </div>

                </div>

                <div class="inpt__cont">
                    <input name="add" type="submit" value="Add">
                    <input name="b2" type="reset" value="Clear">
                </div>
            </form>
            ');
        }
        else {
            echo('
            <h2>Adding new auto is impossible</h2>
            <p>Maximum number of auto = 12.</p>
            <p>For adding new auto, firstly go to main and delete any auto.</p>
            <br>
            ');
        }
    ?>

                <a href="index2.php" class='btn' style="background-color: #483D8B"> Back to main </a>  
            </main>
        </div>
    </body>
</html>