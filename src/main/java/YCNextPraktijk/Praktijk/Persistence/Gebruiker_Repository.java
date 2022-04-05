package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.Gebruiker;

@Component
public interface Gebruiker_Repository extends CrudRepository<Gebruiker, Long> {
 Gebruiker findByGebruikersNaam(String gn);
 Gebruiker findByDisplayNaam(String dn);
}
