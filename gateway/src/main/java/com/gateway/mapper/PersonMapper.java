package com.gateway.mapper;

import com.gateway.dto.Person;
import com.gateway.dto.PersonDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    PersonDTO toDto(Person person);
}
