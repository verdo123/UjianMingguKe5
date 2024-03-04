Feature: Proses user melakukan checkout barang
  Scenario: Pengguna dapat melakukan checkout barang
    Given Pengguna masuk ke halaman cart
    When Pengguna mengklik tombol checkout
    And Pengguna mengisi nama depan
    And Pengguna mengisi nama belakang
    And Pengguna mengisi kode pos
    And Pengguna mengklik tombol continue
    And Pengguna mengklik tombol finish
    Then User berhasil melakukan checkout

#Negative case --------------------------------------

  Scenario: Pengguna tidak mengisi kolom informasi
    Given Pengguna masuk ke halaman cart
    When Pengguna mengklik tombol checkout
    And Pengguna mengklik tombol continue
    Then User tidak berhasil melakukan checkout


  Scenario: Pengguna hanya mengisi kolom first name
    Given Pengguna masuk ke halaman cart
    When Pengguna mengklik tombol checkout
    And Pengguna mengisi firstname
    And Pengguna mengklik tombol continue
    Then User tidak berhasil melakukan checkout dengan status last name is required
