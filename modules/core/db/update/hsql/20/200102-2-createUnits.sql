alter table MIMISMART_UNITS add constraint FK_MIMISMART_UNITS_ON_NOMENCLATURE foreign key (NOMENCLATURE_ID) references MIMISMART_NOMENCLATURE(ID);
create index IDX_MIMISMART_UNITS_ON_NOMENCLATURE on MIMISMART_UNITS (NOMENCLATURE_ID);
