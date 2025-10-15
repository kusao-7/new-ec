package org.example.entity.user;

public class Password {
    private String password;

    // 入力規則: 8文字以上で、大文字、小文字、数字、特殊文字をそれぞれ少なくとも1つ含む
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}|\\[\\]:\";'<>?,./]).{8,}$";

    // コンストラクタ
    public Password(String password) {
        if (!password.matches(REGEX)) {
            throw new IllegalArgumentException("パスワードの入力形式が正しくありません。");
        }
        this.password = password;
    }

    // getter
    public String getPassword() {
        return password;
    }
}
