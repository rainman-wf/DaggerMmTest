package ru.netology.daggermmtest

import dagger.Component
import ru.netology.presentation.PresentationComponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RepoModule::class,
        PresentationModule::class
    ]
)
interface AppComponent {

    val presentationComponentBuilder: PresentationComponent.Builder
}