alter table MIMISMART_NOMENCLATURE add constraint FK_MIMISMART_NOMENCLATURE_ON_ORDER_FROM_SUPPLIER foreign key (ORDER_FROM_SUPPLIER_ID) references MIMISMART_ORDER_FROM_SUPPLIER(ID);
create index IDX_MIMISMART_NOMENCLATURE_ON_ORDER_FROM_SUPPLIER on MIMISMART_NOMENCLATURE (ORDER_FROM_SUPPLIER_ID);
