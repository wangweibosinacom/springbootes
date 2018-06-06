drop table if exists G_Group;
drop table if exists M_MAP;
drop table if exists T_Loging_User;
drop table if exists T_Service;
create table G_Group
(
   id                   VARCHAR(32) not null,
   _key                 VARCHAR(356) not null,
   _value               VARCHAR(356) not null,
   show_name            VARCHAR(128),
   id_up                VARCHAR(32) not null,
   key_up               VARCHAR(356) not null,
   type_code            VARCHAR(32) not null,
   type_name            VARCHAR(356) not null,
   create_time          TIMESTAMP NULL default CURRENT_TIMESTAMP,
   up_time              TIMESTAMP NULL default CURRENT_TIMESTAMP,
   _state               CHAR(1) not null comment '0-禁用，1-启用',
   Spare1               VARCHAR(356),
   Spare2               VARCHAR(356),
   Spare3               VARCHAR(356),
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table M_MAP
(
   id                   VARCHAR(32) not null,
   idone                VARCHAR(356) not null,
   idtwo                VARCHAR(356) not null,
   type_code            VARCHAR(32) not null,
   type_name            VARCHAR(356) not null,
   show_name            VARCHAR(128),
   create_time          TIMESTAMP NULL default CURRENT_TIMESTAMP,
   up_time              TIMESTAMP NULL default CURRENT_TIMESTAMP,
   _state               CHAR(1) not null comment '0-禁用，1-启用',
   Spare1               VARCHAR(356),
   Spare2               VARCHAR(356),
   Spare3               VARCHAR(356),
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table T_Loging_User
(
   id                   VARCHAR(32) not null,
   show_name            VARCHAR(128),
   loging_name          VARCHAR(128) not null,
   loging_password      VARCHAR(32) not null,
   create_time          TIMESTAMP NULL default CURRENT_TIMESTAMP,
   up_time              TIMESTAMP NULL default CURRENT_TIMESTAMP,
   _state               CHAR(1) not null comment '0-禁用，1-启用',
   Spare1               VARCHAR(356),
   Spare2               VARCHAR(356),
   Spare3               VARCHAR(356),
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table T_Service
(
   id                   VARCHAR(32) not null,
   _key                 VARCHAR(356) not null,
   _value               VARCHAR(356) not null,
   show_name            VARCHAR(128),
   create_time          TIMESTAMP NULL default CURRENT_TIMESTAMP,
   up_time              TIMESTAMP NULL default CURRENT_TIMESTAMP,
   _state               CHAR(1) not null comment '0-禁用，1-启用',
   Spare1               VARCHAR(356),
   Spare2               VARCHAR(356),
   Spare3               VARCHAR(356),
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;