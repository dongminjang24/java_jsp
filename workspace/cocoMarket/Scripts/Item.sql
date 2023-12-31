create database coco_market;

use coco_market;




select * from tbl_user;

USE coco_market;

-- tbl_item 테이블 생성
CREATE TABLE tbl_item(
    item_number BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(255),
    item_address VARCHAR(255),
    item_status BOOLEAN,
    item_change_boolean BOOLEAN,
    item_price BIGINT,
    item_description TEXT,
    item_create_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    user_number INT UNSIGNED,
    sub_category2_id INT,
    shipping_price BOOLEAN NOT NULL DEFAULT TRUE,
    protected_payment BOOLEAN NOT NULL DEFAULT FALSE,
    item_count INT UNSIGNED NOT NULL DEFAULT 1,
    CONSTRAINT fk_item_user FOREIGN KEY (user_number) REFERENCES tbl_user(user_number) ON DELETE CASCADE,
    CONSTRAINT fk_item_cat FOREIGN KEY (sub_category2_id) REFERENCES sub_category2(sub_category2_id)
);
select * from tbl_item;

select * from tbl_item WHERE item_number =1;
