-- ------------------------------ 数据库日志说明 ----------------------------
-- 这个文件是用来记录数据库操作的日志
-- 1、倒序排序数据库修改日志
-- 2、db_sbx.sql为基础sql（暂时不全）
-- 3、修改的数据库语句在这里记录
-- 4、命名规范，日期为分割
-- example:
-- ------------------------------ xxxx-xx-xx#1.0 xxx -------------------------------
-- 这里写sql语句

-- ------------------------------ 2018-08-13#1.0 晓锋 --------------------------
-- 新增快速编码头行表，用于做数据字典用
-- 快速编码头表
DROP TABLE IF EXISTS `sbx_sys_code_b`;
CREATE TABLE `sbx_sys_code_b` (
  `code_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID标记，自增',
  `code` varchar(30) NOT NULL COMMENT '代码',
  `description` varchar(250) NOT NULL COMMENT '描述',
  `enabled_flag` varchar(1) DEFAULT 'Y' COMMENT '是否启用, Y/N',
  `parent_code` varchar(30) DEFAULT NULL COMMENT '父级快码',

  `version` int NOT NULL DEFAULT '1' COMMENT '行版本号，用来处理锁',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_by` bigint NOT NULL DEFAULT '-1' COMMENT '创建人ID',
  `update_by` bigint NOT NULL DEFAULT '-1' COMMENT '最后更新人ID',
  `update_login` bigint NOT NULL DEFAULT '-1' COMMENT '最后更新人登录信息， 对应 sbx_sys_user_login 表',
  `attr1` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr2` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr3` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr4` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr5` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr6` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr7` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr8` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr9` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr10` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr11` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr12` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr13` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr14` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr15` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',

  PRIMARY KEY (`code_id`),
  UNIQUE KEY `sbx_sys_code_u1` (`code`),
  KEY `sbx_sys_code_n1` (`code`),
  KEY `sbx_sys_code_n2` (`parent_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '快速编码头表';

-- 快速编码明细表
DROP TABLE IF EXISTS `sbx_sys_code_value_b`;
CREATE TABLE `sbx_sys_code_value` (
  `code_value_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id标记，自增',
  `code` varchar(30) NOT NULL COMMENT '快速编码 code',
  `value` varchar(150) NOT NULL COMMENT '编码值',
  `meaning` varchar(150) NOT NULL COMMENT '含义',
  `description` varchar(250) DEFAULT NULL COMMENT '编码值描述',
  `order_seq` int(11) DEFAULT '10' COMMENT '排序标记',
  `enabled_flag` varchar(1) DEFAULT 'Y' COMMENT '是否启用',
  `parent_code_value_id` bigint(20) DEFAULT NULL COMMENT '父级快码值',

  `version` int NOT NULL DEFAULT '1' COMMENT '行版本号，用来处理锁',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_by` bigint NOT NULL DEFAULT '-1' COMMENT '创建人ID',
  `update_by` bigint NOT NULL DEFAULT '-1' COMMENT '最后更新人ID',
  `update_login` bigint NOT NULL DEFAULT '-1' COMMENT '最后更新人登录信息， 对应 sbx_sys_user_login 表',
  `attr1` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr2` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr3` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr4` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr5` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr6` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr7` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr8` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr9` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr10` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr11` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr12` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr13` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr14` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',
  `attr15` varchar(255) DEFAULT NULL COMMENT '预留扩展字段',

  PRIMARY KEY (`code_value_id`),
  UNIQUE KEY `sbx_sys_code_value_u1` (`code`,`value`),
  KEY `sbx_sys_code_value_n1` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '快速编码明细表';
