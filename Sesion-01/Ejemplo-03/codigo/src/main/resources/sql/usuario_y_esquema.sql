create schema if not exists `BEDU_JSE2`;

grant all on BEDU_JSE2.* to 'admin'@'localhost' identified by 'ADMIN_PWD';

grant SELECT on BEDU_JSE2.* to 'usuario'@'localhost' identified by 'PASSWD';

flush privileges;
