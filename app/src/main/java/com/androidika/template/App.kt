package com.androidika.template

import android.app.Activity
import android.support.multidex.MultiDexApplication
import com.androidika.template.di.ApplicationModule
import com.androidika.template.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : MultiDexApplication(), HasActivityInjector {


    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity> = activityInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
                .inject(this)
    }
}
