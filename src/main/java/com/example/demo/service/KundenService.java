package com.example.demo.service;

import com.example.demo.domain.Kunde;

import java.util.List;

public interface KundenService {

    Kunde findeKundeMitId(Long id);

    List<Kunde> findeAlleKunden();

    Kunde speichereKunde(Kunde kunde);
}
