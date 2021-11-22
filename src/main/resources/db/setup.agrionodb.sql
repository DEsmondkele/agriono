create  database agrionodb;

create  user 'agriono_user'@'localhost' identified by 'agriono123';
grant all privileges on agrionodb.* to 'agriono_user'@'localhost';
flush privileges ;