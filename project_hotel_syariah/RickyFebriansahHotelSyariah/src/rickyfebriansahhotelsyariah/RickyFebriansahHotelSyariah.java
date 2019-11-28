/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rickyfebriansahhotelsyariah;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky febriansah
 */
public class RickyFebriansahHotelSyariah extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, sewa, room, namaRoom = null, bayar;
        int tipeRoom, harga = 0, hari, total, diskon, totalHarga, kembali = 0;
            
        nama = JOptionPane.showInputDialog(null, "Masukan Nama Pelanggan");
        
        JOptionPane.showMessageDialog(null, "Nama Pelanggan : " + nama);
        
        JOptionPane.showMessageDialog(null, "LIST HOTEL SYARIAH"
                + "\n 1. Room Standar   = Rp.550.000,- / Hari"
                + "\n 2. Room Deluxe    = Rp.750.000,- / Hari"
                + "\n 3. Room Suit      = Rp.960.000,- / Hari"
                + "\n 4. Room Family    = Rp.1.250.000,- / Hari"
                + "\n\n Diskon 18% untuk pemesanan hotel lebih dari 3 hari!");
        
        room = JOptionPane.showInputDialog(null, "Masukan Nomor Room");
        
        if (Integer.parseInt(room) == 1) {
            harga = 550000;
            namaRoom = "Room Standar";
            JOptionPane.showMessageDialog(null, "Room : Room Standar");
        } else if (Integer.parseInt(room) == 2) {
            harga = 750000;
            namaRoom = "Room Deluxe";
            JOptionPane.showMessageDialog(null, "Room : Room Deluxe");
        } else if (Integer.parseInt(room) == 3) {
            harga = 960000;
            namaRoom = "Room Suit";
            JOptionPane.showMessageDialog(null, "Room : Room Suit");
        } else if (Integer.parseInt(room) == 4) {
            harga = 1250000;
            namaRoom = "Room Family";
            JOptionPane.showMessageDialog(null, "Room : Room Family");
        } else {
            JOptionPane.showMessageDialog(null, "Room Tidak Tersedia!");
        }
        
        sewa = JOptionPane.showInputDialog(null, "Lama penyewaan room");
        
        if (Integer.parseInt(sewa) > 3) {
            float tdiskon = (float) 0.18;
            diskon =  (int) (tdiskon * (harga * Integer.parseInt(sewa)));
        } else {
            diskon = 0;
        }
        
        totalHarga = harga * Integer.parseInt(sewa) - diskon;
        
        if (Integer.parseInt(sewa) > 3) {
            JOptionPane.showMessageDialog(null, "LIST PEMESANAN HOTEL SYARIAH"
                + "\n Nama Pelanggan : " + nama
                + "\n Nama Room : " + namaRoom
                + "\n Harga Room : " + harga
                + "\n Lama Penyewaan : " + sewa
                + "\n Diskon : 18% (Rp." + diskon + ")"
                + "\n Total Harga : " + totalHarga
                + "\n\n Diskon 18% untuk pemesanan hotel lebih dari 3 hari!");
        } else {
            JOptionPane.showMessageDialog(null, "LIST PEMESANAN HOTEL SYARIAH"
                + "\n Nama Pelanggan : " + nama
                + "\n Nama Room :" + namaRoom
                + "\n Harga Room :" + harga
                + "\n Lama Penyewaan :" + sewa
                + "\n Diskon : 0% (Rp.0)"
                + "\n Total Harga : " + totalHarga);
        }
        
        bayar = JOptionPane.showInputDialog(null, "Jumlah pembayaran");
        
        if (Integer.parseInt(bayar) < totalHarga) {
            JOptionPane.showMessageDialog(null, "Jumlah pembayaran kurang");
            bayar = JOptionPane.showInputDialog(null, "Jumlah pembayaran");
        }
        
        kembali = Integer.parseInt(bayar) - totalHarga;
        
        JOptionPane.showMessageDialog(null, "LIST PEMESANAN HOTEL SYARIAH"
                + "\n Nama Pelanggan : " + nama
                + "\n Nama Room : " + namaRoom
                + "\n Harga Room : " + harga
                + "\n Lama Penyewaan : " + sewa
                + "\n Diskon : 0% (Rp.0)"
                + "\n Total Harga : " + totalHarga
                + "\n Bayar : Rp." + bayar
                + "\n Kembali : RP." + kembali);
        
        JOptionPane.showMessageDialog(null, "Transaksi Selesai!");
    }
    
}
