/*
 Navicat Premium Data Transfer

 Source Server         : centos1
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 192.168.128.128:3306
 Source Schema         : eshop

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 24/06/2019 19:14:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banner_category
-- ----------------------------
DROP TABLE IF EXISTS `banner_category`;
CREATE TABLE `banner_category`  (
  `id` int(11) NOT NULL,
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '父类id，0代表1级类目',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '1正常，0删除',
  `order` int(4) NULL DEFAULT NULL COMMENT '排序字段',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_update` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'banner等广告条内容分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for banner_content
-- ----------------------------
DROP TABLE IF EXISTS `banner_content`;
CREATE TABLE `banner_content`  (
  `id` int(11) NOT NULL,
  `cid` int(11) NULL DEFAULT NULL COMMENT '类目id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pic_url_master` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pic_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_update` datetime(0) NULL DEFAULT NULL,
  `status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'banner内容' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `id` int(10) NOT NULL,
  `alias` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '别名',
  `shopid` int(10) NULL DEFAULT NULL COMMENT '店铺编号',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_update` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `status` tinyint(1) UNSIGNED NOT NULL DEFAULT 0,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副标题',
  `cid` int(11) NULL DEFAULT NULL COMMENT '类目编号',
  `picurls` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址，多个用逗号分隔',
  `item_type` smallint(255) UNSIGNED NULL DEFAULT NULL COMMENT '商品类型',
  `fenxiao_type` tinyint(1) NULL DEFAULT NULL COMMENT '分销类型，自营或者分销',
  `price` bigint(10) NULL DEFAULT NULL COMMENT '价格，单位分',
  `item_weight` decimal(10, 0) NULL DEFAULT NULL COMMENT '无sku时使用，商品重量',
  `item_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家设置的商品货号',
  `quantity` int(10) NULL DEFAULT NULL COMMENT '总库存',
  `sold_num` int(10) NULL DEFAULT NULL COMMENT '总销量',
  `is_hide_stock` tinyint(1) UNSIGNED NULL DEFAULT NULL COMMENT '是否隐藏库存',
  `original_price` bigint(10) NULL DEFAULT NULL COMMENT '商品划线价格，即原价，单位分',
  `is_level_discount` tinyint(1) NULL DEFAULT NULL COMMENT '是否参加会员折扣',
  `post_type` tinyint(1) NULL DEFAULT NULL COMMENT '运费模板类型',
  `post_fee` int(10) NULL DEFAULT NULL COMMENT '运费，单位分',
  `delivery_template_id` int(11) NULL DEFAULT NULL COMMENT '运费模板id',
  `is_listing` tinyint(1) NULL DEFAULT NULL COMMENT '是否上架',
  `order` int(11) NULL DEFAULT NULL COMMENT '排序字段商家设置越大越靠前',
  `auto_listing_time` datetime(0) NULL DEFAULT NULL COMMENT '开始出售时间',
  `is_lock` tinyint(1) NULL DEFAULT NULL COMMENT '是否锁定',
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家设置商品留言json串',
  `etd_status` tinyint(1) UNSIGNED NULL DEFAULT NULL COMMENT '商品预售信息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_category
-- ----------------------------
DROP TABLE IF EXISTS `item_category`;
CREATE TABLE `item_category`  (
  `id` int(11) NOT NULL,
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '父类id，0代表1级类目',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '1正常，0删除',
  `order` int(4) NULL DEFAULT NULL COMMENT '排序字段',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_update` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_content
-- ----------------------------
DROP TABLE IF EXISTS `item_content`;
CREATE TABLE `item_content`  (
  `id` int(11) NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品详情描述html富文本',
  `template_id` int(11) NULL DEFAULT NULL COMMENT '模板编号',
  `template_data` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模板元素数组json',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品详情，依赖于模板' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_etd
-- ----------------------------
DROP TABLE IF EXISTS `item_etd`;
CREATE TABLE `item_etd`  (
  `id` int(10) NOT NULL COMMENT '商品编号',
  `etd_type` tinyint(1) NULL DEFAULT NULL COMMENT '发货类型如某日期发货或付款后几天发货',
  `etd_startdate` datetime(0) NULL DEFAULT NULL COMMENT '预计开始发货时间',
  `etd_days` int(10) NULL DEFAULT NULL COMMENT '付款后几天发货',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品预售表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_fenxiao
-- ----------------------------
DROP TABLE IF EXISTS `item_fenxiao`;
CREATE TABLE `item_fenxiao`  (
  `id` int(11) NOT NULL,
  `supplier_shop_id` int(11) NULL DEFAULT NULL COMMENT '供货店铺id',
  `supplier_item_id` int(11) NULL DEFAULT NULL COMMENT '供货商品id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品分销扩展信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_sku
-- ----------------------------
DROP TABLE IF EXISTS `item_sku`;
CREATE TABLE `item_sku`  (
  `uniquecode` bigint(20) NOT NULL COMMENT '唯一编码，由店铺id和skuid组合',
  `skuid` int(11) NOT NULL COMMENT 'sku编号',
  `itemid` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `shopid` int(11) NULL DEFAULT NULL COMMENT '店铺id',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '状态',
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `properties` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'kv形式的商品规格',
  `item_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家设置的外部商品货号',
  `price` bigint(20) NULL DEFAULT NULL COMMENT '价格单位分',
  `quantity` int(11) NULL DEFAULT NULL COMMENT '库存',
  `sold_num` int(11) NULL DEFAULT NULL COMMENT '销量',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_update` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`uniquecode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品sku' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_sku_property
-- ----------------------------
DROP TABLE IF EXISTS `item_sku_property`;
CREATE TABLE `item_sku_property`  (
  `id` int(11) NOT NULL COMMENT '属性编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性名',
  `addtime` date NULL DEFAULT NULL COMMENT '添加日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'sku规格属性表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_sku_property_key_reference
-- ----------------------------
DROP TABLE IF EXISTS `item_sku_property_key_reference`;
CREATE TABLE `item_sku_property_key_reference`  (
  `id` int(11) NOT NULL,
  `shopid` int(11) NULL DEFAULT NULL COMMENT '店铺编号',
  `keyid` int(11) NULL DEFAULT NULL COMMENT '属性键编号',
  `addtime` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'sku规格名引用，和店铺关联' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item_sku_property_value_reference
-- ----------------------------
DROP TABLE IF EXISTS `item_sku_property_value_reference`;
CREATE TABLE `item_sku_property_value_reference`  (
  `id` int(11) NOT NULL,
  `shopid` int(11) NULL DEFAULT NULL,
  `reference_id` int(11) NULL DEFAULT NULL COMMENT '关联编号',
  `key_id` int(11) NOT NULL COMMENT '属性键编号',
  `value_id` int(11) NULL DEFAULT NULL COMMENT '属性值编号',
  `addtime` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'sku规格值引用，和店铺关联' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for job_detail
-- ----------------------------
DROP TABLE IF EXISTS `job_detail`;
CREATE TABLE `job_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bean_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'spring bean名称',
  `method_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '执行的方法名',
  `params` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '方法参数',
  `cron_expression` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'cron表达式',
  `status` tinyint(4) NOT NULL COMMENT '0正常1暂停',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for job_log
-- ----------------------------
DROP TABLE IF EXISTS `job_log`;
CREATE TABLE `job_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `job_id` bigint(20) NOT NULL COMMENT '任务id',
  `bean_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `method_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `params` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` tinyint(4) NOT NULL COMMENT '0成功1失败',
  `error` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '失败信息',
  `time_used` decimal(11, 0) NULL DEFAULT NULL COMMENT '耗时ms',
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务日志信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
