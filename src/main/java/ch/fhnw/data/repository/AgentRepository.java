package ch.fhnw.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ch.fhnw.data.domain.Agent;


@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

	public Agent findByEmail(@Param("email")String email);
}
