package ru.netology.presentation

import dagger.Subcomponent

@Subcomponent
interface PresentationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build() : PresentationComponent
    }
}