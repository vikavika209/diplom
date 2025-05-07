package com.example.mapper;

import com.example.dto.PersonDTO;
import com.example.entity.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-07T22:09:18+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (BellSoft)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toEntity(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setFullName( personDTO.getFullName() );
        person.setPassportData( personDTO.getPassportData() );

        return person;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );
        personDTO.setFullName( person.getFullName() );
        personDTO.setPassportData( person.getPassportData() );

        return personDTO;
    }
}
