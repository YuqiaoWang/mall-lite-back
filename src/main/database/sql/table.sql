create table `t_user` (
  `id` int(11) not null auto_increment,
  `name` varchar(63) not null comment '用户姓名',
  `password` varchar(63) not null comment '用户密码',
  `mobile` varchar(20) not null default '' comment '用户手机号码',
  `nickname` varchar(63) not null default '' comment '用户昵称',
  `gender` tinyint(3) not null default '0' comment '性别0未知，1男2女',
  `birthday` date default null comment '生日',
  `status` tinyint(3) not null default '0' comment '0 可用, 1 禁用, 2 注销',
  `add_time` datetime default null comment '创建时间',
  `updated_time` datetime default null comment '更新时间',
  `deleted` tinyint(1) default '0' comment '逻辑删除',
  primary key (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 3 default CHARSET = utf8mb4 comment = '用户表';
create table `t_goods` (
  `id` int(11) not null auto_increment,
  `name` varchar(127) not null default '' comment '商品名称',
  `goods_sn` varchar(63) not null comment '商品编号',
  `category_id` int(11) default '0' comment '商品所属类目ID',
  `brand_id` int(11) default '0',
  `brief` varchar(255) default '' comment '商品介绍',
  `pic_url` varchar(255) default null comment '商品页面商品图片',
  `price` decimal(10, 2) default '0.00' comment '价格',
  `add_time` datetime default null comment '创建时间',
  `updated_time` datetime default null comment '更新时间',
  `deleted` tinyint(1) default '0' comment '逻辑删除',
  primary key (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1181004 default CHARSET = utf8mb4 comment = '商品基本信息表';
create table `t_order` (
  `id` int(11) not null auto_increment,
  `user_id` int(11) not null comment '用户表的用户ID',
  `order_sn` varchar(63) not null comment '订单编号',
  `order_status` smallint(6) not null comment '订单状态',
  `consignee` varchar(63) not null comment '收货人名称',
  `mobile` varchar(63) not null comment '收货人手机号',
  `address` varchar(127) not null comment '收货地址',
  `goods_price` decimal(10, 2) not null comment '商品总费用',
  `ship_sn` varchar(63) default null comment '发货编号',
  `ship_channel` varchar(63) default null comment '发货快递公司',
  `ship_time` datetime default null comment '发货开始时间',
  `end_time` datetime default null comment '订单关闭时间',
  `add_time` datetime default null comment '创建时间',
  `updated_time` datetime default null comment '更新时间',
  `deleted` tinyint(1) default '0' comment '逻辑删除',
  primary key (`id`)
) ENGINE = InnoDB default CHARSET = utf8mb4 comment = '订单表';
create table `t_address` (
  `id` int(11) not null auto_increment,
  `name` varchar(63) not null default '' comment '收货人名称',
  `user_id` int(11) not null comment '用户表的用户ID',
  `province` varchar(63) not null comment '行政区域表的省ID',
  `city` varchar(63) not null comment '行政区域表的市ID',
  `country` varchar(63) not null comment '行政区域表的区县ID',
  `address_detail` varchar(127) not null default '' comment '详细收货地址',
  `area_code` char(6) default null comment '地区编码',
  `postal_code` char(6) default null comment '邮政编码',
  `mobile` varchar(20) not null default '' comment '手机号码',
  `is_default` tinyint(1) not null default '0' comment '是否默认地址',
  `add_time` datetime default null comment '创建时间',
  `update_time` datetime default null comment '更新时间',
  `deleted` tinyint(1) default '0' comment '逻辑删除',
  primary key (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8mb4 COMMENT = '收货地址表';