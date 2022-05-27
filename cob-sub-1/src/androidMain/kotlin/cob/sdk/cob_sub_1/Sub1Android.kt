/*
 * Enggano Platform
 * Copyright (c) 2022 - Mitra Informatika, PT
 * Created by Enggano Team's (MAN)
 * Surabaya, Indonesia
 */


package cob.sdk.cob_sub_1

import cob.sdk.cob_core.*

fun sub1AndroidMethod() {
    // `expect` class from core `commonMain`
    CoreCommonExpectClass().classExpectMethod()

    // regular interface from core `commonMain`
    (object: CoreCommonInterface {
        override fun interfaceMethod() {
            println("This is interface from core `commonMain` module being called from sub1 `androidMain` module")
        }
    }).interfaceMethod()

    // regular interface from `androidMain` with supertype from `commonMain`
    (object: CoreAndroidInterface {
        override fun interfaceMethod() {
            println("This is interface from core `androidMain` module with `commonMain` supertype being called from sub1 `androidMain` module")
        }
    }).interfaceMethod()

    // regular typealias from `androidMain` with supertype from `commonMain`
    (object: CoreAndroidTypeAlias {
        override fun interfaceMethod() {
            println("This is typealias from core `androidMain` module with `commonMain` supertype being called from sub1 `androidMain` module")
        }
    }).interfaceMethod()

    // regular class from `androidMain` with supertype from `commonMain`
    CoreAndroidChildClass().classOpenMethod()

    // regular class from `androidMain`
    CoreAndroidClass().classMethod()
}


fun main() {
    sub1AndroidMethod()
}