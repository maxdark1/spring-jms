package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        //Patron de diseño Builder
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beetStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {

        return  BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beer) {
        //todo impl - would add a real impl to update beer
    }
}
