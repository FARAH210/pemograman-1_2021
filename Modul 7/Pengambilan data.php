<!DOCTYPE html>
<html>
<head>
    <title>Latihan 1</title>
</head>
<body>
    <h2>Menampilkan data mahasiswa</h2>
    <table border="1">
        <tr>
            <th>NO</th>
            <th>NIM</th>
            <th>Nama_Mahasiswa</th>
            <th>Prodi</th>
            <th>Angkatan</th>
            <th>Kelas</th>
            <th>Alamat</th>
        </tr>
        <?php
        include 'Koneksi.php';
        $no = 1;
        $data = mysqli_query($db_con, "select * from tabelmahasiswa");
        while($d = mysqli_fetch_array($data)){
            ?>
            <tr>
                <td><?php echo $no++; ?></td>
                <td><?php echo $d['NIM']; ?></td>
                <td><?php echo $d['Nama_Mahasiswa']; ?></td>
                <td><?php echo $d['Prodi']; ?></td>
                <td><?php echo $d['Angkatan']; ?></td>
                <td><?php echo $d['Kelas']; ?></td>
                <td><?php echo $d['Alamat']; ?></td>
            </tr>
            <?php
        }
        ?>
    </table>
    <a href="Penambahan data.php">+ tambah data mahasiswa</a>
</body>
</html>