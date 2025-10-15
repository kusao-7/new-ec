package org.example.entity.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordTest {
    // 文字数が8文字未満のパスワードを拒否するテスト
    @Test
    public void tooShortPasswordTest() {
        String validPassword = "1aA!";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Password(validPassword);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // 大文字を含まないパスワードを拒否するテスト
    @Test
    public void noUppercasePasswordTest() {
        String validPassword = "1a!aaaaa";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Password(validPassword);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // 小文字を含まないパスワードを拒否するテスト
    @Test
    public void noLowercasePasswordTest() {
        String validPassword = "1A!AAAAA";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Password(validPassword);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // 数字を含まないパスワードを拒否するテスト
    @Test
    public void noNumberPasswordTest() {
        String validPassword = "aA!aaaaa";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Password(validPassword);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // 特殊文字を含まないパスワードを拒否するテスト
    @Test
    public void noSpecialCharacterPasswordTest() {
        String validPassword = "1aAaaaaa";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Password(validPassword);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }
}
