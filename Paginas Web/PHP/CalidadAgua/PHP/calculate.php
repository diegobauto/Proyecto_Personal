<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="../Styles/calculate.css">
        <title>Water Quality</title>
    </head>
    <body>
        <div class="fondo">
            <center>
                <h1>Water Quality</h1>
            </center>
        </div>
        <div class="container">
            <?php
                $option = $_GET['option'];
                if ($option == "DBO") {    
                    echo "<h1 id='option'>DBO</h1>";
                    echo "<div class='content-option'>
                    <form method='POST'>
                        <input type='number' name='var' id='' min='1'><br>
                        <br><input type='submit' value='Calculate' name='calculate'></div>
                    </form>";
                    $var = 0;
                    if($var != " "){
                        if(isset($_POST['calculate'])){?>
                            <div class="calidad">
                                <?php
                                $var = (int)$_POST['var'];
                                if ($var <= 3){
                                    echo "<div class='excelent'>";
                                }
                                elseif($var>3 and $var<=6){
                                    echo "<div class='good'>";
                                }
                                elseif($var>6 and $var<=30){
                                    echo "<div class='acceptable'>";
                                }
                                elseif($var>30 and $var<=120){
                                    echo "<div class='polluted'>";
                                }
                                elseif($var>120){
                                    echo "<div class='heavily-polluted'>";
                                }
                                "</div></div>";?>
                            </div>
                            <?php
                        }
                    }
                }
                elseif($option == "DQO"){
                    echo "<h1 id='option'>DQO</h1>";
                    echo "<div class='content-option'>
                    <form method='POST'>
                        <input type='number' name='var' id='' min='1'><br>
                        <br><input type='submit' value='Calculate' name='calculate'></div>
                    </form>";
                    $var = 0;
                    if($var != " "){
                        if(isset($_POST['calculate'])){?>
                            <div class="calidad">
                                <?php
                                $var = (int)$_POST['var'];
                                if ($var < 10){
                                    echo "<div class='excelent'>";
                                }
                                elseif($var>10 and $var<=20){
                                    echo "<div class='good'>";
                                }
                                elseif($var>20 and $var<=40){
                                    echo "<div class='acceptable'>";
                                }
                                elseif($var>40 and $var<=200){
                                    echo "<div class='polluted'>";
                                }
                                elseif($var>200){
                                    echo "<div class='heavily-polluted'>";
                                }
                                "</div></div>";?>
                            </div>
                            <?php
                        }
                    }
                }
                elseif($option == "SST"){
                    echo "<h1 id='option'>SST</h1>";
                    echo "<div class='content-option'>
                    <form method='POST'>
                        <input type='number' name='var' min='1'><br>
                        <br><input type='submit' value='Calculate' name='calculate'></div>
                    </form>";
                    $var = 0;
                    if($var != " "){
                        if(isset($_POST['calculate'])){?>
                            <div class="calidad">
                                <?php
                                $var = (int)$_POST['var'];
                                if ($var <= 25){
                                    echo "<div class='excelent'>";
                                }
                                elseif($var>25 and $var<=75){
                                    echo "<div class='good'>";
                                }
                                elseif($var>75 and $var<=150){
                                    echo "<div class='acceptable'>";
                                }
                                elseif($var>150 and $var<=400){
                                    echo "<div class='polluted'>";
                                }
                                elseif($var>400){
                                    echo "<div class='heavily-polluted'>";
                                }
                                "</div></div>";?>
                            </div>
                            <?php
                        }
                    }
                }
            ?>
            <a href="../index.php">HOME</a>
        </div>
    </body>
</html>