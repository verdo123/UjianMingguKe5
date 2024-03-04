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

  Scenario: Pengguna tidak dapat melakukan checkout barang
    Given Pengguna masuk ke halaman cart
    When Pengguna mengklik tombol checkout
    And Pengguna mengklik tombol continue
    Then User tidak berhasil melakukan checkout
