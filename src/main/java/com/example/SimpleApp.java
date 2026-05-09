package com.example;

import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║  Welcome to Simple Java Docker App  ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Greet me");
            System.out.println("2. Add two numbers");
            System.out.println("3. Check if number is even/odd");
            System.out.println("4. Restoran simple");
            System.out.println("5. Restoran Sample");
            System.out.println("6. Pengulangan");
            System.out.println("7. kantin UNPAM");
            System.out.println("8. Exit");
            System.out.print("> ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    greetUser(scanner);
                    break;
                case "2":
                    addNumbers(scanner);
                    break;
                case "3":
                    checkEvenOdd(scanner);
                    break;
                case "4":
                    restoranSimple(scanner);
                    break;
                case "5":
                    restoranSample(scanner);
                    break;
                case "6":
                    // restoranSample(scanner);
                    perulangan(scanner);
                    break;
                case "7":
                    kantinUnpam(scanner);
                    break;
                case "8":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void greetUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "! Welcome to Docker learning!");
    }
    
    private static void addNumbers(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine().trim());
            
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine().trim());
            
            int sum = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
    
    private static void checkEvenOdd(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine().trim());
            
            if (num % 2 == 0) {
                System.out.println(num + " is EVEN");
            } else {
                System.out.println(num + " is ODD");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }

    private static void restoranSimple(Scanner scanner) {
        System.out.println("===== MENU RESTORAN =====");
        System.out.println("1. Nasi Goreng  - Rp15000");
        System.out.println("2. Mie Ayam     - Rp12000");
        System.out.println("3. Soto Ayam    - Rp10000");
        System.out.println("4. Es Teh       - Rp5000");
        System.out.println("5. Kopi         - Rp7000");
        System.out.println("==========================");

        try {
            System.out.print("Pilih menu (1-5): ");
            int pilihan = Integer.parseInt(scanner.nextLine().trim());

            String namaMenu = "";
            int harga = 0;

            switch (pilihan) {
                case 1:
                    namaMenu = "Nasi Goreng";
                    harga = 15000;
                break;
                case 2:
                    namaMenu = "Mie Ayam";
                    harga = 12000;
                break;
                case 3:
                    namaMenu = "Soto Ayam";
                    harga = 10000;
                break;
                case 4:
                    namaMenu = "Es Teh";
                    harga = 5000;
                break;
                case 5:
                    namaMenu = "Kopi";
                    harga = 18000;
                break;
                default:
                    System.out.println("Menu tidak tersedia!");
                return;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = Integer.parseInt(scanner.nextLine().trim());

            int total = harga * jumlah;

            // STRUK
            System.out.println("\n===== STRUK PEMBAYARAN =====");
            System.out.println("Menu   : " + namaMenu);
            System.out.println("Harga  : Rp" + harga);
            System.out.println("Jumlah : " + jumlah);
            System.out.println("----------------------------");
            System.out.println("Total  : Rp" + total);
            System.out.println("============================");

        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
        }
    }

    private static void restoranSample(Scanner scanner) {
        System.out.println("\n===== MENU RESTORAN SAMPLE =====");
        System.out.println("1. Mie Ayam     - Rp. 20000");
        System.out.println("2. Nasi Goreng  - Rp. 25000");
        System.out.println("3. Soto Ayam    - Rp. 15000");
        System.out.println("4. Es Teh       - Rp. 5000");
        System.out.println("5. Kopi         - Rp. 8000");
        System.out.println("===============================");

        try {
            System.out.print("Pilih menu (1-5): ");
            int pilihan = Integer.parseInt(scanner.nextLine().trim());

            String namaMenu = "";
            int harga = 0;

            switch (pilihan) {
                case 1:
                    namaMenu = "Mie Ayam";
                    harga = 20000;
                    break;
                case 2:
                    namaMenu = "Nasi Goreng";
                    harga = 25000;
                    break;
                case 3:
                    namaMenu = "Soto Ayam";
                    harga = 15000;
                    break;
                case 4:
                    namaMenu = "Es Teh";
                    harga = 5000;
                    break;
                case 5:
                    namaMenu = "Kopi";
                    harga = 8000;
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    return;
            }

            System.out.print("Jumlah: ");
            int jumlah = Integer.parseInt(scanner.nextLine().trim());

            int total = harga * jumlah;

            System.out.println();
            System.out.println("Menu: " + namaMenu);
            System.out.println("Harga: Rp. " + harga);
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Total: Rp. " + total);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
        }
    }

    private static void perulangan(Scanner scanner) {
        // pertemuan ke 8
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Angka ke" + i);
        // }

        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(); // new line after each row
        // }

        int[] angka = {10, 20, 30, 40, 50};
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }
    }

    private static void kantinUnpam(Scanner scanner) {
        System.out.println("\n==MENU MAKANAN==");
        System.out.println("1. Nasi Goreng  - Rp15000");
        System.out.println("2. Mie Goreng   - Rp12000");
        System.out.println("3. Ayam Bakar   - Rp20000");
        System.out.println("4. Sate Ayam    - Rp18000");
        System.out.println("5. Soto Ayam    - Rp14000");

        System.out.println("\n==MENU MINUMAN==");
        System.out.println("1. Es Teh       - Rp5000");
        System.out.println("2. Es Jeruk     - Rp6000");
        System.out.println("3. Kopi         - Rp7000");
        System.out.println("4. Jus Alpukat  - Rp10000");
        System.out.println("5. Air Mineral  - Rp4000");

        try {
            System.out.print("\nPilih makanan (1-5): ");
            int pilihanMakanan = Integer.parseInt(scanner.nextLine().trim());

            String namaMakanan = "";
            int hargaMakanan = 0;

            switch (pilihanMakanan) {
                case 1:
                    namaMakanan = "Nasi Goreng";
                    hargaMakanan = 15000;
                    break;
                case 2:
                    namaMakanan = "Mie goreng";
                    hargaMakanan = 17000;
                    break;
                case 3:
                    namaMakanan = "Ayam bakar";
                    hargaMakanan = 20000;
                    break;
                case 4:
                    namaMakanan = "Sate Ayam";
                    hargaMakanan = 18000;
                    break;
                case 5:
                    namaMakanan = "Soto Ayam";
                    hargaMakanan = 14000;
                    break;
                default:
                    System.out.println("Menu makanan tidak tersedia!");
                    return;
            }

            System.out.print("Jumlah makanan: ");
            int jumlahMakanan = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Pilih minuman (1-5): ");
            int pilihanMinuman = Integer.parseInt(scanner.nextLine().trim());

            String namaMinuman = "";
            int hargaMinuman = 0;

            switch (pilihanMinuman) {
                case 1:
                    namaMinuman = "Es Teh";
                    hargaMinuman = 5000;
                    break;
                case 2:
                    namaMinuman = "Es Jeruk";
                    hargaMinuman = 6000;
                    break;
                case 3:
                    namaMinuman = "Kopi";
                    hargaMinuman = 7000;
                    break;
                case 4:
                    namaMinuman = "Jus alpukat";
                    hargaMinuman = 10000;
                    break;
                case 5:
                    namaMinuman = "Air Mineral";
                    hargaMinuman = 4000;
                    break;
                default:
                    System.out.println("Menu minuman tidak tersedia!");
                    return;
            }

            System.out.print("Jumlah minuman: ");
            int jumlahMinuman = Integer.parseInt(scanner.nextLine().trim());

            int totalMakanan = hargaMakanan * jumlahMakanan;
            int totalMinuman = hargaMinuman * jumlahMinuman;
            int totalBayar = totalMakanan + totalMinuman;

            System.out.println("\n==PESNAN ANDA==");
            System.out.println("Makanan : " + namaMakanan + " x " + jumlahMakanan + " = Rp" + totalMakanan);
            System.out.println("Minuman : " + namaMinuman + " x " + jumlahMinuman + " = Rp" + totalMinuman);
            System.out.println("-------------------------------");
            System.out.println("Total   : Rp" + totalBayar);
        } catch (NumberFormatException e) {
            System.out.println("Input salah bro");
        }
    }

}
