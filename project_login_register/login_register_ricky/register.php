<?php
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $namaLengkap = htmlspecialchars($_POST['namaLengkap']);
        $username = htmlspecialchars($_POST['username']);
        $password = htmlspecialchars($_POST['password']);
        $password_hash = password_hash($password, PASSWORD_DEFAULT);
        require "koneksi.php";

        $sql = "INSERT INTO tb_user VALUES('','$namaLengkap','$username','$password_hash')";
        $response = mysqli_query($conn, $sql);
        if($response){
            echo "Register Berhasil";
        }else{
            echo "0";
        }
        mysqli_close($conn);
    }
