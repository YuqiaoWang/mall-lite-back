create table 't_user' (
  'user_id' int(11) not null auto_increment,
  'user_name' varchar(63) not null comment '用户姓名',
  'password' varchar(63) not null comment '用户密码',
  'mobile' varchar(20) not null default '' comment '用户手机号码',
  'nickname' varchar(63) not null default '' comment '用户昵称',
  'gender' tinyint(3) not null default '0' comment '性别0未知，1男2女',
  'birthday' date default null comment '生日',
  'status' tinyint(3) not null default '0' comment '0 可用, 1 禁用, 2 注销',
  'add_time' datetime default null comment '创建时间',
  'updated_time' datetime default null comment '更新时间',
  'deleted' tinyint(1) default '0' comment '逻辑删除',
  primary key ('user_id')
) ENGINE = InnoDB AUTO_INCREMENT = 3 DEFAULT CHARSET = utf8mb4 COMMENT = '用户表';