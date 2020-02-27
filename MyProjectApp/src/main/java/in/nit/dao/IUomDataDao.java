package in.nit.dao;

import java.util.List;

import in.nit.model.CreateUom;
import in.nit.model.ShipmentType;

public interface IUomDataDao {
Integer saveUomData(CreateUom u);

List<CreateUom>getAllUomtype();

public void deleteUom(Integer id);

CreateUom getOneUom(Integer id);

void updateUom(CreateUom ob);


}
