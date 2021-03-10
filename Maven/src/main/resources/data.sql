
drop table if exists Trabajadores;
create table Trabajadores(
id int auto_increment primary key,
nombre varchar(250) not null,
puesto enum('DESARROLLO', 'SISTEMAS', 'ADMINISTRACION', 'GESTION') not null,
sueldo float not null
);

insert into Trabajadores(nombre,puesto,sueldo) values('Toni Arjona','DESARROLLO',20000);