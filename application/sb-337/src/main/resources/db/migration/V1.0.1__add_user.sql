CREATE TABLE `sb337`.`user`(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `email` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `first_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(255) NOT NULL,
    `register_dt` DATETIME NOT NULL,
    `created_dt` DATETIME NOT NULL,
    `updated_dt` DATETIME NOT NULL
);
