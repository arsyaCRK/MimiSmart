-- begin MIMISMART_SUPPLIER
create table MIMISMART_SUPPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPANY_NAME varchar(100) not null,
    COMPANY_ADDRESS varchar(255) not null,
    PHONE_NUMBER varchar(12) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end MIMISMART_SUPPLIER
-- begin MIMISMART_ORDER_FROM_SUPPLIER
create table MIMISMART_ORDER_FROM_SUPPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SUPPLIER_ID varchar(36),
    ORDER_NUM decimal(19, 2) not null,
    DATE_ date not null,
    NAME varchar(255) not null,
    UNIT varchar(5) not null,
    QUANTITY decimal(19, 2) not null,
    STATUS_ID varchar(36),
    --
    primary key (ID)
)^
-- end MIMISMART_ORDER_FROM_SUPPLIER
-- begin MIMISMART_ORDER_STATUS
create table MIMISMART_ORDER_STATUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end MIMISMART_ORDER_STATUS

-- begin MIMISMART_UNITS
create table MIMISMART_UNITS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(5) not null,
    DESCRIPTION varchar(25) not null,
    --
    primary key (ID)
)^
-- end MIMISMART_UNITS
-- begin MIMISMART_NOMENCLATURE
create table MIMISMART_NOMENCLATURE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    UNIT_ID varchar(36) not null,
    DESCRIPTION varchar(255),
    ORDER_FROM_SUPPLIER_ID varchar(36),
    --
    primary key (ID)
)^
-- end MIMISMART_NOMENCLATURE
-- begin MIMISMART_ORDER_LINE
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
)^
-- end MIMISMART_ORDER_LINE
