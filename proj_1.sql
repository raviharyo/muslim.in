-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2020 at 12:25 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proj_1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `email`, `password`) VALUES
(1, 'admin1@email.com', 'admin1');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `picture` varchar(200) NOT NULL,
  `detail` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `name`, `category`, `quantity`, `price`, `picture`, `detail`) VALUES
(1, 'Sarung hijau Baba', 'Aksesoris Solat', 100, 50000, 'https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//78/MTA-3210205/atlas_atlas-songket-sarung-pria---hijau--as-idm-skt-_full06.jpg', 'Sarung yang nyaman digunakan saat solat.'),
(2, 'Peci Coklat Khoir', 'Aksesoris Solat', 25, 15000, 'https://www.distronation.com/wp-content/uploads/2019/03/Peci_Kupluk_FOLD_COKLAT_MUDA_I_-_LIGHT_BROWN_190210019_1.jpg', 'Peci yang nyaman dipakai kemanapun dimanapun'),
(4, 'Gamis Pria Aljuned Hitam', 'Pakaian', 15, 100000, 'https://cf.shopee.co.id/file/4176e07b38600d03ba8a03cb5c6851e8', 'Tampan saat digunakan'),
(5, 'Gamis Pria Aljuned Biru', 'Pakaian', 25, 100000, 'https://tokoattuqa.com/wp-content/uploads/2019/12/model-baju-gamis-pria-kombinasi-lengan-panjang-navy-biru-dongker-600x600.jpg', 'Gamis pria aljuned nyaman'),
(6, 'Peci cap Hitam Samase', 'Aksesoris Solat', 30, 30000, 'https://samase.co.id/wp-content/uploads/2018/08/37955018_318834438685262_884443799013556224_n.jpg', 'Peci cap trendy'),
(7, 'Peci cap Navy Jamont', 'Aksesoris Solat', 25, 40000, 'https://ae01.alicdn.com/kf/HLB1SEltXLjsK1Rjy1Xaq6zispXae/Fashion-Fisherman-Beanie-Pria-Wanita-Miki-Hat-Padat-Bahan-Katun-Musim-Gugur-Musim-Semi-Musim-Dingin.jpg', 'Peci cap keren mantap'),
(8, 'Sarung biru Abah', 'Aksesoris Solat', 20, 30000, 'https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//97/MTA-7670733/atlas_atlas_favorit_halmahera_sarung_-_biru_full06_jlwwsjfw.jpg', 'Sarung nyaman dan aman bisa buat sarung2an'),
(10, 'Sarung Atlas Biru', 'Aksesoris solat', 20, 50000, 'https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//97/MTA-2691358/atlas_atlas-premium-sarung-songket---biru--770-6-_full05.jpg?output-format=webp', 'sarung nyaman mantap'),
(11, 'Kerudung pashmina ceruti', 'Kerudung', 50, 30000, 'https://ik.imagekit.io/carro/jualo/original/21520783/-sale-kerudung-pashm-wanita-21520783.jpg?v=1569297940', 'Kerudung nyaman dipakai mantap'),
(12, 'Gamis Wanita Rihana', 'Gamis Wanita', 15, 100000, 'https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//106/MTA-4896934/hitjab_hitjab_8309_baju_gamis_rihana__gamis_pesta_polos_full04_n40ljgco.jpg', 'Gamis trendy stylish hits 2020'),
(13, 'Gamis Syari Khimar', 'Gamis Wanita', 10, 120000, 'https://id-test-11.slatic.net/p/64c6fc13ee0a7b49c3619b10d57a7962.jpg_340x340q80.jpg_.webp', 'Gamis khimar wanita top seller');

-- --------------------------------------------------------

--
-- Table structure for table `ordertbl`
--

CREATE TABLE `ordertbl` (
  `order_id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `product` varchar(50) NOT NULL,
  `quantity` int(10) NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordertbl`
--

INSERT INTO `ordertbl` (`order_id`, `email`, `product`, `quantity`, `price`) VALUES
(1, 'asri@mail.com', 'Peci cap Navy Jamont', 1, 40000),
(2, 'asri@mail.com', 'Peci cap Hitam Samase', 1, 30000),
(3, 'abi@mail.com', 'Gamis Pria Aljuned Hitam', 1, 100000),
(4, 'abi@mail.com', 'Gamis Syari Khimar', 1, 120000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone_num` varchar(20) NOT NULL,
  `alamat` varchar(110) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `email`, `password`, `phone_num`, `alamat`) VALUES
(1, 'asri', 'asri@mail.com', '1234', '081299008898', 'Johar baru'),
(3, 'junaidi', 'jujun@mail.com', '12345', '089893289222', 'Jl jl'),
(10, 'abi', 'abi@main.com', '12345', '0898872889', 'Jl. Nagasari no.12'),
(11, 'abi', 'abi@mail.com', '12345', '0897780987', 'Jl Palem biru');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `ordertbl`
--
ALTER TABLE `ordertbl`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `ordertbl`
--
ALTER TABLE `ordertbl`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
