package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.AppointmentRecord;
import model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	//login authentication
	Patient findByEmailIdAndPassword(String emailId, String password);

	Patient findByPid2(long id);

	Patient findByEmailId(String emailId);

	
}