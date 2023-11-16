create database lab4;
use lab4;
Create table Candidate
(
    can_id BIGINT PRIMARY KEY,
    name   VARCHAR(255),
    email  VARCHAR(255),
    phone  VARCHAR(20)
);

CREATE TABLE Skill
(
    skill_id  BIGINT PRIMARY KEY,
    skillName VARCHAR(255)
);

CREATE TABLE CandidateSkill
(
    can_id   BIGINT,
    skill_id BIGINT,
    level   VARCHAR(255) ,
    PRIMARY KEY (can_id, skill_id),
    FOREIGN KEY (can_id) REFERENCES Candidate (can_id),
    FOREIGN KEY (skill_id) REFERENCES Skill (skill_id)
);
