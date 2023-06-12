<html>
<head> 
    <title> Deleting auto </title> 

    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600&family=Poppins:wght@100;200;400;600;800&display=swap" rel="stylesheet">

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
<h2>Choose auto to delete:</h2>
<table border="1">
    <!--  // вывод «шапки» таблицы -->
    <thead>
        <tr class='sticky'>
            <th> auto_mark </th>
            <th> model </th> 
            <th> year </th> 
            <th> price </th> 
            <th> Delete </th>
        </tr>
    </thead>
    <?php 
        $result = $mysqli->query('SELECT * FROM auto'); // запрос на выборку сведений о пользователях
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
                echo "<td><a href='delete.php?auto_mark=" . $row['auto_mark'] . "' class='delete'>Delete</a></td>"; // запуск скрипта для удаления записи
            echo "</tr>";
        }
        echo "</table>";
        $num_rows = mysqli_num_rows($result); // число записей в таблице БД
    ?>

        <!-- <a href="new.html" class='btn'> Add user </a> -->
        <a href="index2.php" class='btn'  style="background-color: #483D8B"> Back to main </a>        
        </main>
    </div>
</body> 
</html>