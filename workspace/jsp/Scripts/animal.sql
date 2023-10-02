CREATE database animal;
use animal;

create table tbl_animal(
 animal_number int unsigned auto_increment primary key,
 animal_name varchar(255),
 animal_life tinyint unsigned,
 animal_species varchar(255),
 animal_detail varchar(255)
);

SELECT * from tbl_animal;

insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('사자', 12, '고양이과', '갈기가 있다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('코알라', 100, '코알라과', '24시간 중에 20시간 잔다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('거북이', 120, '거북이과', '너무 오래산다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('돼지', 8, '멧돼지과', '의외로 깨끗하지만 뚱뚱하다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('고라니', 7, '노라과', '차에 뛰에 든다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('비둘기', 3, '새과', '지하철을 탈 수 있다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('카멜레온', 8, '도마뱀과', '색깔 바뀐다.');
insert into tbl_animal(animal_name, animal_life, animal_species, animal_detail)
values('고양', 2, '고양이', '냥.');


