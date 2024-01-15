package com.test_application.api

data class LocationObject (
    val name: String,
    val region : String,
    val country : String,
    val lat : Double,
    val lon : Double,
    val tz_id : String,
    val localtime_epoch : Double,
    val localtime : String
)


