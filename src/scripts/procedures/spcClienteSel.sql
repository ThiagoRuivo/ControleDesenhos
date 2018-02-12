/**
 * Author:  Thiago Baldykowski
 * Created: 01/11/2017
 */

if object_id ('dbo.spcClienteSel', 'p') is null
begin
  exec ('create procedure dbo.spcClientesSel as');
end;
go

alter procedure dbo.spcClientesSel @pCodigo int
as
begin
  select pkClientes,
         nomeCliente
    from dbo.clientes c with(nolock)
   where c.pkClientes = @pCodigo
end;
