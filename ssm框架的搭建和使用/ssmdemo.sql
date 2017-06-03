/*
Navicat MySQL Data Transfer

Source Server         : john
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-06-03 18:49:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tmessage
-- ----------------------------
DROP TABLE IF EXISTS `tmessage`;
CREATE TABLE `tmessage` (
  `messageid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `contents` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`messageid`),
  KEY `tmessage_ibfk_1` (`userid`),
  KEY `tmessage_ibfk_2` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=20004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmessage
-- ----------------------------
INSERT INTO `tmessage` VALUES ('20001', '10001', 'john', '今天天气很好啊');
INSERT INTO `tmessage` VALUES ('20002', '10001', 'john', '今天天气更好');
INSERT INTO `tmessage` VALUES ('20003', '10001', 'john', '都别说，今天天气才是最好');

-- ----------------------------
-- Table structure for tuser
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------
INSERT INTO `tuser` VALUES ('10001', 'john', 'john');
