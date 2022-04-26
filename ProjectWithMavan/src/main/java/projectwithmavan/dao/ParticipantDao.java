package projectwithmavan.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

import projectwithmavan.participant.Participant;

@Component
public class ParticipantDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create
	@Transactional
	public int createProduct(Participant participant) {

		Integer i = (Integer)this.hibernateTemplate.save(participant);
		return i;

	}
	
	// get all participant
		public List<Participant> getParticipantss() {
			List<Participant> participants = this.hibernateTemplate.loadAll(Participant.class);
			return participants;
		}
		
		// delete the single participant
		@Transactional
		public void deleteParticipant(int pid) {
			Participant p = this.hibernateTemplate.load(Participant.class, pid);
			this.hibernateTemplate.delete(p);
		}
	
		// get the single participant
		public Participant getParticipant(int pid) {
			return this.hibernateTemplate.get(Participant.class, pid);
		}
}
