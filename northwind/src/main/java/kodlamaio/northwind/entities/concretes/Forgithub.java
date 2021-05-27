package kodlamaio.northwind.entities.concretes;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Forgithub {
	
	private int id;
	private String name;
	private String surname;

}
