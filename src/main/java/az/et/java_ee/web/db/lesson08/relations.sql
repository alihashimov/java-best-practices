create table countries
(
    id   serial primary key,
    name varchar(255) not null unique

);
create table capitals
(
    id         serial primary key,
    name       varchar(255) not null unique,
    country_id bigint       not null,
    constraint fk_country foreign key (country_id) references countries (id)

);
drop table capitals;
select *
from countries;
insert into countries(name)
values ('USA');
select *
from capitals;
insert into capitals (name, country_id)
values ('Baku', 1);
;
select *
from countries
where id = (select country_id from capitals);
select *
from countries as coun
         inner join capitals c on coun.id = c.country_id
         join capitals as cap on coun.id = cap.country_id;
create table author
(
    id   serial primary key,
    name text
);

create table article
(
    id        serial primary key,
    title     text not null,
    content   text not null,
    author_id int  not null,
    constraint fk_author foreign key (author_id) references author (id)

);
drop table article;
create table article
(
    id    serial primary key,
    title TEXT
);
create table tag
(
    id        serial primary key,
    tag_value TEXT
);
select *
from author;
select *
from article;
CREATE table article_tag_rel
(
    id         serial
        PRIMARY KEY,
    article_id INT,
    tag_id     INT,
    constraint fk_article foreign key (article_id) references article (id),
    constraint fk_tag foreign key (tag_id) references tag (id)
);
SELECT *
FROM article;
SELECT *
FROM tag;
SELECT *
FROM article_tag_rel;


