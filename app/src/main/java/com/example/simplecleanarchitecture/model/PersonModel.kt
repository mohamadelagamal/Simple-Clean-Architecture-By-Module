//package com.example.simplecleanarchitecture.model
//
//import com.example.simplecleanarchitecture.repository.PersonDataSource
//import com.example.simplecleanarchitecture.repository.PersonDataSourceImplementation
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//
//@Module
//@InstallIn(SingletonComponent::class)
//object PersonModel {
//
//    @Provides
//    @Singleton
//    fun providePerson():PersonDataSource{
//        return PersonDataSourceImplementation()
//    }
//
//}