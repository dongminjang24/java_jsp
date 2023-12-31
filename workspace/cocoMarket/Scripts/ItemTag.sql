create database coco_market;

use coco_market;



CREATE TABLE tbl_item_tag(
    item_tag_number INT AUTO_INCREMENT PRIMARY KEY,
    item_tag_name VARCHAR(255) UNIQUE
);

CREATE TABLE tbl_tag_relative(
    item_number BIGINT UNSIGNED NOT NULL,
    item_tag_number INT NOT NULL,
    FOREIGN KEY (item_number) REFERENCES tbl_item(item_number),
    FOREIGN KEY (item_tag_number) REFERENCES tbl_item_tag(item_tag_number)
);

SELECT * from tbl_item_tag;
SELECT * from tbl_tag_relative;
