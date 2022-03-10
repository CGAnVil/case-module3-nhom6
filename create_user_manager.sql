use case_study_nhom6;

create table user (
    id int primary key auto_increment,
    name varchar(50) not null ,
    password varchar(50) not null,
    address varchar(50) ,
    phone_number varchar(15)
);



create table role (
    id int primary key auto_increment,
    rolename varchar(20)
);

alter table user add column roleId int;
alter table user add foreign key (roleId) references role(id);

create table orders(
    id int primary key auto_increment

);

alter table orders add column user_id int;
alter table orders add foreign key (user_id) references user(id);

create table order_detail(
    id int primary key auto_increment,
    product_Id int not null ,
    quantity int,
    price double,
    total_price double,
    order_Id int
);

insert into role (rolename) values ('admin'),
                                   ('staff'),
                                   ('member');

insert into user (name, password, address, phone_number,roleId) VALUES ('admin', 'admin',null,null,1),
                                                                       ('staff', 'staff',null,null,2),
                                                                       ('minh', 'minh','HN',null,3),
                                                                       ('sang', 'sang','HP',null,3),
                                                                       ('viet', 'viet','ND',null,3),
                                                                       ('lich', 'lich','NA',null,3),
                                                                       ('hieu', 'hieu','HN',null,3);



