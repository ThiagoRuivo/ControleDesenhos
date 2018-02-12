
/**
 * Author:  Thiago Baldykowski
 * Created: 01/11/2017
 */

if object_id ('dbo.clientes', 'u') is null
begin
  create table dbo.clientes(
    pkCliente int identity primary key not null,
    nomeCliente varchar(255)
  );
end;
go
