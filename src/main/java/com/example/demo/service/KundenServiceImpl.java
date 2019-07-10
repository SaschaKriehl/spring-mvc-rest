package com.example.demo.service;

import com.example.demo.domain.Kunde;
import com.example.demo.repositories.KundenRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class KundenServiceImpl implements KundenService {

    private final KundenRepository kundenRepository;

    public KundenServiceImpl(KundenRepository kundenRepository) {
        this.kundenRepository = kundenRepository;
    }

    @Override
//    public Kunde findeKundeMitId(Long id) {   // FALSCH!!
//        return kundenRepository.getOne(id);
//    }
    public Kunde findeKundeMitId(Long id) {
        return kundenRepository.findById(id).get();
    }

    @Override
    public List<Kunde> findeAlleKunden() {
        return kundenRepository.findAll();
    }

    @Override
    public Kunde speichereKunde(Kunde kunde) {
        return kundenRepository.save(kunde);
    }
}
