package com.leiyuan.myssh.service;

import com.leiyuan.myssh.entity.Person;

/**
 * Created by XRom
 * On 11/16/2017.11:57 PM
 */
public interface PersonService {
    Long savePerson();
    Person get(Long id);
}
