package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.LocationRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LocationDao(
        private val locationRepository: LocationRepository
) {
    fun getLocationById(id: String) = locationRepository.findById(id)

    fun createLocation(address: String, city: String, region: String, code: String, countryCode: String) =
            locationRepository.save(Location(address = address, city = city, region = region,
                    code = code, countryCode = countryCode))

}