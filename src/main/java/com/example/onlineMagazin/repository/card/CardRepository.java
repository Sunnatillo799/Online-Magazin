package com.example.onlineMagazin.repository.card;

import com.example.onlineMagazin.entity.card.Card;
import com.example.onlineMagazin.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long>, AbstractRepository {
}
