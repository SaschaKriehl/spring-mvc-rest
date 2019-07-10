package com.example.demo.bootstrap;

import com.example.demo.domain.Kunde;
import com.example.demo.repositories.KundenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDaten implements CommandLineRunner {

    private final KundenRepository kundenRepository;

    public BootStrapDaten(KundenRepository kundenRepository) {
        this.kundenRepository = kundenRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Lade Kundendaten");

        Kunde k1 = new Kunde();
        k1.setVorname("Phillip");
        k1.setNachname("Krüger");
        kundenRepository.save(k1);

        Kunde k2 = new Kunde();
        k2.setVorname("Sascha");
        k2.setNachname("Kriehl");
        kundenRepository.save(k2);

        Kunde k3 = new Kunde();
        k3.setVorname("Marko");
        k3.setNachname("Klatt");
        kundenRepository.save(k3);

        System.out.println("Kunden gepeichert: " + kundenRepository.count());

    }
}
