package ru.netology.data

import ru.netology.domain.Model
import ru.netology.domain.Repo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepoImpl @Inject constructor() : Repo{
    override fun getData(): Model {
        return Model("Hello MTF!!!")
    }
}