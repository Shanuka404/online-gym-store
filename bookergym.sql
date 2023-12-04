-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2023 at 02:26 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookergym`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `cartID` varchar(100) NOT NULL,
  `customerID` varchar(100) NOT NULL,
  `supplementName` varchar(500) NOT NULL,
  `picture` varchar(500) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`cartID`, `customerID`, `supplementName`, `picture`, `price`, `quantity`) VALUES
('CT1000', 'CS1001', 'Platinum Creatine', 'Image/24.jpg', 82149, 3),
('CT1005', 'CS1003', 'Platinum Creatine', 'Image/24.jpg', 27383, 1),
('CT1006', 'CS1000', 'Platinum Creatine', 'Image/24.jpg', 27383, 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` varchar(500) NOT NULL,
  `customerName` varchar(500) NOT NULL,
  `email` varchar(500) NOT NULL,
  `password` varchar(500) NOT NULL,
  `number` varchar(500) NOT NULL,
  `address` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `customerName`, `email`, `password`, `number`, `address`) VALUES
('CS1000', 'Shanuka', 'shanukadeva2000@gmail.com', '1234', '0766871663', 'N0: 229, Medikelewatta Helakandana, Horampella'),
('CS1001', 'Devinda', 'deva2000@gmail.com', '11111111', '0766871663', 'Fatima church road Maradana, Colombo 10.'),
('CS1002', 'Oshada', 'oshada@gmail.com', '11111111', '0767161773', 'Kuliyapitiya'),
('CS1003', 'bimal', 'kamal@gmail.com', '12345678', '123456', 'colombo');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `historyID` varchar(100) NOT NULL,
  `supplementName` varchar(500) NOT NULL,
  `cusID` varchar(100) NOT NULL,
  `picture` varchar(500) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`historyID`, `supplementName`, `cusID`, `picture`, `quantity`, `price`, `status`) VALUES
('HS1000', 'Carnivor Mass', 'CS1000', 'Image/25.jpg', 1, 32000, 'Incomplete'),
('HS1001', 'Golden Standard', 'CS1001', 'Image/26.jpg', 2, 55700, 'Incomplete'),
('HS1002', 'Platinum Creatine', 'CS1000', 'Image/24.jpg', 1, 27383, 'Incomplete'),
('HS1003', 'T-shirt', 'CS1000', 'Image/7.jpg', 5, 14250, 'Incomplete'),
('HS1004', 'Platinum Creatine', 'CS1000', 'Image/24.jpg', 1, 27383, 'Completed'),
('HS1005', 'NABOLIC CREATINE', 'CS1000', 'Image/NABOLIC.png', 3, 48000, 'Completed'),
('HS1006', 'T-shirt', 'CS1000', 'Image/7.jpg', 4, 11400, 'Incomplete'),
('HS1007', 'Platinum Creatine', 'CS1000', 'Image/24.jpg', 1, 27383, 'Completed'),
('HS1008', 'Platinum Creatine', 'CS1002', 'Image/24.jpg', 1, 27383, 'Incomplete'),
('HS1009', 'Golden Standard', 'CS1002', 'Image/26.jpg', 1, 27850, 'Incomplete'),
('HS1010', 'Platinum Creatine', 'CS1003', 'Image/24.jpg', 4, 109532, 'Incomplete'),
('HS1011', 'Carnivor Mass', 'CS1002', 'Image/25.jpg', 3, 96000, 'Incomplete'),
('HS1012', 'Platinum Creatine', 'CS1002', 'Image/24.jpg', 3, 82149, 'Completed'),
('HS1013', 'Platinum Creatine', 'CS1002', 'Image/24.jpg', 3, 82149, 'Incomplete'),
('HS1014', 'Platinum Creatine', 'CS1000', 'Image/24.jpg', 1, 27383, 'Completed'),
('HS1015', 'Platinum Creatine', 'CS1000', 'Image/24.jpg', 3, 82149, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `reviewID` varchar(100) NOT NULL,
  `customerID` varchar(100) NOT NULL,
  `customerName` varchar(500) NOT NULL,
  `rate` int(11) NOT NULL,
  `comment` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`reviewID`, `customerID`, `customerName`, `rate`, `comment`) VALUES
('RT1000', 'CS1000', 'Shanuka', 5, 'This app is very easy to handle. and when I want to change my schedule I can use the workout plans that providing by this application.'),
('RT1001', 'CS1001', 'Devinda', 5, 'BEST PRODUCTS....!'),
('RT1002', 'CS1000', 'Shanuka', 4, 'Nice Application..!'),
('RT1003', 'CS1002', 'Oshada', 5, 'This is help to get my workout plans..!! Good job.'),
('RT1004', 'CS1000', 'Shanuka', 4, 'ggjg');

