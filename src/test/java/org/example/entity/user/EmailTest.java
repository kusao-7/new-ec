package org.example.entity.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailTest {
    // 有効なメールアドレスのテスト
    @Test
    public void testValidEmail() {
        String validEmail = "sekine3142@gmail.com";

        Email email = new Email(validEmail);
        assertEquals(validEmail, email.getEmail());
    }

    // 無効なメールアドレスのテスト
    // 記号が連続する場合
    @Test
    public void testInvalidEmail_ConsecutiveSymbols() {
        String invalidEmail = "user..11@gmail.com";
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email(invalidEmail);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // @の前に記号がある場合
    @Test
    public void testInvalidEmail_SymbolBeforeAt() {
        String invalidEmail = "user.@gmail.com";
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email(invalidEmail);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // @の後に記号がある場合
    @Test
    public void testInvalidEmail_SymbolAfterAt() {
        String invalidEmail = "user@.gmail.com";
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email(invalidEmail);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }

    // 大文字が含まれる場合
    @Test
    public void testInvalidEmail_UppercaseLetters() {
        String invalidEmail = "User@gmail.com";
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email(invalidEmail);
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }
}
