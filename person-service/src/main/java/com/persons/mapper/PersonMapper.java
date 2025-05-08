package com.persons.mapper;

import com.persons.dto.PersonDTO;
import com.persons.entity.Person;
import org.mapstruct.Mapper;


@Mapper
public interface PersonMapper {

    Person toEntity(PersonDTO personDTO);
    PersonDTO toDTO(Person person);
}
