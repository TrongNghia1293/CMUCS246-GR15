package com.mycompany.bainhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.SourceVersion;

public class maybay {
    private String from;
    private String to;
    private int quantity;
    private String vehicle;

    private ArrayList<maybay> danhSachVe = new ArrayList<>();

    public ArrayList<maybay> docFileBanVe() {
        try (Scanner sc = new Scanner(new File("Banve.txt"))) {
            while (sc.hasNextLine()) {
                String from = sc.nextLine();
                String to = sc.nextLine();
                int quantity = Integer.parseInt(sc.nextLine());
                String vehicle = sc.nextLine();
                sc.nextLine(); // Đọc dòng trống để bỏ qua phần phân biệt giữa các vé

                // Tạo một đối tượng VeMayBay từ dữ liệu và thêm vào danh sách
                maybay ve = new maybay(from, to, quantity, vehicle);
                danhSachVe.add(ve);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin Banve.txt");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Định dạng số lượng không hợp lệ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Đã xảy ra một ngoại lệ khi đọc tệp Banve.txt");
            e.printStackTrace();
        }
        return danhSachVe;
    }

    public maybay(String from, String to, int quantity, String vehicle) {
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.vehicle = vehicle;
    }

    // Các phương thức getter và setter

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
     public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

}

