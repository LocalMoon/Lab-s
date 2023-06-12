<html>
<head> 
    <title> Filtration of auto </title> 

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
        body:not(h2){
            text-align: center;
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
           
            background-color: #222;
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

        table::-webkit-scrollbar {
    width: 3px;                                /* ширина scrollbar */
    background-color: transparent;        /* цвет дорожки */
}

table::-webkit-scrollbar-thumb {
    background-color: #222;    /* цвет плашки */
    border-style: none;                             /* padding вокруг плашки */
}

    </style> -->

</head>
<body>

<?php 
    $link = mysqli_connect("localhost", "root", "root", "auto_salon");
    mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);// включаем сообщения об ошибках
    $mysqli = new mysqli("localhost", "root", "root", "auto_salon"); // коннект с сервером бд
    $mysqli->set_charset("utf8mb4"); // задаем кодировку
?>

<div class="wrapper" style="background-color: #483D8B;">
<main class="main">
<h2>Select the year to filter the auto:</h2>
<!-- <select name="sorting" style="width: 150px; height: 25px; align-self: center; font-size: 15px;">
  <option value="auto_mark">auto_mark</option>
  <option value="model">model</option>
  <option value="height">year</option>
  <option value="weight">weight</option>
</select>
<select name="table9" id="table9" style="width: 90px; margin-left: -8px;">                            
    <option value="invoice">invoice</option>
    <option value="product">product</option>
    <option value="receipt_invoice">receipt_invoice</option>
</select> -->
<!-- <table border="1">
    <thead>
        <tr class='sticky'>
            <th> auto_mark </th>
            <th> model </th> 
            <th> height (sm) </th> 
            <th> weight </th> 
        </tr>
    </thead>
    <?php 
        $result = $mysqli->query('SELECT * FROM auto order by price'); // запрос на выборку сведений о пользователях
        while ($row = mysqli_fetch_array($result)) {// для каждой строки из запроса
            echo "<tr>";
                echo "<td>";
                print($row['auto_mark']);
                echo "</td>";
                echo "<td>";
                print($row['model']);
                echo "</td>";
                echo "<td>";
                print($row['year']);
                echo "</td>";
                echo "<td>";
                // print($row['weight']);
                print(number_format($row['price'], 2));
                echo "</td>";
            echo "</tr>";
        }
        echo "</table>";
        $num_rows = mysqli_num_rows($result); // число записей в таблице БД
        print("<P>Total number of auto: $num_rows </p>");
    ?> -->

        <!-- <a href="new.html" class='btn'> Add user </a> -->


        <form action="filtration.php" metod="get">
            <div class="inputs">
                <div class="inpt__cont">
                    <div style="display:inline-block; align-self: center;">
                        <input type="text" name="id12" id="" value="Year >= " style="width: 130px; height: 20px;" disabled>
                        <input type="number" name="id13" id="" min="1950" max="2023" style="width: 50px; height: 20px;"><br><br>
                        <!-- <div class="inpt__cont"> -->
                            <input name="add" type="submit" class='btn' value="Show result" style="width: 270px; display:inline-block; margin-left: 20px; align-self: center; margin-right: 20px;">
                        <!-- </div> -->
                    </div>
                </div>
            </div>
        </form>

        <a href="index2.php" class='btn' style="background-color: #483D8B"> Back to main </a>        
        </main>
    </div>
</body> 
</html>