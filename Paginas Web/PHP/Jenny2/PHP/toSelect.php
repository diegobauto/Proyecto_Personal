<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="../Styles/toSelect.css">
        <title>Water Quality</title>
    </head>
    <body>
        <div class="fondo">
            <center>
                <h1>Water Quality</h1>
            </center>
        </div>
        <center>
            <h3>** *  Select an option  * **</h3>
            <table>
                <form action="" method="POST">
                    <?php
                        $option = "";
                        
                        if(isset($_POST['option'])){
                            $option = $_POST['option'];
                        }else{
                            $option = "";
                        }
                    ?>
                    <tr>
                        <th>OPTION</th>
                        <th>OPTION</th>
                        <th>OPTION</th>
                    </tr>
                    <tr>
                        <td><h2>DBO<hr></h2>The (BOD5) value indicates the amount of oxygen that 
                            bacteria and other tiny living beings consume during 5 days at a temperature 
                            of 20°C in a water sample for the aerobic degradation of the substances 
                            contained in the water
                            <br><br>
                            <center>
                                <input type="radio" name="option" value="DBO" <?php if($option == "DBO") ; ?>> To Select
                            </center>
                        </td>
                        <td><h2>DQO<hr></h2>The Chemical Oxygen Demand (DQO) is a parameter that measures 
                            the amount of substances that can be oxidized by chemical means that are dissolved 
                            or in suspension in a liquid sample.
                            <br><br><br>
                            <center>
                                <input type="radio" name="option" value="DQO" <?php if($option == "DQO") ; ?>> To Select
                            </center>
                        </td>
                        <td><h2>SST<hr></h2>
                            Total Suspended Solids (SST) refer to particulate material that remains in 
                            suspension in surface and / or residual water streams.
                            <br><br><br><br><br>
                            <center>
                                <input type="radio" name="option" value="SST" <?php if($option == "SST") ; ?>> To Select
                            </center>
                        </td>
                    </tr>
            </table>
                <p><input type="submit" value="enviar datos"></p>
                <?php
                    $campos = array();

                    if($option == ""){
                        array_push($campos, "Select an option");
                    }

                    if(count($campos) > 0){
                        echo "<div class='error'>";
                        for($i = 0; $i < count($campos); $i++){
                            echo "<li>".$campos[$i]."</i>";
                        }
                    }else{
                        echo "<div class='correcto'>Option: $option <br>"?>
                        <a href="calculate.php?option=<?php echo $option; ?>">Go to calculate</a>
                        <?php
                    }
                    echo "</div>";
                ?>
            </form> 
        </center>
    </body>
</html>