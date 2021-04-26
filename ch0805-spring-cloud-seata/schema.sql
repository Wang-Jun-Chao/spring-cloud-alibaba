-- 对应seata_order 数据阵
CREATE TABLE `tbl_order`
(
    `id`           INT(11) NOT NULL AUTO_INCREMENT,
    `order_no`     VARCHAR(255) DEFAULT NULL,
    `ser_id`       VARCHAR(255) DEFAULT NULL,
    `product_code` VARCHAR(255) DEFAULT NULL,
    `count`        INT(11)      DEFAULT 0,
    `amount`       INT(11)      DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 对应 seata_repo 数据库
CREATE TABLE `tbl_repo`
(
    `id`           INT(11) NOT NULL AUTO_INCREMENT,
    `product_code` VARCHAR(255) DEFAULT NULL,
    `name`         VARCHAR(255) DEFAULT NULL,
    `count`        INT(11)      DEFAULT 0,
    PRIMARY KEY (`id`),
    UNIQUE KEY (`product_code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 初始数据
INSERT INTO `tbl_repo`
VALUES (1, 'GP20200202001', ' 键盘', '1000');
INSERT INTO `tbl_repo`
VALUES (2, 'GP20200202002', ' 抱枕', '300');

-- 对应 seata_account 数据库
CREATE TABLE `tbl_account`
(
    `id`       INT(11) NOT NULL AUTO_INCREMENT,
    `user_id ` VARCHAR(255) DEFAULT NULL,
    `balance`  INT(11)      DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 初始数据
INSERT INTO `tbl_account`
VALUES (1, '1001', '10000.00');

-- 三库都创建表
CREATE TABLE `undo_log`
(
    `id`             BIGINT(20)   NOT NULL AUTO_INCREMENT,
    `branch_id`      BIGINT(20)   NOT NULL,
    `xid`            VARCHAR(100) NOT NULL,
    `context`        VARCHAR(128) NOT NULL,
    `rollback _info` LONGBLOB     NOT NULL,
    `log_status`     INT(11)      NOT NULL,
    `log_created`   DATETIME     NOT NULL,
    `log_modified`   DATETIME     NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `ux_undo_log` (`xid`, `branch_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;