-- alter table MIMISMART_ORDER_STATUS add column COLOR varchar(25) ^
-- update MIMISMART_ORDER_STATUS set COLOR = <default_value> ;
-- alter table MIMISMART_ORDER_STATUS alter column COLOR set not null ;
alter table MIMISMART_ORDER_STATUS add column COLOR varchar(25) ;
