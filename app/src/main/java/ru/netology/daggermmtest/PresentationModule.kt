package ru.netology.daggermmtest

import dagger.Module
import ru.netology.presentation.PresentationComponent

@Module(
    subcomponents = [PresentationComponent::class]
)
interface PresentationModule