alter table MIMISMART_ORDER_FROM_SUPPLIER alter column NOMENCLATURE_ID rename to NOMENCLATURE_ID__U45559 ^
alter table MIMISMART_ORDER_FROM_SUPPLIER drop constraint FK_MIMISMART_ORDER_FROM_SUPPLIER_ON_NOMENCLATURE ;
drop index IDX_MIMISMART_ORDER_FROM_SUPPLIER_ON_NOMENCLATURE ;