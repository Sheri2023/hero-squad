CREATE TABLE "squads" (
  "id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "name" varchar unique,
  "max_size" int DEFAULT 5,
  "cause" varchar,
  "deleted" boolean DEFAULT false
);


CREATE TABLE "heroes" (
  "id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "name" varchar unique,
  "age" int,
  "squad_id" int,
  "strength_id" int,
  "weakness_id" int,
  "deleted" boolean DEFAULT false
);

CREATE TABLE "strengths" (
  "id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "name" varchar unique,
  "score" int DEFAULT 5,
  "deleted" boolean DEFAULT false
);

CREATE TABLE "weakness" (
  "id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "name" varchar unique,
  "score" int DEFAULT -5,
  "deleted" boolean DEFAULT false
);