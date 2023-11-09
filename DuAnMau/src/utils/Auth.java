/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entily.NhanVien;

/**
 *
 * @author sang
 */
public class Auth {
    //đối tượng chứa thông tin khi đăng nhập
    public static NhanVien user = null;
    //xóa thông tin của người dung có yêu cầu đăng xuất
    public static void clear(){
        Auth.user=null;
    }
    // kiểm tra xem đang nhập hay chưa
    //@return đăng nhập hay chưa
    public static boolean isLogin(){
        return Auth.user != null;
    }
    public static boolean isManager(){
        return Auth.isLogin()&&user.isVaiTro();
    }
}
