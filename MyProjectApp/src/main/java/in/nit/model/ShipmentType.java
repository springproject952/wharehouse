package in.nit.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ShipmentType {
	@GeneratedValue
	@Id
	private Integer shipId;
	private String shipMode;
	private String shipCode;
	private String entbShip;
	private String shipGrad;
	private String shipDisc;
	public ShipmentType() {
		super();
	}
	public Integer getShipId() {
		return shipId;
	}
	public ShipmentType(Integer shipId) {
		super();
		this.shipId = shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipMode() {
		return shipMode;
	}
	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getEntbShip() {
		return entbShip;
	}
	public void setEntbShip(String entbShip) {
		this.entbShip = entbShip;
	}
	public String getShipGrad() {
		return shipGrad;
	}
	public void setShipGrad(String shipGrad) {
		this.shipGrad = shipGrad;
	}
	public String getShipDisc() {
		return shipDisc;
	}
	public void setShipDisc(String shipDisc) {
		this.shipDisc = shipDisc;
	}
	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", entbShip="
				+ entbShip + ", shipGrad=" + shipGrad + ", shipDisc=" + shipDisc + "]";
	}
	

}
