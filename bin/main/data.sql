DROP TABLE IF EXISTS Booking;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Room;
CREATE TABLE Booking (
  booking_id INT AUTO_INCREMENT  PRIMARY KEY,
  booking_name VARCHAR(250) NOT NULL,
  check_in Date,
  check_out Date,
  customer_id INT,
  room_id INT,
  total_Amount INT NOT NULL
);
CREATE TABLE Customer (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  customer_name VARCHAR(250) NOT NULL,
  customer_mail VARCHAR(250) NOT NULL,
  phone_number VARCHAR(13) NOT NULL
);
CREATE TABLE Room (
  room_id INT AUTO_INCREMENT  PRIMARY KEY,
  room_name VARCHAR(250) NOT NULL,
  capacity INT NOT NULL,
  status VARCHAR(50) NOT NULL
);
INSERT INTO Room (room_id,room_name, capacity, status) VALUES (1,'A101', 4, 'Available');
INSERT INTO Room (room_id,room_name, capacity, status) VALUES (2,'A102', 4, 'Available');
INSERT INTO Room (room_id,room_name, capacity, status) VALUES (3,'A103', 4, 'Available');
INSERT INTO Room (room_id,room_name, capacity, status) VALUES (4,'A104', 4, 'Available');