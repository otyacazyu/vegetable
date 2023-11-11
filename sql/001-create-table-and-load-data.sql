DROP TABLE IF EXISTS vegetables;

CREATE TABLE vegetables (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO vegetables (id,name) VALUES (1, "トマト");
INSERT INTO vegetables (id,name) VALUES (2, "きゅうり");
INSERT INTO vegetables (id,name) VALUES (3, "南瓜");
INSERT INTO vegetables (id,name) VALUES (4, "玉ねぎ");

