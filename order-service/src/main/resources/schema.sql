DROP TABLE IF EXISTS t_order;

create table t_order (
id bigint auto_increment primary key, 
customername varchar(80),
orderdate TIMESTAMP,
shippingaddress varchar(255),
total decimal(10, 2) 
);
