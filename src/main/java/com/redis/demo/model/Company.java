package com.redis.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ismayil Hamzatli on Dec, 2019
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String type;

}
