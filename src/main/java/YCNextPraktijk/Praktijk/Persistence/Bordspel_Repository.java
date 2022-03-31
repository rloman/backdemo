package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.Bordspel;

@Component
public interface Bordspel_Repository extends CrudRepository<Bordspel, Long> {
}