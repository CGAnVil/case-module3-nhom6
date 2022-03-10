create database case_study_nhom6;

use case_study_nhom6;

create table category(
    id int primary key auto_increment,
    name varchar(50) not null unique
);

insert into category(name) values ('Điện thoai'),
                                  ('Laptop'),
                                  ('Tablet'),
                                  ('Phụ kiện'),
                                  ('Đồng hồ thông minh'),
                                  ('PC');

select * from category;

create table product (
    id int primary key auto_increment,
    name varchar(50) not null unique ,
    price double not null
);

alter table product add column categoryId int;
alter table product add foreign key (categoryId) references category(id);

alter table product add column promotionId int;
alter table product add foreign key (promotionId) references promotion(id);

create table promotion (
    id int primary key auto_increment,
    description varchar(150)
);


insert into promotion (description) values ('Tặng kèm dây sạc'),
                                           ('Tặng kèm balo'),
                                           ('Giảm giá 10%'),
                                           ('Tặng kèm ốp lưng');

select *from promotion;

insert into product (name, price, promotionId, categoryId) values ('Iphone 12',30000,1,1),
                                                                  ('MSI G63 ',20000,2,2),
                                                                  ('Ipad Mini',15000,null, 3),
                                                                  ('Dây sạc USB-TypeC to Lightning',4500,null,4),
                                                                  ('Apple Watch',20000,3,5),
                                                                  ('PC',50000,3,6);

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




