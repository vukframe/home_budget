CREATE TABLE flow (
    id SERIAL PRIMARY KEY,
    entry_date timestamp,
    name varchar(255),
    description varchar(255),
    value real,
    currency_type integer REFERENCES currency_type(id),
    tags integer REFERENCES tag(id),
    category integer REFERENCES category(id),
    processed boolean,
    automaticProcessing boolean
);