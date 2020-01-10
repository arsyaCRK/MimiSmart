create table MIMISMART_ORDERS (
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
    QTY_FACT integer not null,
    REMAINS integer not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
);