package com.androidika.template.di

import com.androidika.template.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindings {


    @PerActivity
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity


}