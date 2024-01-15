package com.test_application.model

import com.test_application.api.CurrentObject
import com.test_application.api.LocationObject

data class Location(
    val location: LocationObject,
    val current: CurrentObject
)