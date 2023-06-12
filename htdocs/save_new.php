<html>
    <head> 
        <title> Adding of new auto </title> 
    </head>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600&family=Poppins:wght@100;200;400;600;800&display=swap" rel="stylesheet">
    <body>

<?php
print '
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
        width: 100vw;
        height: 100vh;
        // background-image: linear-gradient(90deg, rgba(246,232,110,1) 0%, rgba(255,253,113,1) 25%, rgba(255,218,33,1) 100%);;
    }

    .main{
        position: absolute;
        top: 10%;
        left: 50%;
        transform: translateX(-50%);
        // background-color: rgba(255, 255, 255, 0.8);
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
        // background-image: rgba(255, 255, 255, 0.9);
        padding: 5px 20px;
        border: 2px solid rgb(0 0 0 / 30%);
    }
    </style>
    <div class="wrapper">
        <main class="main">
';

$link = mysqli_connect("localhost", "root", "root", "auto_salon");
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);// включаем сообщения об ошибках
$mysqli = new mysqli("localhost", "root", "root", "auto_salon"); // коннект с сервером бд
$mysqli->set_charset("utf8mb4"); // задаем кодировку

$sql_add = "INSERT INTO auto SET auto_mark='" . $_GET['auto_mark'] ."', model='".$_GET['model']. "', year='".$_GET['year']."', price='" .$_GET['price']."'"; 

print "<a href=\"index2.php\" style='background-color: #483D8B'> Back to main </a>";
if ($link == false) {
    echo("Connection failed");
} 
else {
    print($sql_add);
    $result = mysqli_query($link, $sql_add, MYSQLI_USE_RESULT);    
    if ($result == false) {
        print "
        
        ";
        
    } else {
        print "
        <style>
            .wrapper{
                width: 100vw;
                height: 100vh;
            }
        </style>
            <p>auto was registered</p>
        ";  
    }
    print "<a href=\"index2.php\" style='background-color: #483D8B'> Back to main </a>";
}

print "</main></div>";
?>




</body>
</html>



