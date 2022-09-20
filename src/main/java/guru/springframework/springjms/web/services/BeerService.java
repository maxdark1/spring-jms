package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
