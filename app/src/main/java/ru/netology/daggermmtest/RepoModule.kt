package ru.netology.daggermmtest

import dagger.Binds
import dagger.Module
import ru.netology.data.RepoImpl
import ru.netology.domain.Repo
import javax.inject.Singleton

@Module
interface RepoModule {

    @Binds
    @Singleton
    fun bindRepo(impl: RepoImpl) : Repo
}