

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `User`
-- ----------------------------
DROP TABLE IF EXISTS `user`;


DROP TABLE IF EXISTS `ssm_user`;

CREATE TABLE `user` (
  `login_id` varchar(20) NOT NULL COMMENT '登陆ID',
  `pwd` varchar(20) NOT NULL COMMENT '用户密码',
  `name` varchar(100) NOT NULL COMMENT '用户姓名',
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';



INSERT INTO `user` (`login_id`,`pwd`,`name`)
VALUES
('test','123456','阿程'),
('admin','123456','chengcheng'),
('mac','123456','余下一整夜'),
('linux','123456','手拉手系列教程');

