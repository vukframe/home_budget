CREATE TABLE category (
    id SERIAL PRIMARY KEY,
    parent integer REFERENCES category(id),
    category_type varchar(255),
    is_leaf boolean,
    code varchar(255),
    value varchar(255),
    description varchar(255),
    active boolean
);