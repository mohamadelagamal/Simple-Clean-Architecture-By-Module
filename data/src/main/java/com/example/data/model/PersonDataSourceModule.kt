package com.example.data.model

import android.content.Context
import com.example.data.repository.PersonDataSourceImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.domain.repository.PersonDataSource
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersonDataSourceModule {

    @Provides
    @Singleton
    fun providePersonDataSource( @ApplicationContext context:Context ): PersonDataSource {
        return PersonDataSourceImplementation() // replace with the actual implementation
    }

}