package Latihan1;

public class UjiBus {
    public static void main(String[] args) {
        //Membuat objek busMini dari kelas bus
        Bus busMini = new Bus();
        //Memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //Memanggil method cetak pada kelas Bus
        busMini.cetak();

        //Menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //Memanggil method cetak pada kelas bus
        busMini.cetak();

        //Mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        //Memanggil method cetak pada kelas bus
        busMini.cetak();

        //Menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        //Memanggil method cetak pada kelas bus
        busMini.cetak();

        //Hasil akhir penumpang Bus melebihi standar maksimal penumpang yang telah ditetapkan sebelumnya karena
        //telah ditetapkan pada variabel maxPenumpang = 15.
    }
}
