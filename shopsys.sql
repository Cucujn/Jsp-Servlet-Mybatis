/*
Navicat MySQL Data Transfer

Source Server         : Chenjiena
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : shopsys

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-06-14 16:24:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminName` varchar(10) DEFAULT NULL,
  `AdminId` int(11) NOT NULL AUTO_INCREMENT,
  `AdminPassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AdminId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('小黄', '2', '123456');
INSERT INTO `admin` VALUES ('一花', '3', '123456');
INSERT INTO `admin` VALUES ('陈洁娜', '4', '123456');

-- ----------------------------
-- Table structure for `good`
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `GoodId` int(11) NOT NULL AUTO_INCREMENT,
  `GoodName` varchar(255) DEFAULT NULL,
  `GoodPrice` decimal(10,0) DEFAULT NULL,
  `GoodType` varchar(255) DEFAULT NULL,
  `GoodStore` int(11) DEFAULT NULL,
  PRIMARY KEY (`GoodId`),
  KEY `Typename` (`GoodType`),
  CONSTRAINT `Typename` FOREIGN KEY (`GoodType`) REFERENCES `type` (`TypeName`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES ('4', '1', '1', null, '1');
INSERT INTO `good` VALUES ('5', '1', '1', null, '1');
INSERT INTO `good` VALUES ('6', '1', '1', null, '1');
INSERT INTO `good` VALUES ('10', '1', '1', null, '1');

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `TypeId` int(11) NOT NULL AUTO_INCREMENT,
  `TypeName` varchar(255) NOT NULL,
  PRIMARY KEY (`TypeId`),
  KEY `TypeName` (`TypeName`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('9', '1');
INSERT INTO `type` VALUES ('8', '奶茶');
INSERT INTO `type` VALUES ('4', '棒冰');
INSERT INTO `type` VALUES ('6', '棒冰');
INSERT INTO `type` VALUES ('7', '棒冰');
INSERT INTO `type` VALUES ('5', '水果');
INSERT INTO `type` VALUES ('1', '零食');
INSERT INTO `type` VALUES ('2', '饼干');
