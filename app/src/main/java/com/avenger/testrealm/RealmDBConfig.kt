package com.avenger.testrealm

import io.realm.annotations.RealmModule

@RealmModule(classes = arrayOf(TestRealm::class))
open class RealmDBConfig {

}