-- --------------------------------------------------------

--
-- Table structure for table `supplements`
--

CREATE TABLE `supplements` (
  `supplementID` varchar(50) NOT NULL,
  `supplementName` varchar(50) NOT NULL,
  `category` varchar(25) NOT NULL,
  `picture` varchar(500) NOT NULL,
  `flavor` varchar(25) NOT NULL,
  `size` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplements`
--

INSERT INTO `supplements` (`supplementID`, `supplementName`, `category`, `picture`, `flavor`, `size`, `price`, `description`) VALUES
('SUP1000', 'Carnivor Mass', 'Mass Gainer', 'Image/25.jpg', 'Vanilla', '5Lbs', 32000, 'ANABOLIC BEEF PROTEIN GAINER\r\n+ 720 Muscle-Building Calories†\r\n+ 50g Hydrolyzed Beef Protein Isolate\r\n+ 125g High Impact Reactive Carbs†\r\n+ Insulin Amplification and Signaling†\r\n+ Loaded with Creatine and BCAAs'),
('SUP1001', 'Platinum Creatine', 'Creatine', 'Image/24.jpg', 'Chocolate', '5Lbs', 27383, 'Body Fortress Super Advanced Mass Gainer Whey Protein Powder, Gluten Free, Chocolate, 4 Lb'),
('SUP1002', 'T-shirt', 'Others', 'Image/7.jpg', '', 'null', 2850, 'Men\'s T-shirt'),
('SUP1004', 'Golden Standard', 'Whey Protien', 'Image/26.jpg', 'Strawberry', '3Lbs', 27850, 'Protein Supplement'),
('SUP1005', 'NABOLIC CREATINE', 'Creatine', 'Image/NABOLIC.png', 'Chocolate', '3Lbs', 16000, 'Levrone ANABOLIC CREATINE 600G - Supplement Warehouse'),
('SUP1006', 'TIRE - GS Sports', 'Others', 'Image/23.jpg', '', '', 15000, 'NENGGE Tyre Flipping Fitness Rubber Tires Strength Training Equipment for Home Exercise Workout Multi-Function Gym Trainers for Hammer Training, Improve Explosive Force'),
('SUP1007', 'wdwd', 'Whey Protien', 'Image/ice.png', 'Chocolate', '5Lbs', 334, 'ehed'),
('SUP1008', 'kjbkjbl', 'Mass Gainer', 'Image/ice.png', 'Strawberry', '5Lbs', 8999, 'pojph');

-- --------------------------------------------------------

--
-- Table structure for table `workoutplans`
--

CREATE TABLE `workoutplans` (
  `workoutID` varchar(500) NOT NULL,
  `category` varchar(500) NOT NULL,
  `day1` varchar(1000) NOT NULL,
  `day2` varchar(1000) NOT NULL,
  `day3` varchar(1000) NOT NULL,
  `day4` varchar(1000) NOT NULL,
  `day5` varchar(1000) NOT NULL,
  `day6` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `workoutplans`
--

INSERT INTO `workoutplans` (`workoutID`, `category`, `day1`, `day2`, `day3`, `day4`, `day5`, `day6`) VALUES
('WOP1000', 'Beginners', 'Exercise 1: Treadmill (20 minutes)\nExercise 2: Leg Press (3 sets of 10 reps)\nExercise 3: Chest Press (3 sets of 10 reps)\nExercise 4: Lat Pulldown (3 sets of 10 reps)\nExercise 5: Dumbbell Shoulder Press (3 sets of 10 reps)\nExercise 6: Plank (2 sets of 30 seconds)', 'Rest Day', '', '', '', ''),
('WOP1001', 'Intermediate', 'Exercise 1: Deadlifts (4 sets of 8 reps)\nExercise 2: Pull-Ups (3 sets of 10 reps)\nExercise 3: Barbell Bench Press (4 sets of 8 reps)\nExercise 4: Dumbbell Shoulder Press (3 sets of 10 reps)\nExercise 5: Leg Press (4 sets of 10 reps)\nExercise 6: Plank (3 sets of 45 seconds)', 'Exercise 1: Barbell Squats (4 sets of 8 reps)\nExercise 2: Dumbbell Rows (3 sets of 10 reps)\nExercise 3: Incline Dumbbell Press (4 sets of 8 reps)\nExercise 4: Dumbbell Lateral Raises (3 sets of 10 reps)\nExercise 5: Leg Curls (4 sets of 10 reps)\nExercise 6: Russian Twists (3 sets of 15 reps per side)', 'Exercise 1: Romanian Deadlifts (4 sets of 8 reps)\nExercise 2: Chin-Ups (3 sets of 10 reps)\nExercise 3: Dips (4 sets of 8 reps)\nExercise 4: Face Pulls (3 sets of 12 reps)\nExercise 5: Bulgarian Split Squats (4 sets of 10 reps per leg)\nExercise 6: Bicycle Crunches (3 sets of 15 reps per side)', 'Rest Day', '', ''),
('WOP1002', 'Intermediate', 'Exercise 1: Barbell Squats (4 sets of 8 reps)\nExercise 2: Bench Press (4 sets of 8 reps)\nExercise 3: Bent Over Rows (3 sets of 10 reps)\nExercise 4: Dumbbell Shoulder Press (3 sets of 10 reps)\nExercise 5: Leg Press (4 sets of 10 reps)\nExercise 6: Plank (3 sets of 45 seconds)', 'Exercise 1: Deadlifts (4 sets of 8 reps)\nExercise 2: Pull-Ups (3 sets of 10 reps)\nExercise 3: Incline Dumbbell Press (4 sets of 8 reps)\nExercise 4: Lateral Raises (3 sets of 10 reps)\nExercise 5: Leg Curls (4 sets of 10 reps)\nExercise 6: Russian Twists (3 sets of 15 reps per side)', 'Exercise 1: Romanian Deadlifts (4 sets of 8 reps)\nExercise 2: Chin-Ups (3 sets of 10 reps)\nExercise 3: Dips (4 sets of 8 reps)\nExercise 4: Face Pulls (3 sets of 12 reps)\nExercise 5: Bulgarian Split Squats (4 sets of 10 reps per leg)\nExercise 6: Bicycle Crunches (3 sets of 15 reps per side)', 'Rest Day', '', ''),
('WOP1003', 'Beginners', 'Exercise 1: Brisk Walking (20 minutes)\nExercise 2: Bodyweight Squats (3 sets of 10 reps)\nExercise 3: Push-Ups (3 sets of 10 reps)\nExercise 4: Bent-Over Dumbbell Rows (3 sets of 10 reps)\nExercise 5: Dumbbell Bicep Curls (3 sets of 10 reps)\nExercise 6: Plank (2 sets of 30 seconds)', 'Rest Day', '', '', '', ''),
('WOP1004', 'Intermediate', 'Exercise 1: Barbell Squats (4 sets of 8 reps)\nExercise 2: Bench Press (4 sets of 8 reps)\nExercise 3: Bent Over Rows (3 sets of 10 reps)\nExercise 4: Dumbbell Shoulder Press (3 sets of 10 reps)\nExercise 5: Leg Press (4 sets of 10 reps)\nExercise 6: Plank (3 sets of 45 seconds)', 'Exercise 1: Deadlifts (4 sets of 8 reps)\nExercise 2: Pull-Ups (3 sets of 10 reps)\nExercise 3: Incline Dumbbell Press (4 sets of 8 reps)\nExercise 4: Lateral Raises (3 sets of 10 reps)\nExercise 5: Leg Curls (4 sets of 10 reps)\nExercise 6: Russian Twists (3 sets of 15 reps per side)', 'Rest Day', 'Exercise 1: Romanian Deadlifts (4 sets of 8 reps)\nExercise 2: Chin-Ups (3 sets of 10 reps)\nExercise 3: Dips (4 sets of 8 reps)\nExercise 4: Face Pulls (3 sets of 12 reps)\nExercise 5: Bulgarian Split Squats (4 sets of 10 reps per leg)\nExercise 6: Bicycle Crunches (3 sets of 15 reps per side)', 'Exercise 1: Front Squats (4 sets of 8 reps)\nExercise 2: Seated Rows (4 sets of 8 reps)\nExercise 3: Push-Ups (3 sets to failure)\nExercise 4: Barbell Shrugs (3 sets of 12 reps)\nExercise 5: Hamstring Curls (4 sets of 10 reps)\nExercise 6: Plank (3 sets of 45 seconds)', ''),
('WOP1005', 'Advanced', 'Exercise 1: Squats (5 sets of 8 reps)\nExercise 2: Deadlifts (5 sets of 8 reps)\nExercise 3: Pull-Ups (4 sets of 10 reps)\nExercise 4: Dips (4 sets of 10 reps)\nExercise 5: Seated Military Press (4 sets of 10 reps)\nExercise 6: Plank (4 sets of 1 minute)', 'Exercise 1: Bench Press (5 sets of 8 reps)\nExercise 2: Barbell Rows (5 sets of 8 reps)\nExercise 3: Romanian Deadlifts (4 sets of 10 reps)\nExercise 4: Incline Dumbbell Press (4 sets of 10 reps)\nExercise 5: Pull-Ups (4 sets of 10 reps)\nExercise 6: Russian Twists (4 sets of 15 reps per side)', 'Exercise 1: Front Squats (5 sets of 8 reps)\nExercise 2: Barbell Shrugs (5 sets of 10 reps)\nExercise 3: Weighted Dips (4 sets of 10 reps)\nExercise 4: Face Pulls (4 sets of 12 reps)\nExercise 5: Bulgarian Split Squats (4 sets of 10 reps per leg)\nExercise 6: Plank (4 sets of 1 minute)', 'Rest Day', 'Exercise 1: Sumo Deadlifts (5 sets of 8 reps)\nExercise 2: Pull-Ups (5 sets of 10 reps)\nExercise 3: Incline Bench Press (4 sets of 10 reps)\nExercise 4: Lateral Raises (4 sets of 12 reps)\nExercise 5: Leg Curls (4 sets of 10 reps)\nExercise 6: Bicycle Crunches (4 sets of 15 reps per side)', 'Exercise 1: Clean and Jerk (5 sets of 5 reps)\nExercise 2: Chin-Ups (5 sets of 10 reps)\nExercise 3: Dumbbell Rows (4 sets of 10 reps)\nExercise 4: Push-Ups (4 sets to failure)\nExercise 5: Hamstring Curls (4 sets of 10 reps)\nExercise 6: Plank (4 sets of 1 minute)'),
('WOP1006', 'Advanced', 'Exercise 1: Back Squats (5 sets of 8 reps)\nExercise 2: Romanian Deadlifts (4 sets of 10 reps)\nExercise 3: Pull-Ups (4 sets of 10 reps)\nExercise 4: Barbell Rows (4 sets of 10 reps)\nExercise 5: Dumbbell Shoulder Press (4 sets of 10 reps)\nExercise 6: Plank (4 sets of 1 minute)', 'Exercise 1: Bench Press (5 sets of 8 reps)\nExercise 2: Incline Dumbbell Press (4 sets of 10 reps)\nExercise 3: Barbell Shrugs (4 sets of 10 reps)\nExercise 4: Dips (4 sets of 10 reps)\nExercise 5: Lateral Raises (4 sets of 12 reps)\nExercise 6: Russian Twists (4 sets of 15 reps per side)', 'Exercise 1: Deadlifts (5 sets of 8 reps)\nExercise 2: Chin-Ups (4 sets of 10 reps)\nExercise 3: Leg Press (4 sets of 10 reps)\nExercise 4: Face Pulls (4 sets of 12 reps)\nExercise 5: Bulgarian Split Squats (4 sets of 10 reps per leg)\nExercise 6: Plank (4 sets of 1 minute)', 'Rest Day', 'Exercise 1: Clean and Jerk (5 sets of 5 reps)\nExercise 2: Pull-Ups (4 sets of 10 reps)\nExercise 3: Incline Bench Press (4 sets of 10 reps)\nExercise 4: Dumbbell Rows (4 sets of 10 reps)\nExercise 5: Hamstring Curls (4 sets of 10 reps)\nExercise 6: Bicycle Crunches (4 sets of 15 reps per side)', 'Exercise 1: Front Squats (5 sets of 8 reps)\nExercise 2: Dumbbell Shoulder Press (4 sets of 10 reps)\nExercise 3: Barbell Rows (4 sets of 10 reps)\nExercise 4: Tricep Dips (4 sets of 10 reps)\nExercise 5: Leg Curls (4 sets of 10 reps)\nExercise 6: Plank (4 sets of 1 minute)'),
('WOP1007', 'Beginners', 'DDDDDDDD', 'DDDDD', 'DDDDDD', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`cartID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`historyID`);

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`reviewID`);

--
-- Indexes for table `supplements`
--
ALTER TABLE `supplements`
  ADD PRIMARY KEY (`supplementID`);

--
-- Indexes for table `workoutplans`
--
ALTER TABLE `workoutplans`
  ADD PRIMARY KEY (`workoutID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
