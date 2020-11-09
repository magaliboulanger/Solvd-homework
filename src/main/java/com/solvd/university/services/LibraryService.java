package com.solvd.university.services;

import com.solvd.university.dao.*;
import com.solvd.university.model.*;

public class LibraryService {
	private IBookDAO Bdao;
	private ILibraryDAO Ldao;
	public LibraryService(IBookDAO bdao, ILibraryDAO ldao) {
		super();
		Bdao = bdao;
		Ldao = ldao;
	}
	public Library getById(long id) {

		Library d = Ldao.getById(id);
		d.setBooks(Bdao.getByLibId(d.getId()));
		return d;

	}
}
