package com.leiyuan.myssh.service.impl;

import com.leiyuan.myssh.entity.Person;
import com.leiyuan.myssh.repository.PersonRepository;
import com.leiyuan.myssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XRom
 * On 11/16/2017.11:58 PM
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired(required = true)
    private PersonRepository personRepository;

    public Long savePerson() {
        Person person = new Person();
        person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
        return personRepository.save(person);
    }

	@Override
	public Person get(Long id) {
		// TODO Auto-generated method stub
		return personRepository.get(id);
	}
}
