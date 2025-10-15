package org.example.entity.user;

public class Email {
    private String email;

    // 入力規則
    static final String REGEX = "^[a-z0-9]+([._-]{0,1}[a-z0-9]+)*@[a-z0-9]+([.-]{0,1}[a-z0-9]+)*\\.[a-z]{2,}$";

    // コンストラクタ
    public Email(String email) {
        if (!email.matches(REGEX)) {
            throw new IllegalArgumentException("メールアドレスの入力形式が正しくありません。");
        }
        this.email = email;
    }

    // getter
    public String getEmail() {
        return email;
    }
}
