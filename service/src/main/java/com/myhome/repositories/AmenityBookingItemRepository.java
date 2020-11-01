package com.myhome.repositories;

import com.myhome.domain.AmenityBookingItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AmenityBookingItemRepository extends JpaRepository<AmenityBookingItem, String> {
    Optional<AmenityBookingItem> findByAmenityBookingItemId(String amenityBookingItemId);
}
