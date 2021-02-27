<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="../Styles/calculate.css">
        <title>Aquaamar</title>
    </head>
    <body>
        <div class="fondo">
            <center>
                <a href="../index.php"><h1>Aquaamar</h1></a>
            </center>
        </div>
        <?php
            function form($ID){?>
                <div class="content-option">
                    <h2 id="option"><?php echo $ID ?></h2>
                    <form method="POST">
                        <input type="number" name="number" min="1">
                        <input type="submit" value="Calculate" name="calculate">
                    </form>
                </div><?php
            }

            function table($title, $category, $argument){?>
                <table>
                    <td>
                        <div class='calidad'>
                            <div class="<?php echo $category ?>"></div>
                        </div>
                    </td>
                    <td>
                        <div class="argument">
                            <div id="<?php echo $category ?>"><?php echo $title ?></div>
                            <?php echo $argument ?>
                        </div>
                    </td>
                </table><?php
            }
            
            //Recibimos la opcion por url y validamos lo que se digito
            $option = $_GET['option'];
            if ($option == "BOD") {
                form("Biochemical Oxygen Demand<br>(for five days)");
                if(isset($_POST['calculate'])){
                    $number = (int)$_POST['number'];
                    if ($number <= 3){
                        $title = "EXCELLENT";
                        $category = "excelent";
                        $argument = "Not contaminated";
                    }
                    elseif($number>3 and $number<=6){
                        $title = "GOOD QUALITY";
                        $category = "good";
                        $argument = "Surface water with low content of biodegradable organic matter.";
                    }
                    elseif($number>6 and $number<=30){
                        $title = "ACCEPTABLE";
                        $category = "acceptable";
                        $argument = "Indication of contamination. Surface water with self-purification 
                        capacity or with biologically treated wastewater discharges.";
                    }
                    elseif($number>30 and $number<=120){
                        $title = "TAINTED";
                        $category = "polluted";
                        $argument = "Surface waters with discharges of raw wastewater, 
                        mainly of municipal origin.";
                    }
                    elseif($number>120){
                        $title = "HEAVILY CONTAMINATED";
                        $category = "heavily-polluted";
                        $argument = "Surface water with strong impact from raw, municipal and 
                        non-municipal wastewater discharges.";
                    }
                    table($title, $category, $argument);
                }
            }
            elseif($option == "COD"){
                form("Chemical Oxygen Demand");
                if(isset($_POST['calculate'])){
                    $number = (int)$_POST['number'];
                    if ($number <= 10){
                        $title = "EXCELLENT";
                        $category = "excelent";
                        $argument = "Not contaminated";
                    }
                    elseif($number>10 and $number<=20){
                        $title = "GOOD QUALITY";
                        $category = "good";
                        $argument = "Surface water with low content of biodegradable and 
                        non-biodegradable organic matter.";
                    }
                    elseif($number>20 and $number<=40){
                        $title = "ACCEPTABLE";
                        $category = "acceptable";
                        $argument = "Indication of contamination. Surface water with self-purification 
                        capacity or with discharges of biologically treated wastewater.";
                    }
                    elseif($number>40 and $number<=200){
                        $title = "TAINTED";
                        $category = "polluted";
                        $argument = "Surface waters with discharges of raw wastewater,
                        mainly of municipal origin.";
                    }
                    elseif($number>200){
                        $title = "HEAVILY CONTAMINATED";
                        $category = "heavily-polluted";
                        $argument = "Surface waters with discharges of raw wastewater, 
                        mainly of municipal origin.";
                    }
                    table($title, $category, $argument);
                }
            }
            elseif($option == "TSS"){
                form("Total Suspended Solids");
                if(isset($_POST['calculate'])){
                    $number = (int)$_POST['number'];
                    if ($number <= 25){
                        $title = "EXCELLENT";
                        $category = "excelent";
                        $argument = "Exceptional class, very good quality.";
                    }
                    elseif($number>25 and $number<=75){
                        $title = "GOOD QUALITY";
                        $category = "good";
                        $argument = "Surface water with low content of suspended solids, 
                        usually in natural conditions. It favors the conservation 
                        of aquatic communities.";
                    }
                    elseif($number>75 and $number<=150){
                        $title = "ACCEPTABLE";
                        $category = "acceptable";
                        $argument = "Surface water with indication of contamination. 
                        With discharges of biologically treated wastewater. 
                        Regular condition for fish. Restricted agricultural irrigation.";
                    }
                    elseif($number>150 and $number<=400){
                        $title = "TAINTED";
                        $category = "polluted";
                        $argument = "Poor quality surface water with discharges of raw sewage. 
                        Waters with a high content of suspended material.";
                    }
                    elseif($number>400){
                        $title = "HEAVILY CONTAMINATED";
                        $category = "heavily-polluted";
                        $argument = "Surface water with strong impact from raw, 
                        municipal and non-municipal wastewater discharges. 
                        High pollutant load. Bad condition for fish.";
                    }
                    table($title, $category, $argument);
                }
            }
        ?>
    </body>
</html>