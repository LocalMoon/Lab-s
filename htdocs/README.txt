	Для работы web-приложения необходимо:
1. Установить приложение для создания локального сервера. Мной использовался MAMP.
2. В папке, где установлена программа (C:\MAMP) заменить папку htdocs на текущую.
3. Запустить локальный сервер через приложение MAMP (запуститься должен не только Apache, но и MySQL).
4. Открыть phpMyAdmin (введя в строке браузера - http://localhost/phpMyAdmin/?lang=en).
5. Нажать на кнопку "New" для создания новой БД.
6. Написать название - sport_team, нажать "Create".
7. Нажать кнопку "SQL" для ввода SQL-кода.
8. Ввести приведенный код ниже и нажать "Go".
CREATE TABLE `auto_salon`.`auto` ( `auto_mark` VARCHAR(50) NOT NULL , `model` VARCHAR(50) NOT NULL , `year` INT NOT NULL  , `price` FLOAT NOT NULL , PRIMARY KEY (`auto_mark`)) ENGINE = InnoDB;
INSERT INTO auto VALUES 
  ('Ford', 'Mustang GT', 2019, 2300.00),
  ('Audi', 'R8 quatro', 2019, 2500.10),
  ('Chevrolet', 'Corvette C6', 2006, 3650.00),
  ('Dodge', 'Charger', 2019, 3750.00),
  ('Lamborghini', 'Aventador', 2014, 25000.00),
  ('Ferrari', 'Enzo', 2004, 133957.37);
  
9. Ввести в строке браузера "localshost", после чего всё должно заработать.
