-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Agu 2024 pada 23.34
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(245) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nomor_telepon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `nomor_telepon`) VALUES
(1, 'panji', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '0898989898'),
(2, 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', '0898989898989'),
(3, 'kevinrai_', '170d810338c300b8995912fd786dd2ac686142491f1334468015b69f59b57858', '081281911427'),
(4, 'hanif', '69e69c43134e7379b884a2be85b00c7fa46e39f5f2b6553b3980766686a1f74b', '0813453256'),
(5, 'naelza', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '08989898988398'),
(6, 'farhan', 'dd1e8ebb053504637476e150a500a4c9c83e519157b6e53552dc9854ae77317b', '08080808'),
(7, 'mizwar', 'e606e38b0d8c19b24cf0ee3808183162ea7cd63ff7912dbb22b5e803286b4446', '0812314049'),
(8, 'admin123', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', '08960099888'),
(9, 'radit', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', '089603959831'),
(10, 'radit', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '089798674578'),
(11, 'shifa', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '08976646868');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `kode_buku` varchar(255) NOT NULL,
  `judul_buku` varchar(255) NOT NULL,
  `isbn` varchar(255) NOT NULL,
  `penulis` varchar(255) NOT NULL,
  `pengarang` varchar(255) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kode_buku`, `judul_buku`, `isbn`, `penulis`, `pengarang`, `stok`) VALUES
('BK001', 'PEMROGRAMAN WEB', '000-000-001', 'ALDIANSYAH', 'NAUFAL', 20),
('BK002', 'ALGORITMA DAN STRUKTUR DATA 2', '000-000-002', 'FARHAN', 'PANJI', 2),
('BK003', 'MATEMATIKA', '000-000-003', 'GIGI', 'GUGU', 10),
('BK004', 'MARIPOSA', '000-000-004', 'PIDI BAIQ', 'PANJI', 24),
('BK005', 'dilan', '000-000-005', 'PIDI BAIQ', 'PANJI ', 99),
('BK006', 'KELOK', '000-000-0007', 'po', 'NALEZA', 20),
('BK007', 'Sebuah Seni untuk Bersikap Bodo Amat', '000-000-023', '100', 'lolo', 100);

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id` int(11) NOT NULL,
  `nama_peminjam` varchar(255) NOT NULL,
  `nama_buku` varchar(255) NOT NULL,
  `tgl_peminjaman` date NOT NULL,
  `tgl_pengembalian` date DEFAULT NULL,
  `lama_pinjam` int(255) NOT NULL,
  `denda` int(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `jumlah_buku` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`id`, `nama_peminjam`, `nama_buku`, `tgl_peminjaman`, `tgl_pengembalian`, `lama_pinjam`, `denda`, `status`, `jumlah_buku`) VALUES
(1, 'huhuh', 'ALGORITMA DAN STRUKTUR DATA 2', '2024-08-13', '2024-08-14', 1, 0, 'dikembalikan', 0),
(2, 'Pariz', 'MARIPOSA', '2024-08-06', '2024-08-15', 9, 10000, 'dikembalikan', 0),
(3, 'Farhan', 'MARIPOSA', '2024-08-06', '2024-08-06', 0, 0, 'pinjam', 0),
(4, 'Farhan', 'dilan', '2024-08-05', '2024-08-05', 0, 0, 'pinjam', 20),
(5, 'Naufal', 'dilan', '2024-08-12', '2024-08-29', 17, 50000, 'dikembalikan', 1),
(6, 'farhan', 'ALGORITMA DAN STRUKTUR DATA 2', '2024-08-07', '2024-08-22', 15, 40000, 'dikembalikan', 1),
(7, 'NAELZA', 'MATEMATIKA', '2024-08-06', '2024-08-20', 14, 35000, 'dikembalikan', 1),
(8, 'MIZWAR', 'dilan', '2024-08-05', NULL, 0, 0, 'pinjam', 1),
(9, 'Halo', 'MATEMATIKA', '2024-08-01', '2024-08-28', 27, 100000, 'dikembalikan', 20),
(11, 'dinko', 'dilan', '2024-08-17', '2024-08-27', 10, 15000, 'dikembalikan', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `no_telepon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `nama_lengkap`, `username`, `password`, `no_telepon`) VALUES
(4, 'mizwar', 'mizwar', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '0898989898'),
(7, 'Naelza Febrian', 'nael', '48a0866b89c7bde0a4002a96506eef79774a07fc1dada0cdc2f39be90117fd97', '123'),
(8, 'user', 'user', '04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb', '0909090'),
(10, 'azizi shafa asadel', 'zee', '4e25e29ce990520101c59bf6ea81400a5cb6379f16fac3a8c59420bd14548d84', 'adhauiwhdiuahw'),
(11, 'raditya gaib', 'radit', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', '081312818879'),
(12, 'dinko hasibuan', 'dinko', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '0898966587675');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nomor_telepon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `nomor_telepon`) VALUES
(1, 'azizi', 'azizi123', '0899999676'),
(2, 'Mizwar', 'mizwar123', '089839483948'),
(3, 'farhan', 'farhan123', '089993636'),
(4, 'gosi', 'mizwar', '0897888999'),
(5, 'komuroji', '12345', '089777888999'),
(6, 'arya', '12345', '089608997'),
(7, 'panji', '123', '08989898988'),
(8, 'dede', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '08997897'),
(9, 'okoko', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', '8989898');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
