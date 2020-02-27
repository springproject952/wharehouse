package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uomdata")
public class CreateUom {
	@Id
	@GeneratedValue
	@Column(name = "uidn")
	private Integer uomId;
	@Column(name = "uomtyp")
	private String uomType;
	@Column(name = "uommod")
	private String uomModel;
	@Column(name = "discription")
	private String uomDiscription;
	public CreateUom(Integer id) {
		this.uomId=id;
	}
	public Integer getUomId() {
		return uomId;
	}
	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getUomDiscription() {
		return uomDiscription;
	}
	public void setUomDiscription(String uomDiscription) {
		this.uomDiscription = uomDiscription;
	}
	@Override
	public String toString() {
		return "CreateUom [uomId=" + uomId + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDiscription="
				+ uomDiscription + "]";
	}
	public CreateUom() {
		super();
	}
	
}
