create table MIMISMART_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_ID varchar(36) not null,
    UNITS_ID varchar(36) not null,
    QTY integer not null,
    QTYFACT integer,
    DESCRIPTION varchar(255),
    ORDER_FROM_SUPPLIER_ID varchar(36),
    --
    primary key (ID)
);