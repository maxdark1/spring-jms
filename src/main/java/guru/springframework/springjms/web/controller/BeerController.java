package guru.springframework.springjms.web.controller;

import java.util.UUID;

import guru.springframework.springjms.web.model.BeerDto;
import guru.springframework.springjms.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService){
        this.beerService = beerService;
    }
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    @PostMapping // POST - create new beer
    public  ResponseEntity handlePost(@RequestBody BeerDto beer){
        BeerDto savedDto = beerService.saveNewBeer(beer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beer){
        beerService.updateBeer(beerId, beer);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);

    }
}
