package com.cis365.week5;

import com.cis365.week5.models.PlanetVisit;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
public class PlanetVisitController {

    @GetMapping("/visit")
    public List<PlanetVisit> visits() {
        return DataStore.listPlanetVisits();
    }

   

    @PostMapping(value="/visit/{planetId}", consumes = { MediaType.APPLICATION_JSON_VALUE})
      public PlanetVisit addPlanetVisit(@RequestBody PlanetVisit planetVisitToAdd) {
        return DataStore.addPlanetVisit(planetVisitToAdd);
      }
}
