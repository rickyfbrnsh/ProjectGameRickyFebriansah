<?php
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $username = htmlspecialchars($_POST['username']);
        $password = htmlspecialchars($_POST['password']);
        require "koneksi.php";

        $sql = "SELECT * FROM tb_user WHERE username = '$username'";
        $response = mysqli_query($conn, $sql);
        if($response){
            $row = mysqli_fetch_assoc($response);
            if (password_verify($password, $row["password"])) {
                echo $row['nama_lengkap'];
            }else{
                echo "0";
            }
        }else{
            echo "0";
        }
        mysqli_close($conn);
    }
