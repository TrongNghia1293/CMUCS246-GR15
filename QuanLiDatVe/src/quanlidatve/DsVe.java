
package quanlidatve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsVe {
    private List<String> DiList = new ArrayList<>();
    private List<String> DenList = new ArrayList<>();
    private List<String> LoaiList = new ArrayList<>();
    
    public void addDi(String user) {
        DiList.add(user);
    }

    public void addDen(String pawd) {
        DenList.add(pawd);
    }

    public void addLoai(String Id) {
        LoaiList.add(Id);
    }
    
    public void docFile(String tenFile) {
        try (
                
            BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                String id = (s[0]);
                addLoai(id); // thêm id vào list id 
                String user = s[1];
                addDi(user); // thêm user vào list user
                String pawd = s[2];
                addDen(pawd); // // thêm pass vào list pass
                        
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
        return DiList.indexOf(User);   
    }
    
    // Lấy id cho tài khoản đăng ký tiếp theo 
    public int lengthID(){
        return LoaiList.size();
    }
    
    // tìm user có trong list ko trả về True / False
    public boolean findUser(String User){
        return DiList.contains(User);
    }

    // Tìm pass có trong list ko trả về true/fasle
    public boolean findPawd(String pawd){
        return DenList.contains(pawd);

    }
    
    
    // Tìm vị trí pass trong List trả về 1 số nguyên (integer)
    public int findIndexPawd(String pawd){
        return DenList.indexOf(pawd);

    }
    
}
