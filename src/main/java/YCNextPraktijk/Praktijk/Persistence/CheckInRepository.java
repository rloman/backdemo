package YCNextPraktijk.Praktijk.Persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.CheckIn;

@Component
public interface CheckInRepository extends CrudRepository<CheckIn, Long> {
	List<CheckIn> findCheck_InsByBordspel(String bordspel);
}
