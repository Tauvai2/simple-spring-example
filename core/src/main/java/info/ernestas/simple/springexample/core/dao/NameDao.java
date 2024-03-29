package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.dao.repository.NameRepository;
import info.ernestas.simple.springexample.core.model.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NameDao {

    @Autowired
    private NameRepository nameRepository;

    @Cacheable("namesCache")
    public List<Name> findAll() {
        return nameRepository.findAll();
    }

}
