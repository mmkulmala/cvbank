package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.data.*
import fi.phz.cvbank.repository.LocationRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LocationDao(
        private val locationRepository: LocationRepository
) {
    fun getLocationById(id: String) = locationRepository.findById(id)

    fun createLocation(address: String, postalCode: String, city: String,
                       countryCode: String, region: String) =
            locationRepository.save(Location(address = address, postalCode = postalCode, city = city,
                    countryCode = countryCode, region = region))

}