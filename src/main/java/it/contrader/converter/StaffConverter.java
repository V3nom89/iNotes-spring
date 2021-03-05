package it.contrader.converter;

import org.springframework.stereotype.Component;
import it.contrader.dto.StaffDTO;
import it.contrader.model.Staff;


@Component
public class StaffConverter extends AbstractConverter<Staff, StaffDTO>{

	@Override
	public Staff toEntity(StaffDTO staffDTO) {
		Staff staff = null;
		if (staffDTO != null) {
			staff = new Staff(staffDTO.getIdStaff(), staffDTO.getNome(), staffDTO.getCognome(), staffDTO.getEmail(),staffDTO.getPosizione(),
					staffDTO.getNumeroTelefono(),staffDTO.getDataAssunzione(),staffDTO.getSede(),staffDTO.getOreSettimanali(),staffDTO.getCodiceFiscale());
			
		}
		return staff;
	}
	@Override
	public StaffDTO toDTO(Staff staff) {
		StaffDTO staffDTO = null;
		if (staff != null) {
			staffDTO = new StaffDTO(staff.getIdStaff(),staff.getNome(), staff.getCognome(), staff.getEmail(),staff.getPosizione(),
					staff.getNumeroTelefono(),staff.getDataAssunzione(),staff.getSede(),staff.getOreSettimanali(),staff.getCodiceFiscale());
		}
		return staffDTO;
	}

}