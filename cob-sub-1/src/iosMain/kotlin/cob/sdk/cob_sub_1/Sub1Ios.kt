/*
 * Enggano Platform
 * Copyright (c) 2022 - Mitra Informatika, PT
 * Created by Enggano Team's (MAN)
 * Surabaya, Indonesia
 */


package cob.sdk.cob_sub_1

import cob.sdk.cob_core.*

fun sub1IosMethod() {
    // `expect` class from core `commonMain`
    CoreCommonExpectClass().classExpectMethod()

    // just regular interface from core `commonMain`
    object: CoreCommonInterface {
        override fun interfaceMethod() {
            println("This is interface from core `commonMain` module being called from sub1 `iosMain` module")
        }
    }

    // regular interface from `iosMain` with supertype from `commonMain`
    object: CoreIosInterface {
        override fun interfaceMethod() {
            println("This is interface from core `iosMain` module with `commonMain` supertype being called from sub1 `iosMain` module")
        }
    }

    // regular typealias from `iosMain` with supertype from `commonMain`
    object: CoreIosTypeAlias {
        override fun interfaceMethod() {
            println("This is typealias from core `iosMain` module with `commonMain` supertype being called from sub1 `iosMain` module")
        }
    }

    // regular class from `iosMain` with supertype from `commonMain`
    CoreIosChildClass().classOpenMethod()

    // regular class from `iosMain`
    CoreIosClass().classMethod()
}