package com.androidika.template.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @PerApplication
    fun providesContext(): Context {
        return context
    }

}