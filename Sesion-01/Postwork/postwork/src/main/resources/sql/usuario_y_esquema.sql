create schema if not exists `javase2_bedu_pw`;

grant all on javase2_bedu_pw.* to 'pwadmin'@'localhost' identified by 'ADMIN_PW_PWD';


flush privileges;
