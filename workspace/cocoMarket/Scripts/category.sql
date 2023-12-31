-- 대카테고리
CREATE TABLE primary_category (
    primary_category_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

-- 중카테고리 (대카테고리를 참조)
CREATE TABLE sub_category1 (
    sub_category1_id INT PRIMARY KEY AUTO_INCREMENT,
    primary_category_id INT,
    name VARCHAR(255) NOT NULL,
    FOREIGN KEY (primary_category_id) REFERENCES primary_category(primary_category_id)
);

-- 소카테고리 (중카테고리를 참조)
CREATE TABLE sub_category2 (
    sub_category2_id INT PRIMARY KEY AUTO_INCREMENT,
    sub_category1_id INT,
    name VARCHAR(255) NOT NULL,
    FOREIGN KEY (sub_category1_id) REFERENCES sub_category1(sub_category1_id)
);

-- 대카테고리 삽입
INSERT INTO primary_category (name) VALUES ('의류');
INSERT INTO primary_category (name) VALUES ('신발');

-- 의류에 대한 중카테고리 삽입
INSERT INTO sub_category1 (primary_category_id, name) VALUES (LAST_INSERT_ID(), '남성의류');
INSERT INTO sub_category1 (primary_category_id, name) VALUES (LAST_INSERT_ID(), '스포츠화');

-- 남성의류에 대한 소카테고리 삽입
INSERT INTO sub_category2 (sub_category1_id, name) VALUES (2, '테니스화');
INSERT INTO sub_category2 (sub_category1_id, name) VALUES (2, '축구화');
INSERT INTO sub_category2 (sub_category1_id, name) VALUES (1, '아우터');
INSERT INTO sub_category2 (sub_category1_id, name) VALUES (1, '후드');



SELECT * from primary_category;

SELECT * from sub_category1;

SELECT * from sub_category2;






