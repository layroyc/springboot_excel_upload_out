/*
 Navicat Premium Data Transfer

 Source Server         : wy
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : kuaidi

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 03/11/2021 22:15:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for express
-- ----------------------------
DROP TABLE IF EXISTS `express`;
CREATE TABLE `express`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `policy_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保单号',
  `cs_company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递公司',
  `courier_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递单号',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `mailing_date` datetime(0) NULL DEFAULT NULL COMMENT '邮寄时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES (31, 'f0a0c2f5-308c-4d55-a135-43437bd19585', '顺丰快递', 'SF1412013709263', '小心', '2021-10-12 00:00:00');

SET FOREIGN_KEY_CHECKS = 1;
