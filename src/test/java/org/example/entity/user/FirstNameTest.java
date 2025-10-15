package org.example.entity.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FirstNameTest {
    // アルファベット入力を許可するか否かのテスト
    @Test
    public void testAlphabetInput() {
        FirstName firstName = new FirstName("John");
        assertEquals("John", firstName.getFirstName());
    }

    // 漢字入力を許可するか否かのテスト
    @Test
    public void testKanjiInput() {
        FirstName firstName = new FirstName("太郎");
        assertEquals("太郎", firstName.getFirstName());
    }

    // ひらがな入力を許可するか否かのテスト
    @Test
    public void testHiraganaInput() {
        FirstName firstName = new FirstName("たろう");
        assertEquals("たろう", firstName.getFirstName());
    }

    // 許可されていない文字（例: 数字、記号、スペースなど）を含む名前の入力を拒否するテスト
    @Test
    public void testInvalidCharacterInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FirstName("John123");
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }


}
