CREATE DATABASE IF NOT EXISTS bbdd_proyecto_chat;
USE bbdd_proyecto_chat;

CREATE TABLE if NOT EXISTS `user` (
  `id_user` int PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(50),
  `username` VARCHAR(50),
  `password` VARCHAR(50),
  `id_userType` int,
  `id_file` varchar(255)
);


CREATE TABLE if NOT EXISTS `chat` (
  `id_chat` int PRIMARY KEY,
  `name` VARCHAR(50),
  `id_chatType` int,
  `id_file` varchar(255),
  `admin` int
);


CREATE TABLE if NOT EXISTS `message` (
  `id_message` int PRIMARY KEY,
  `id_user` int,
  `id_chat` int,
  `id_messageType` int,
  `text` VARCHAR(4096),
  `creationDate` datetime,
  `updateDate` datetime,
  `file` varchar(255)
);


CREATE TABLE if NOT EXISTS `userType` (
  `id_userType` int PRIMARY KEY,
  `name` VARCHAR(50)
);


CREATE TABLE if NOT EXISTS `userConnected` (
  `id` BINARY(16) PRIMARY KEY,
  `id_user` int NOT NULL,
  `lastActiveDate` datetime,
  `id_chat` int NOT NULL,
  
  CONSTRAINT `FK_UConn_User` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  CONSTRAINT `FK_UConn_Chat` FOREIGN KEY(`id_chat`) REFERENCES `chat` (`id_chat`)
);


CREATE TABLE if NOT EXISTS `relationUser` (
  `id_userOwner` int,
  `id_userContact` int
);


CREATE TABLE if NOT EXISTS `chatUser` (
  `id_chat` int,
  `id_user` int,
  `joinedDate` datetime,
  `lastActiveDate` datetime
);


CREATE TABLE if NOT EXISTS `chatType` (
  `id_chatType` int PRIMARY KEY,
  `name` VARCHAR(50)
);


CREATE TABLE if NOT EXISTS `messageType` (
  `id_messageType` int PRIMARY KEY,
  `name` VARCHAR(50)
);


ALTER TABLE `chat` ADD FOREIGN KEY (`id_chat`) REFERENCES `chatType` (`id_chatType`);

ALTER TABLE `chatUser` ADD FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

ALTER TABLE `chatUser` ADD FOREIGN KEY (`id_chat`) REFERENCES `chat` (`id_chat`);

ALTER TABLE `message` ADD FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

ALTER TABLE `message` ADD FOREIGN KEY (`id_chat`) REFERENCES `chatUser` (`id_chat`);

ALTER TABLE `message` ADD FOREIGN KEY (`id_messageType`) REFERENCES `messageType` (`id_messageType`);

ALTER TABLE `user` ADD FOREIGN KEY (`id_userType`) REFERENCES `userType` (`id_userType`);

ALTER TABLE `user` ADD FOREIGN KEY (`id_user`) REFERENCES `userConnected` (`id_user`);

ALTER TABLE `chat` ADD FOREIGN KEY (`id_chat`) REFERENCES `userConnected` (`id_chat`);

ALTER TABLE `chat` ADD FOREIGN KEY (`admin`) REFERENCES `user` (`id_user`);

ALTER TABLE `relationUser` ADD FOREIGN KEY (`id_userContact`) REFERENCES `user` (`id_user`);

ALTER TABLE `relationUser` ADD FOREIGN KEY (`id_userOwner`) REFERENCES `user` (`id_user`);
