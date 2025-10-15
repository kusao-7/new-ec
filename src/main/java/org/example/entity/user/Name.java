package org.example.entity.user;

// ユーザーの名前を表すクラス
public class Name {
    private String firstName;

    // 名前の最大長さ: 20文字
    static final int MAX_LENGTH = 20;
    // アルファベットおよび日本語の漢字とひらがなのみを許可する正規表現
    static final String REGEX = String.format("[a-zA-Z\\p{IsHan}\\p{IsHiragana}]{1,%d}", MAX_LENGTH);

    public Name(String firstName) {
        if (firstName.matches(REGEX)) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("入力形式が正しくありません。");
        }
    }

    //getter
    public String getFirstName() {
        return firstName;
    }
}
