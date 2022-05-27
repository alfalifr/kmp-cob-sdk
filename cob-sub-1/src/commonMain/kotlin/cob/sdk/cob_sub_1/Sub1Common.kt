/*
 * Enggano Platform
 * Copyright (c) 2022 - Mitra Informatika, PT
 * Created by Enggano Team's (MAN)
 * Surabaya, Indonesia
 */


package cob.sdk.cob_sub_1

import cob.sdk.cob_core.CoreCommonOpenClass
import cob.sdk.cob_core.CoreCommonExpectClass
import cob.sdk.cob_core.CoreCommonInterface

fun sub1CommonMethod() {
    // `expect` class from core `commonMain`
    CoreCommonExpectClass().classExpectMethod()

    // regular interface from core `commonMain`
    object: CoreCommonInterface {
        override fun interfaceMethod() {
            println("This is interface from core `commonMain` module being called from sub1 `androidMain` module")
        }
    }

    // regular class from core `commonMain`
    CoreCommonOpenClass().classOpenMethod()
}