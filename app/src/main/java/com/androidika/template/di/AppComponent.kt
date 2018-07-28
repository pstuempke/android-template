package com.androidika.template.di

import com.androidika.template.App
import dagger.Component

@PerApplication
@Component(modules = [ApplicationModule::class, ActivityBindings::class])
interface AppComponent {

    fun inject(app : App)
}