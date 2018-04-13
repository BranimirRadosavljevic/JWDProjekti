package autbuska.stanica.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import autbuska.stanica.model.Kupovina;
import autbuska.stanica.web.dto.KupovinaDTO;

@Component
public class KupovinaToKupovinaDTO implements Converter<Kupovina, KupovinaDTO> {

	@Override
	public KupovinaDTO convert(Kupovina kupovina) {
		KupovinaDTO dto = new KupovinaDTO();
		
		dto.setId(kupovina.getId());
		dto.setBrojKarata(kupovina.getBrojKarata());
		dto.setCena(kupovina.getBrojKarata() * kupovina.getLinija().getCenaKarte());
				
		return dto;
	}
	
	
}
