alter table MIMISMART_ORDER_FROM_SUPPLIER_NOMENCLATURE_LINK add constraint FK_ORDFROSUPNOM_ON_ORDER_FROM_SUPPLIER foreign key (ORDER_FROM_SUPPLIER_ID) references MIMISMART_ORDER_FROM_SUPPLIER(ID);
alter table MIMISMART_ORDER_FROM_SUPPLIER_NOMENCLATURE_LINK add constraint FK_ORDFROSUPNOM_ON_NOMENCLATURE foreign key (NOMENCLATURE_ID) references MIMISMART_NOMENCLATURE(ID);