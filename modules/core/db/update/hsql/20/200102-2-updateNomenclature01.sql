alter table MIMISMART_NOMENCLATURE add constraint FK_MIMISMART_NOMENCLATURE_ON_UNITS foreign key (UNITS_ID) references MIMISMART_UNITS(ID);
create index IDX_MIMISMART_NOMENCLATURE_ON_UNITS on MIMISMART_NOMENCLATURE (UNITS_ID);
