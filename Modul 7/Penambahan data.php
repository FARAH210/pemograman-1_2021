<!DOCTYPE html>
<html>
<head>
    <title>Latihan 2</title>
</head>
<body>
    <h2>Menambahkan data</h2>
    <br/>
    <a href="Pengambilan data.php"><<< kembali</a>
    <h3>Tambah data mahasiswa</h3>
    <form method="post" action="aksi.php">
        <table>
            <tr>
                <td>NIM</td>
                <td><input type="number" name="NIM"></td>
            </tr>
            <tr>
                <td>Nama_Mahasiswa</td>
                <td><input type="text" name="Nama_Mahasiswa"></td>
            </tr>
            <tr>
                <td>Prodi</td>
                <td><input type="text" name="Prodi"></td>
            </tr>
            <tr>
                <td>Angkatan</td>
                <td><input type="text" name="Angkatan"></td>
            </tr>
            <tr>
                <td>Kelas</td>
                <td><input type="text" name="Kelas"></td>
            </tr>
            <tr>
                <td>Alamat</td>
                <td><input type="text" name="Alamat"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="SIMPAN"></td>
            </tr>
        </table>
    </form>
</body>
</html>