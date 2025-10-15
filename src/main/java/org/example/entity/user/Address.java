package org.example.entity.user;

public class Address {
    private Prefecture prefecture;
    private String detailAddress;

    // コンストラクタ
    public Address(Prefecture prefecture, String detailAddress) {
        this.prefecture = prefecture;
        this.detailAddress = detailAddress;
    }

    //getter
    public Prefecture getPrefecture() {
        return prefecture;
    }
}
