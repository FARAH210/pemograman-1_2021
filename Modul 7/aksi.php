<?php
    include 'koneksi.php';

    $NIM = $_POST['NIM'];
    $Nama_Mahasiswa = $_POST['Nama_Mahasiswa'];
    $Prodi = $_POST['Prodi'];
    $Angkatan = $_POST['Angkatan'];
    $Kelas = $_POST['Kelas'];
    $Alamat = $_POST['Alamat'];

    mysqli_query($db_con, "insert into tabelmahasiswa values('', '$NIM', '$Nama_Mahasiswa', '$Prodi', '$Angkatan', '$Kelas', '$Alamat')");
    header("location:Pengambilan data.php");

?>
