alter table MIMISMART_NOMENCLATURE_ORDER_FROM_SUPPLIER_LINK add constraint FK_NOMORDFROSUP_ON_ORDER_FROM_SUPPLIER foreign key (ORDER_FROM_SUPPLIER_ID) references MIMISMART_ORDER_FROM_SUPPLIER(ID);
alter table MIMISMART_NOMENCLATURE_ORDER_FROM_SUPPLIER_LINK add constraint FK_NOMORDFROSUP_ON_NOMENCLATURE foreign key (NOMENCLATURE_ID) references MIMISMART_NOMENCLATURE(ID);