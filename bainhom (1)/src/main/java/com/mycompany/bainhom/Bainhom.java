    package com.mycompany.bainhom;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.io.PrintWriter;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Bainhom {

    public static void main(String[] args) {
            Maybayvip frm = new Maybayvip();
            frm.setVisible(true);
            frm.setLocationRelativeTo(null);
        }
    public void ghi(ArrayList list, String file){
            try(FileOutputStream out = new FileOutputStream(new File(file))) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
            } catch (Exception e) {
            System.out.println("Got an exception!");}
            }

    public void datve(ArrayList <maybay> list) {
        try (PrintWriter pw = new PrintWriter(new File("Banve.txt"))) {
            for(maybay s: list) {
                // Ghi thông tin về vé vào file
                pw.println("From: " + s.getFrom());
                pw.println("To: " + s.getTo());
                pw.println("Quantity: " + s.getQuantity());
                pw.println("Vehicle: " + s.getVehicle());
                pw.println(); // Ký tự trống để phân biệt giữa các vé
            }
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    public ArrayList docVe() throws FileNotFoundException{
        ArrayList<maybay> list = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("Banve.txt"))) {
        while(sc.hasNext()){
            String from = sc.nextLine();
            String to = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            String vehicle = sc.nextLine();
            sc.nextLine(); // Đọc dòng trống để bỏ qua phần phân biệt giữa các vé
            // Tạo một đối tượng Maybayvip từ dữ liệu và thêm vào danh sách
            maybay s = new maybay(from, to, quantity, vehicle);
            maybay a = null;
            list.add(a);
            }
        System.out.println("got an exception!");
    }
        return list;
    }


    public ArrayList doc( String file){
        ArrayList list = new ArrayList();
        try(FileInputStream out = new FileInputStream(new File(file))) {
        ObjectInputStream oos = new ObjectInputStream(out);
        list = (ArrayList) oos.readObject();
        } catch (Exception e) {
        System.out.println("Got an exception!");
        }
            return list;
        }
    }
