package com.test_application.api

data class CurrentObject (
    val last_updated_epoch: Double,
    val last_updated : String,
    val temp_c : Double,
    val temp_f : Double,
    val is_day : Int,
    val  wind_mph: Double,
    val wind_kph: Double,
    val wind_degree: Double,
    val WNW: String,
    val pressure_mb: Double,
    val pressure_in: Double,
    val precip_mm: Double,
    val precip_in: Double,
    val humidity: Double,
    val cloud: Int,
    val feelslike_c: Double,
    val feelslike_f: Double,
    val vis_km: Double,
    val vis_miles: Double,
    val uv: Double,
    val gust_mph: Double,
    val gust_kph: Double,

)