package dataLayer;

import java.util.List;

import dataLayerInterfaces.DALException;
import dataLayerInterfaces.IOperatoerDAO;
import dataTransferObject.OperatoerDTO;

public class OperatoerDAO implements IOperatoerDAO {

	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}

}