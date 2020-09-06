DROP TABLE IF EXISTS orderitem;

create table orderitem (
id bigint auto_increment primary key, 
productcode varchar(20),
productname varchar(80),
quantity bigint,
orderid bigint 
);