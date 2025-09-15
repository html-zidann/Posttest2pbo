# Posttest2pbo
## posttest 2 Pemrograman berbasis objek 
## Zidan Daffa Ramadhan 
## 2409116056
## Tema : Manajemen Pendataan Warga Rt 41

<img width="363" height="141" alt="image" src="https://github.com/user-attachments/assets/a24adf9c-8009-459f-a291-9bd6036de94b" />

disini, di file main saya, saya menggunakan 2 model yang saya buat file berbeda, dan akan saya jelaskan 1 per 1


## Penjelasan Program
### Models : Warga

<img width="693" height="753" alt="image" src="https://github.com/user-attachments/assets/c1ceb86f-9235-47d1-9998-3beb97d0cba7" />

dicode ini saya menggunakan setter dan getter sebagai method yang dapat mengambil maupun merubah nilai suatu atribut.
Kemudian Constructor adalah sebuah method khusus yang dipanggil saat membuat objek. dan juga, sebagai nilai tambah.
dan Override sebagai subclass yang menimpa method dari superclass, jadi di override ini fungsinya untuk menimpa superclass ketika di tampilan output.

#### Jika tidak menggunakan override:

<img width="389" height="196" alt="image" src="https://github.com/user-attachments/assets/854e5f5c-cb56-454b-97cc-471dab4d5265" />


#### Jika menggunakan Override:

<img width="347" height="197" alt="image" src="https://github.com/user-attachments/assets/55d62a28-248d-4da7-b965-f4a01ac452fd" />

disini terlhiat perbedaan pada output.


### Models : ServisWarga.

<img width="731" height="626" alt="image" src="https://github.com/user-attachments/assets/fea5926a-abb9-4f79-bd0f-b835c4b79f29" />

<img width="624" height="643" alt="image" src="https://github.com/user-attachments/assets/12a4d0b0-771a-4972-a9c3-30cdc2b37c63" />


Tidak jauh berbeda dengan sistem Create, Read, Update, dan Delete pada umumnya

<img width="549" height="472" alt="image" src="https://github.com/user-attachments/assets/1cc30ab1-d7bf-4543-b1d6-6229e5a54627" />

disini saya menambahkan fitur Search sebagai nilai tambah.


### Main Command

<img width="656" height="695" alt="image" src="https://github.com/user-attachments/assets/ed7a3ece-2cd0-4794-ab5a-ce8d9f9a8f88" />

disini saya menggunakan perintah do and while untuk program menampilkan output yang diinginkan oleh user/saya sendiri. Dan juga, saya telah menambahkan fitur jika user menginput umur dengan huruf.



## Penjelasan Alur Program/ Output

Disini saya meng-run File Mainapp saya

<img width="380" height="176" alt="image" src="https://github.com/user-attachments/assets/8961b0a7-17fc-4dfe-8b0d-12850a3bf2fe" />

ketika di run, output akan menjalankan program yang saya buat, dan menampilkan list list menu yang dapat dijalankan oleh program.


### Sistem Tambah/Create

<img width="479" height="287" alt="image" src="https://github.com/user-attachments/assets/f3aa9203-2fcc-4232-9324-7b145461a57f" />


untuk menu create, user hanya perlu memasukkan nama dan umur yang ingin di input.

### Sistem Lihat/Read

<img width="375" height="239" alt="image" src="https://github.com/user-attachments/assets/fe64dbe2-ff80-44d1-a5c1-c4d5daa098bc" />

ketika user menginput angka 2 (lihat data) maka sistem akan otomatis menampilkan daftar warga yang telah diinput.

### Sistem Update

<img width="434" height="257" alt="image" src="https://github.com/user-attachments/assets/e6b0dc99-1a77-4323-9a5a-4f3c6b3061c8" />

ketika user menginput angka 3 (update data) maka sistem akan meminta input kembali kepada user. Yaitu, berupa id dari data yang ingin diubah, nama baru, dan umur baru.

### Sistem Hapus/Delete

<img width="372" height="237" alt="image" src="https://github.com/user-attachments/assets/e9031db9-71e1-4b36-b099-b2db0e6aa385" />


ketika user menginput angka 3 (Hapus data) maka sistem akan meminta user untuk input angka dari id data yang ingin dihapus.


<img width="353" height="224" alt="image" src="https://github.com/user-attachments/assets/e0b98d91-05d1-4f7a-8062-d51df63629b5" />


### Fitur Search (cari)(nilai tambah)

<img width="352" height="217" alt="image" src="https://github.com/user-attachments/assets/fd9f37bb-41c2-4be9-a800-efc7bfbf113b" />

misalnya disini ada 2 data, kemudian saya ingin mencari yang nama awalnya ada huruf ra
maka otomatis sistem akan menampilkannya.

<img width="350" height="221" alt="image" src="https://github.com/user-attachments/assets/f06fd18b-c360-4889-8060-7a6676fdeb71" />


## Validasi Input (nilai tambah)

### 1. Input umur

<img width="399" height="279" alt="image" src="https://github.com/user-attachments/assets/f0a4fb3d-25ba-49bd-83ba-1c132885ecfe" />

ketika user menginput huruf dalam umur di sistem create, maka program akan memarahi dan menyuruh user untuk memasukkan umur berupa angka.

### 2. Input list menu diluar list

<img width="395" height="192" alt="image" src="https://github.com/user-attachments/assets/d4a43a15-777f-411f-af3f-81895697c4f3" />

ketika output menu dimasukkan angka diluar dari list menu, maka program akan menampilkan menu tidak tersedia.
