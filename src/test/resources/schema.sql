create schema if not exists my_schema;
create table if not exists my_schema.customer(
    id bigserial primary key,
    name varchar not null,
    email varchar not null
);