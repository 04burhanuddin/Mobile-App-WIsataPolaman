## Panduan Penggunaan
- Clone Repo `git clone https://github.com/04burhanuddin/Wisata_Polman-AndroidStudio.git`
- Open project pada android Studio
- Pastikan versi grdle pada dependecies sesuai dengan versi android studio yang anda gunakan. jika tidak sesuai, silahkan di ubah dan di sesuaikan.

## Penting !!!
- Aplikasi sudah bisa di coba di install terlebih dahulu, dan sudah tersedia pada library utama dengan nama `Wisata Polman.apk`
- Project ini dibuat pada aplikasi android studio versi `Android Studio 4.1.1 Build #AI-201.8743.12.41.6953283, built on November 5, 2020`
- Jika project ini di jalankan di android studio <b>versi di bawahnya</b> atau <b>di atasnya</b> wajib menyesuaikan settingan `build.gradle`
  ```gradle
      dependencies {
        classpath "com.android.tools.build:gradle:4.1.1"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        ...
        ....
        .....
    }
  ```
 - Misal jika project ini di jalankan pada android studio `versi 4.0.1` maka <b>classpath</b> pada `dependencies` pada build.gradle(project: covid-19) harus di ganti menjadi
    ```gradle 
      classpath "com.android.tools.build:gradle:4.0.1"
    ```
    intinya menyesuaikan dengan versi `android studio` yang digunakan.
