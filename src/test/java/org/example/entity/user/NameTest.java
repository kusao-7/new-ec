package org.example.entity.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {
    // アルファベット入力を許可するか否かのテスト
    @Test
    public void testAlphabetInput() {
        Name name = new Name("John");
        assertEquals("John", name.getFirstName());
    }

    // 漢字入力を許可するか否かのテスト
    @Test
    public void testKanjiInput() {
        Name name = new Name("太郎");
        assertEquals("太郎", name.getFirstName());
    }

    // ひらがな入力を許可するか否かのテスト
    @Test
    public void testHiraganaInput() {
        Name name = new Name("たろう");
        assertEquals("たろう", name.getFirstName());
    }

    // 許可されていない文字（例: 数字、記号、スペースなど）を含む名前の入力を拒否するテスト
    @Test
    public void testInvalidCharacterInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Name("John123");
        });
        assertEquals("入力形式が正しくありません。", exception.getMessage());
    }


}
