package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.Gebruiker;

@Component
public interface GebruikerRepository extends CrudRepository<Gebruiker, Long> {

}
