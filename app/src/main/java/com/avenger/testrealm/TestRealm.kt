package com.avenger.testrealm

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class TestRealm : RealmObject {
    var name: String

    constructor() {
        name = ""
    }

    constructor(name: String) {
        this.name = name
    }
}
