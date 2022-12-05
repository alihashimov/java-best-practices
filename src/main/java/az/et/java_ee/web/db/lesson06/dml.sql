-------------DML-----------------

select * from people;

create table customers(

                          customer_iD bigint,
                          customer_name varchar(255),
                          contact_name varchar(255) ,
                          address varchar(255) ,
                          city varchar(255),
                          postal_code varchar(255),
                          country varchar(255)
);

select count(city) from customers;
select  count(distinct(city))  from customers;
select * from customers;
select * from customers where city='London';
select * from customers where city like '_o%';
select * from customers where customer_iD>3;
select * from customers where customer_iD<3;
select * from customers where customer_iD in(3,7);
select * from customers where customer_iD>3 and contact_name='Victoria Ashworth';
select * from customers where customer_iD>3 and customer_iD<7;
select * from customers order by customer_iD desc ;
select * from customers order by city desc ,customer_name asc ;
insert into customers(customer_iD, customer_name, contact_name, address, city, postal_code, country)
values(14,'Ali','Ali','Baku','Baku','AZ1000','AZE');
select * from customers;