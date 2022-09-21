package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
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

    @Override
    public void deleteById(UUID beerId) {
        //todo impl - would add a real impl to delete beer
        log.debug("Deleting a Beer " + beerId);
    }
}
