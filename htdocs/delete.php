<html> 
<head>
<title> Deletion user data </title>
<link rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600&family=Poppins:wght@100;200;400;600;800&display=swap" rel="stylesheet">
</head>
<body>
<?php
mysqli_connect("localhost", "root", "root", "auto_salon") or die ("Impossible to link the server");

print'
    <style>
    *{
        margin: 0;
        paddding: 0;
        box-sizing: border-box;

    }
    body{
        text-align: center;
        font-family: "Manrope";
        font-weight: 600;
    }
    .wrapper{
        position: fixed;
        top: 0;
        left: 0;
        width: 100vw;
        height: 100vh;
    }

    .main{
        position: absolute;
        top: 10%;
        left: 50%;
        transform: translateX(-50%);
        box-shadow: 0 4px 4px rgb(0 0 0 / 30%);
        border-radius: 15px;
        padding: 20px 30px 20px;
        display: flex;
        flex-direction: column;
        row-gap: 20px;
    }
    p{
        margin-top: 20px;
    }

    a{
        display: block;
        max-width: 200px;
        margin: 0 auto;
        border-radius: 4px;
        text-align: center;
        text-decoration: none;
        color: #222;
        font-weight: 600;
        padding: 5px 20px;
        border: 2px solid rgb(0 0 0 / 30%);
    }
    </style>
    <div class="wrapper">
        <main class="main">
';


$url = ((!empty($_SERVER['HTTPS'])) ? 'https' : 'http') . '://' . $_SERVER['HTTP_HOST'] . $_SERVER['REQUEST_URI'];
$id8 = explode("=", $url);


$zapros="DELETE FROM auto WHERE auto_mark='" . $id8[1] ."'";

$link = mysqli_connect("localhost", "root", "root", "auto_salon");
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);// включаем сообщения об ошибках
$mysqli = new mysqli("localhost", "root", "root", "auto_salon"); // коннект с сервером бд
$mysqli->set_charset("utf8mb4"); // задаем кодировку
$result = $mysqli->query($zapros);

$url = ((!empty($_SERVER['HTTPS'])) ? 'https' : 'http') . '://' . $_SERVER['HTTP_HOST'] . $_SERVER['REQUEST_URI'];


if ($link == false) {
    echo("Connection failed");
} 
else {
    print("<br>" . $zapros);
    $result = mysqli_query($link, $zapros, MYSQLI_USE_RESULT);    
    if ($result == false) {
        print "<p>Deletion error </p>";
    } else {
        print '<p>Auto was deleted </p>';  
    }
    print "<a href=\"index2.php\" style='background-color: #483D8B'> Back to main </a>";
}

print '</main></div>';
?>
</body> 
</html>


