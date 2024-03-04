Feature: Proses user menambahkan barang ke keranjang
  Scenario: pengguna dapat menambahkan barang ke dalam keranjang
    Given Pengguna mengakses halaman produk
    When Pengguna memilih produk yang diinginkan
    And Pengguna menekan tombol Add to cart
    Then User berhasil menambahkan barang ke dalam keranjang


