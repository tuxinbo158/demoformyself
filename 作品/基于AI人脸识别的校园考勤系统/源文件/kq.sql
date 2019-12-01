/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : kq

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-09-20 00:56:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for manage
-- ----------------------------
DROP TABLE IF EXISTS `manage`;
CREATE TABLE `manage` (
  `manage_id` int(11) NOT NULL AUTO_INCREMENT,
  `manage_name` varchar(255) NOT NULL,
  `manage_pswd` varchar(255) NOT NULL,
  `manage_sjmc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`manage_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manage
-- ----------------------------
INSERT INTO `manage` VALUES ('1', 'a', '19647', '在');
INSERT INTO `manage` VALUES ('2', 'b', '19647', '啊');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `bh` varchar(11) NOT NULL,
  `sj` varchar(255) DEFAULT NULL,
  `kc` varchar(255) DEFAULT NULL,
  `sfqd` varchar(255) DEFAULT NULL,
  `sfqj` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1', '1', '1', '1', '1');
