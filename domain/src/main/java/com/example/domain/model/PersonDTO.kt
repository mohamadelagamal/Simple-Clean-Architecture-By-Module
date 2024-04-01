package com.example.domain.model

// here pur data class Person is defined with three properties title, job and image
// all of them are nullable
// DTO is Data Transfer Object which is used to transfer data between software application subsystems
data class PersonDTO(
    var title:String? = null,
    var job:String? = null,
    var image: Int? = null
)
