package com.ITFarmerBlog.Entity;

/**
 * 用户对象
 */
public class User {
    private int uid;
    private String username;
    private String password;
    private int permissions;//账户权限
    private String uip;//用户登陆IP
    private String nickname;
    private String email;
    private String phone;
    private String profile_photo;
    private String register_time;
    private String birthday;

    public int getPermissions() {
        return permissions;
    }

    public void setPermissions(int permissions) {
        this.permissions = permissions;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUip() {
        return uip;
    }

    public void setUip(String uip) {
        this.uip = uip;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + uid +
                ", user_name='" + username + '\'' +
                ", user_password='" + password + '\'' +
                ", user_ip='" + uip + '\'' +
                ", user_nickname='" + nickname + '\'' +
                ", user_email='" + email + '\'' +
                ", user_phone='" + phone + '\'' +
                ", user_profile_photo='" + profile_photo + '\'' +
                ", user_register_time='" + register_time + '\'' +
                ", user_birthday='" + birthday + '\'' +
                '}';
    }
}
