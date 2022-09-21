package guru.springframework.springjms.web.services.v2;

import guru.springframework.springjms.web.model.v2.BeerDtoV2;
import guru.springframework.springjms.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        //Patron de diseño Builder
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beetStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beer) {

        return  BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beer) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        //todo impl - would add a real impl to delete beer
        log.debug("Deleting a Beer " + beerId);
    }
}
