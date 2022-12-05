select count(*)
from customers;
select *
from customers;
insert into customers(customer_id, customer_name, contact_name, address, city, postal_code, country)
values (92, 'Elvin', 'Elvin', 'Baku', 'Baku', 'AZE1000', 'Azerbaijan');
--crud
--ddl -> create,    dml ->insert
--ddl-select ,      dml-select
--ddl->alter ,      dml-update
--ddl ->drop ,      dml->delete

delete
from customers
where customer_id = 92;
delete
from customers;
select *
from customers
order by customer_id;
alter table customers
    add column silinmeli varchar(10);
alter table customers
drop
silinmeli;
update customers
set customer_name='ss'
where customer_id = 91;
update customers
set silinmeli='added';
update customers
set silinmeli='even_row'
where mod(customer_id, 2) = 0;
select *
from customers;
select *
from customers
order by city desc limit 10;
select min(length(customer_name)), customer_name
from customers
group by customer_name;
select *
from customers;
select *
from customers
where city in ('Berlin', 'Warsaw', 'Torino');
SELECT *
FROM customers
WHERE customer_id BETWEEN 30 AND 90;
select customer_id, customer_name, contact_name as leqeb
from customers;


