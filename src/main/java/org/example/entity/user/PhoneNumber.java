package org.example.entity.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumber {
    // 電話番号
    private  String phoneNumber;

    // 電話番号の正規表現パターン
    static final String PHONE_NUMBER_REGEX = "^(070|080|090)-\\d{4}-\\d{4}$";

    // コンストラクタ
    public PhoneNumber(String phoneNumber) {
        if (phoneNumber.matches(PHONE_NUMBER_REGEX)) {
            this.phoneNumber = phoneNumber;
        }else  {
            throw new IllegalArgumentException("無効な電話番号です。");
        }
    }

    // getter
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
