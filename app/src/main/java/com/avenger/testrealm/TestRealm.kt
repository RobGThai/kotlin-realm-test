package com.avenger.testrealm

import io.realm.RealmObject

open class TestRealm : RealmObject {
    var name: String

    constructor() {
        name = ""
    }

    constructor(name: String) {
        this.name = name
    }
}
