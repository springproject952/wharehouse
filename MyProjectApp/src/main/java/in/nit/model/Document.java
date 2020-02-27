package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "docstabs")
public class Document {
	@Id
	private Integer fileId;
	private String fName;
	@Lob
	private byte[] fData;
	
}
