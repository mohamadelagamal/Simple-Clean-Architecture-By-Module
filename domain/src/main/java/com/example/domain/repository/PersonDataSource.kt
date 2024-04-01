package com.example.domain.repository

import com.example.domain.model.PersonDTO

// here PersonDataSource is an interface with a single method getPersonList()
// which returns a list of PersonDTO

interface PersonDataSource {

    // person class is pojo class with three properties title, job and image
    // pojo used to represent the data in the application layer and it is used to transfer data between software application subsystems
    fun getPersonList():MutableList<PersonDTO>

}