CREATE TABLE expense (
    id SERIAL PRIMARY KEY,
    flow integer REFERENCES flow(id)
);