package burra.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@Entity
public class JobTitle {
  @Id
  @Column(name = "id")
  private int id;

  @Column
  private String name;

}
