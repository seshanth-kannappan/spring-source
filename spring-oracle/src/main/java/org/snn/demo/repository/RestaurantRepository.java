package org.snn.demo.repository;

import org.snn.demo.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

   Restaurant findByrestaurantName(String name);

}
