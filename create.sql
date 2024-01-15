
    create schema IF NOT EXISTS user_details;

    create sequence if not exists user_details."user-details_seq" start with 1 increment by 50;

    create table if not exists user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );


    create sequence "user-details_seq" start with 1 increment by 50;

    create table "user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;

    create table user_details."user-details" (
        age integer,
        birth_day date,
        consent_allowed boolean not null,
        id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('USER','ADMIN')),
        primary key (id)
    );

    create sequence "user-details_seq" start with 1 increment by 50;
