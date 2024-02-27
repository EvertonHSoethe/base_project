CREATE TABLE VEHICLE(id int not null, name varchar(255), manufacturer varchar(255), model varchar(255),
 manufacturing_date datetime, consume_per_km_in_city double, consume_per_km_in_road double,
PRIMARY KEY (id));

insert into VEHICLE(id ,name, manufacturer, model, manufacturing_date, consume_per_km_in_city, consume_per_km_in_road)
values(1,'Sandero', 'Renault', 'Sandero Gt-Line 1.6', '2019-05-05 20:00:00',10.5, 14);
insert into VEHICLE(id ,name, manufacturer, model, manufacturing_date, consume_per_km_in_city, consume_per_km_in_road)
values(2,'Gol', 'Volkswagen', 'Gol Rally 1.6', '2019-05-05 20:00:00',12.5, 16);
insert into VEHICLE(id ,name, manufacturer, model, manufacturing_date, consume_per_km_in_city, consume_per_km_in_road)
values(3,'Uno Mille', 'Fia', 'Uno Mille 1.4 Fire', '2010-05-05 20:00:00',14.5, 18);
insert into VEHICLE(id ,name, manufacturer, model, manufacturing_date, consume_per_km_in_city, consume_per_km_in_road)
values(4,'Ferrari 458', 'Ferrari', 'Ferrari 458 Spider', '2019-05-05 20:00:00',5.5, 6.4);
insert into VEHICLE(id ,name, manufacturer, model, manufacturing_date, consume_per_km_in_city, consume_per_km_in_road)
values(5,'C3', 'Citroen', 'Citroen C3 Sonata 1.4 Flex', '2019-05-05 20:00:00',12.5, 16);