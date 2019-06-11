package service;

import java.util.List;

import dao.IDao;
import dao.IDaoImpl;
import utils.Users;

public class IServiceImpl implements IService {
	IDaoImpl ii=new IDaoImpl();
	@Override
	public void add(Users u) {
		ii.save(u);
	}

	@Override
	public void delete(Integer uid) {
		ii.delete(uid);
	}

	@Override
	public void edit(Users u) {
		ii.update(u);
	}

	@Override
	public Users getOne(Integer uid) {
		return ii.findone(uid);
	}

	@Override
	public List<Users> getAll() {
		return ii.findAll();
	}

}
