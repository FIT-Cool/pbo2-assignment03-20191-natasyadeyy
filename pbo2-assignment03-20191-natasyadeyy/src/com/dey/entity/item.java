package com.dey.entity;

public class item {
  public String nama;
  public String harga;
  public Category category;

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getHarga() {
    return harga;
  }

  public void setHarga(String harga) {
    this.harga = harga;
  }
}
