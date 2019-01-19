CREATE TABLE tag (
    id SERIAL PRIMARY KEY,
    code varchar(255),
    value varchar(255),
    description varchar(255),
    active boolean
);