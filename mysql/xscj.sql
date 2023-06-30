# Host: localhost  (Version 5.7.30-log)
# Date: 2023-06-30 10:55:23
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "course"
#

CREATE TABLE `course` (
  `C_no` char(13) COLLATE utf8_bin NOT NULL,
  `C_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `T_no` char(10) COLLATE utf8_bin NOT NULL,
  `hour` float DEFAULT NULL,
  `week` int(2) DEFAULT NULL,
  `Semester` int(1) DEFAULT NULL,
  PRIMARY KEY (`C_no`,`T_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

#
# Data for table "course"
#

INSERT INTO `course` VALUES ('C05103','计算机原理','t01247',4,16,2),('C05103','计算机原理','t03117',4,16,2),('C06108','数据结构','t01247',4,16,3),('C06108','数据结构','t07019',4,16,3),('a01327','高等数学','t00458',4,16,2),('a01327','高等数学','t00578',4,16,2),('a01564','马克思原理','t04115',2,12,1),('a01564','马克思原理','t04410',2,12,1),('c08123','数据库技术','t03117',4,16,4),('c08123','数据库技术','t07019',4,16,4);

#
# Structure for table "score"
#

CREATE TABLE `score` (
  `S_no` bigint(11) NOT NULL,
  `C_no` char(13) COLLATE utf8_bin NOT NULL,
  `daily` float DEFAULT NULL,
  `final` float DEFAULT NULL,
  PRIMARY KEY (`S_no`,`C_no`),
  KEY `stu_cour_idx` (`S_no`,`C_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

#
# Data for table "score"
#

INSERT INTO `score` VALUES (1271945825,'cur66',99,99),(18122221320,'C06108',92,90),(18122221320,'a01564',88,93),(18122221320,'c08123',85,95),(18122221321,'C06108',70,82),(18122221321,'c08123',85,94),(18122221322,'a01327',53,50),(18122221322,'a01564',64,50),(18122221322,'c08123',60,64),(18122221323,'C05103',85,86),(18122221323,'a01564',88,84),(18122221324,'C05103',95,86),(18122221324,'c08123',77,81),(18122221325,'C05103',88,90);

#
# Structure for table "stud"
#

CREATE TABLE `stud` (
  `S_no` bigint(11) NOT NULL AUTO_INCREMENT,
  `S_name` varchar(50) COLLATE utf8_bin NOT NULL,
  `S_sex` char(2) COLLATE utf8_bin DEFAULT NULL,
  `S_bir` date DEFAULT NULL,
  `phone` varchar(13) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `S_no` (`S_no`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=19112100075 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

#
# Data for table "stud"
#

INSERT INTO `stud` VALUES (18122221320,'张凯','男','2001-05-06','13245678547','36451@qq.com'),(18122221321,'赵峰','男','1999-05-04','13945678548','ABTHE@SOHU.COM'),(18122221322,'王伟','男','2003-08-09','13245678549','45SSEEE@163.COM'),(18122221323,'李成','男','2001-09-12','13245678550','78962@qq.com'),(18122221324,'赵晓月','女','2002-12-04','13545678551','3232459@qq.com'),(18122221325,'王俊鑫','男','2003-04-07','13845678552','8989456@qq.com'),(18137221506,'王枫','男','2001-10-05','13645678553','WSWS4875@SOHU.COM'),(18137221507,'李浩','男','2000-11-23','13888128558','46SSEEE@163.COM'),(18137221508,'孙琳','女','2002-05-01','13522078555','124578@qq.com'),(19112100070,'陈晨','男','2003-04-08','13243271256','457822SW@SOHU.COM'),(19112100071,'吴司','男','1999-12-04','13244673357','JEUD@163.COM'),(19112100073,'钱峰','男','2000-04-01','13945322359','BBBTIH@SOHU.COM'),(19112100074,'张雯','女','2000-12-03','13545612360','SSSMOU@163.COM');

#
# Structure for table "student"
#

CREATE TABLE `student` (
  `S_no` bigint(11) NOT NULL AUTO_INCREMENT,
  `S_name` varchar(50) COLLATE utf8_bin NOT NULL,
  `S_sex` char(2) COLLATE utf8_bin DEFAULT NULL,
  `S_bir` date DEFAULT NULL,
  `phone` varchar(13) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `S_no` (`S_no`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`),
  KEY `phone_idx` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=19112100075 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

#
# Data for table "student"
#

INSERT INTO `student` VALUES (18122221320,'张凯','男','2001-05-06','13245678547','36451@qq.com'),(18122221321,'赵峰','男','1999-05-04','13945678548','ABTHE@SOHU.COM'),(18122221322,'王伟','男','2003-08-09','13245678549','45SSEEE@163.COM'),(18122221323,'李成','男','2001-09-12','13245678550','78962@qq.com'),(18122221324,'赵晓月','女','2002-12-04','13545678551','3232459@qq.com'),(18122221325,'王俊鑫','男','2003-04-07','13845678552','8989456@qq.com'),(18137221506,'王枫','男','2001-10-05','13645678553','WSWS4875@SOHU.COM'),(18137221507,'李浩','男','2000-11-23','13888128558','46SSEEE@163.COM'),(18137221508,'孙琳','女','2002-05-01','13522078555','124578@qq.com'),(19112100070,'陈晨','男','2003-04-08','13243271256','457822SW@SOHU.COM'),(19112100071,'吴司','男','1999-12-04','13244673357','JEUD@163.COM'),(19112100072,'李珊','女','1998-12-25','13955089958','78451@qq.com'),(19112100073,'钱峰','男','2000-04-01','13945322359','BBBTIH@SOHU.COM'),(19112100074,'张雯','女','2000-12-03','13545612360','SSSMOU@163.COM');

#
# Structure for table "teacher"
#

CREATE TABLE `teacher` (
  `t_no` char(10) COLLATE utf8_bin NOT NULL,
  `T_name` varchar(10) COLLATE utf8_bin NOT NULL,
  `major` char(10) COLLATE utf8_bin DEFAULT NULL,
  `prof` char(6) COLLATE utf8_bin DEFAULT NULL,
  `Department` char(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`t_no`),
  UNIQUE KEY `t_no` (`t_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

#
# Data for table "teacher"
#

INSERT INTO `teacher` VALUES ('t00458','李泽峰','数学','助教','基础课程学院'),('t00578','张伦','数学','讲师','基础课程学院'),('t01247','程瑞','软件工程','副教授','计算机学院'),('t02145','王乐','英语','助教','基础课程学院'),('t03117','孙艳','软件工程','讲师','软件学院'),('t04115','刘珊','哲学','讲师','人文学院'),('t04213','汪凌灵','网络技术','副教授','计算机学院'),('t04410','王伟','哲学','副教授','人文学院'),('t07019','刘泽','软件工程','副教授','软件学院');

#
# View "stu_score"
#

CREATE
  ALGORITHM = UNDEFINED
  VIEW `stu_score`
  AS
  SELECT
    1 AS 'S_no',
    1 AS 'S_name',
    1 AS 'phone',
    1 AS 'C_no',
    1 AS 'final';

#
# View "v_teacher"
#

CREATE
  ALGORITHM = UNDEFINED
  VIEW `v_teacher`
  AS
  SELECT
    `t_no`,
    `T_name`,
    `major`,
    `prof`,
    `Department`
  FROM
    `teacher`;

#
# Procedure "p_student"
#

CREATE PROCEDURE `p_student`()
BEGIN
  SELECT
    `S_no`, `S_name`, `S_bir`, `phone`
  FROM
    `student`
  WHERE
    `phone` LIKE '135%';
END;

#
# Procedure "pro_insert"
#

CREATE PROCEDURE `pro_insert`(
  OUT son bigint,
  OUT con char(13),
  OUT daily float,
  OUT final float
)
BEGIN
  INSERT
    INTO `score`
  VALUES
    (1271945825, 'cur66', 99, 99);
  SET son = 1271945825;
  SET con = 'cur66';
  SET daily = 99;
  SET final = 99;
END;

#
# Procedure "pro_out"
#

CREATE PROCEDURE `pro_out`()
BEGIN
  CALL `pro_insert`(@1, @2, @3, @4);
  SELECT
    @1 'S_no', @2 'C_no', @3 'daily', @4 'finaly';
END;

#
# Procedure "pro_select"
#

CREATE PROCEDURE `pro_select`(IN son bigint, IN con char(13))
BEGIN
  SELECT
    `daily`, `final`
  FROM
    `score`
  WHERE
    `S_no` = son AND `C_no` = con;
END;
