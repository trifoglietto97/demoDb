/*
 * This file is generated by jOOQ.
 */
package com.example.demodb.entityUpdate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NotificationKinshipText {
    @Id
    private Kinship KINSHIP;
    @Id
    private Lang LANG;
    private String TEXT;
}
