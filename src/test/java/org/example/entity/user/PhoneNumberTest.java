package org.example.entity.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneNumberTest {
    // 有効な電話番号のテスト
    @Test
    public void testValidPhoneNumber() {
        String phoneNumber = "090-1234-5678";
        PhoneNumber pn = new PhoneNumber(phoneNumber);
        assertEquals(phoneNumber, pn.getPhoneNumber());
    }

    // AreaCodeが無効な電話番号のテスト
    @Test
    public void testInvalidAreaCode() {
        String phoneNumber = "060-1234-5678";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new PhoneNumber(phoneNumber);
        });
        assertEquals("無効な電話番号です。", exception.getMessage());
    }

    // 市外局番が3桁でない電話番号のテスト
    @Test
    public void testInvalidAreaCodeLength() {
        String phoneNumber = "0900-1234-5678";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new PhoneNumber(phoneNumber);
        });
        assertEquals("無効な電話番号です。", exception.getMessage());
    }

    // 市内局番が4桁でない電話番号のテスト
    @Test
    public void testInvalidLocalCodeLength() {
        String phoneNumber = "090-123-5678";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new PhoneNumber(phoneNumber);
        });
        assertEquals("無効な電話番号です。", exception.getMessage());
    }
}
