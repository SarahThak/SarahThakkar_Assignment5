package com.cis365.week5;

import com.cis365.week5.models.PlanetVisit;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
public class PlanetVisitController {

    @GetMapping("/visit")
    public List<PlanetVisit> visits() {
        return DataStore.listVisits();
    }

   

    @PostMapping(value="/visit/{planetId}", consumes = { MediaType.APPLICATION_JSON_VALUE})
      public Planetvisit addPlanetVisit(@RequestBody Planetvisit planetVisitToAdd) {
        return DataStore.addPlanetVisit(planetVisitToAdd);
      }
}
