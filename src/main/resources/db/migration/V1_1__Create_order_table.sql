CREATE TABLE coffee_order
(
    id          BIGSERIAL PRIMARY KEY,
    type        VARCHAR(16) NOT NULL,
    size        VARCHAR(2)  NOT NULL,
    sugar       INT         NOT NULL,
    createdTime TIMESTAMP   NOT NULL,
    updatedTime TIMESTAMP   NOT NULL
)