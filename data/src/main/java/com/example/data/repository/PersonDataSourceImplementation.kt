package com.example.data.repository

import com.example.data.R
import com.example.domain.model.PersonDTO
import com.example.domain.repository.PersonDataSource
import javax.inject.Inject


class PersonDataSourceImplementation @Inject constructor(): PersonDataSource {
    override fun getPersonList(): MutableList<PersonDTO> {
        val personList= mutableListOf<PersonDTO>()
        personList.add(PersonDTO("Ahmed","Developer", R.drawable.photo))
        personList.add(PersonDTO("Mohamed","Designer", R.drawable.photo))
        personList.add(PersonDTO("Ali","Manager", R.drawable.photo))
        personList.add(PersonDTO("Sara","HR", R.drawable.image))
        personList.add(PersonDTO("Nada","Accountant", R.drawable.image))
        personList.add(PersonDTO("Ahmed","Developer", R.drawable.photo))
        personList.add(PersonDTO("Mohamed","Designer", R.drawable.photo))
        personList.add(PersonDTO("Ali","Manager", R.drawable.photo))
        personList.add(PersonDTO("Sara","HR", R.drawable.image))
        personList.add(PersonDTO("Nada","Accountant", R.drawable.image))
        personList.add(PersonDTO("Ahmed","Developer", R.drawable.photo))
        personList.add(PersonDTO("Mohamed","Designer", R.drawable.photo))
        personList.add(PersonDTO("Ali","Manager", R.drawable.photo))
        personList.add(PersonDTO("Sara","HR", R.drawable.image))
        personList.add(PersonDTO("Nada","Accountant", R.drawable.image))
        return personList
    }

}