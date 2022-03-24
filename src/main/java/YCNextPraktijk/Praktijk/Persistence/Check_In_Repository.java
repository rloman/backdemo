package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.Check_In;

@Component
public interface Check_In_Repository extends CrudRepository<Check_In, Long> {

}
