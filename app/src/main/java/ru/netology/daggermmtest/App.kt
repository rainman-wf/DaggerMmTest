package ru.netology.daggermmtest

import android.app.Application
import android.util.Log
import ru.netology.presentation.PresentationComponent
import ru.netology.presentation.PresentationComponentProvider

class App : Application(), PresentationComponentProvider {

    val daggerComponent = DaggerAppComponent.create()

    override fun providePresentationComponent(): PresentationComponent {
        return daggerComponent.presentationComponentBuilder.build()
    }
}