package com.example.onlineMagazin.entity.card;

import com.example.onlineMagazin.entity.authUser.AuthUser;
import com.example.onlineMagazin.entity.base.Auditable;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "card")
public class Card extends Auditable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AuthUser userId;
    private Long pan;
    private String card_type;
    private String holder_name;
}
