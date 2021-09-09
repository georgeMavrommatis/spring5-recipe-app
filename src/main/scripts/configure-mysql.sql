--Create Databases
CREATE DATABASE sfg_dev;
CREATE DATABASE sfg_prod;

--create user
CREATE USER 'sfg_dev_user'@'localhost' IDENTIFIED BY 'guru';
CREATE USER 'sfg_prod_user'@'localhost' IDENTIFIED BY 'guru';

--grant user previleges
GRANT SELECT,INSERT,UPDATE,DELETE
  ON sfg_dev.*
  TO 'sfg_dev_user'@'localhost';
GRANT SELECT,INSERT,UPDATE,DELETE
  ON sfg_dev.*
  TO 'sfg_prod_user'@'localhost';

--show user previleges
SHOW GRANTS FOR 'sfg_dev_user'@'localhost';
SHOW GRANTS FOR 'sfg_prod_user'@'localhost';
--see nonprivilege properties for an account, use SHOW CREATE USER
SHOW CREATE USER 'sfg_dev_user'@'localhost';
SHOW CREATE USER 'sfg_prod_user'@'localhost';
--Drop User
DROP USER 'sfg_dev_user'@'localhost';
DROP USER 'sfg_prod_user'@'localhost';

--For Docker
--create user
CREATE USER 'sfg_dev_user'@'%' IDENTIFIED BY 'guru';
CREATE USER 'sfg_prod_user'@'%' IDENTIFIED BY 'guru';

--grant user previleges
GRANT SELECT,INSERT,UPDATE,DELETE
  ON sfg_dev.*
  TO 'sfg_dev_user'@'%';
GRANT SELECT,INSERT,UPDATE,DELETE
  ON sfg_dev.*
  TO 'sfg_prod_user'@'%';

