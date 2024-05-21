package quanlidatve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;

public class DanhSachUser {

    private List<String> UserList = new ArrayList<>();
    private List<String> PawdList = new ArrayList<>();
    private List<String> IdList = new ArrayList<>();

    public void addUser(String user) {
        UserList.add(user);
    }

    public void addPawd(String pawd) {
        PawdList.add(pawd);
    }

    public void addId(String Id) {
        IdList.add(Id);
    }

    public void docFile(String tenFile) {
        try (
                
            BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                String id = (s[0]);
                addId(id); // thêm id vào list id 
                String user = s[1];
                addUser(user); // thêm user vào list user
                String pawd = s[2];
                addPawd(pawd); // // thêm pass vào list pass
                        
            }
        } catch (Exception e) {
              System.out.println(e.getMessage());
                      
        }
       
    }
    
    public void ghiFile(String tenFile, String TK) {
    try (FileWriter fw = new FileWriter(tenFile, true);
         BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(TK);
        bw.newLine();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }

    
    // Hàm tìm vị trí của user trong list trả về 1 số nguyên (integer)
    public int findIndexUser(String User){
        return UserList.indexOf(User);   
    }
    
    // Lấy id cho tài khoản đăng ký tiếp theo 
    public int lengthID(){
        return IdList.size();
    }
    
    // tìm user có trong list ko trả về True / False
    public boolean findUser(String User){
        return UserList.contains(User);
    }

    // Tìm pass có trong list ko trả về true/fasle
    public boolean findPawd(String pawd){
        return PawdList.contains(pawd);

    }
    
    
    // Tìm vị trí pass trong List trả về 1 số nguyên (integer)
    public int findIndexPawd(String pawd){
        return PawdList.indexOf(pawd);

    }
    
    
}
