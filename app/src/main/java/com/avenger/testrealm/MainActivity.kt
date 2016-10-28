package com.avenger.testrealm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.RealmConfiguration
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)

        Timber.d("RealmDBConfigMediator???")
//        val config = RealmConfiguration.Builder().name("test.realm")
//                                                 .schemaVersion(2L)
//                                                 .modules(RealmDBConfig())
//                                                 .deleteRealmIfMigrationNeeded()
//                                                 .build()
//        Realm.setDefaultConfiguration(config)
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            val ob = realm.createObject(TestRealm::class.java)
            ob.name = "John"
        }
    }
}
