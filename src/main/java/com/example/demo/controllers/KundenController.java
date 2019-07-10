package com.example.demo.controllers;

import com.example.demo.domain.Kunde;
import com.example.demo.service.KundenService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(KundenController.BASIS_URL)
public class KundenController {

    public static final String BASIS_URL = "api/v1/kunden";

    private final KundenService kundenService;

    public KundenController(KundenService kundenService) {
        this.kundenService = kundenService;
    }

    @GetMapping
    List<Kunde> holeAlleKunden() {
        return kundenService.findeAlleKunden();
    }

    @GetMapping("/{id}")
    public Kunde holeKundeMitId (@PathVariable Long id) {
        return kundenService.findeKundeMitId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Kunde speichereKunde(@RequestBody Kunde kunde) {
        return kundenService.speichereKunde(kunde);
    }
}
