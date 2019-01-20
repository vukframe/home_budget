CREATE TABLE income (
    id SERIAL PRIMARY KEY,
    flow integer REFERENCES flow(id)
);