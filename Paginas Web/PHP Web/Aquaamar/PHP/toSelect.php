<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="../Styles/toSelect.css">
        <title>Aquaamar</title>
    </head>
    <body>
        <div class="fondo">
            <center>
                <a href="../index.php"><h1>Aquaamar</h1></a>
            </center>
        </div>
        <center>
            <br><br>
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
                        <td><h2>BOD<hr></h2>The (BOD5) value indicates the amount of oxygen that 
                            bacteria and other tiny living beings consume during 5 days at a temperature 
                            of 20°C in a water sample for the aerobic degradation of the substances 
                            contained in the water
                            <br><br>
                            <center>
                                <input type="radio" name="option" value="BOD" <?php if($option == "BOD") ; ?>> To Select
                            </center>
                        </td>
                        <td><h2>COD<hr></h2>The Chemical Oxygen Demand (COD) is a parameter that measures 
                            the amount of substances that can be oxidized by chemical means that are dissolved 
                            or in suspension in a liquid sample.
                            <br><br><br>
                            <center>
                                <input type="radio" name="option" value="COD" <?php if($option == "COD") ; ?>> To Select
                            </center>
                        </td>
                        <td><h2>TSS<hr></h2>
                            Total Suspended Solids (TSS) refer to particulate material that remains in 
                            suspension in surface and / or residual water streams.
                            <br><br><br><br><br>
                            <center>
                                <input type="radio" name="option" value="TSS" <?php if($option == "TSS") ; ?>> To Select
                            </center>
                        </td>
                    </tr>
            </table>
                <p><input type="submit" value="Send Data"></p>
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