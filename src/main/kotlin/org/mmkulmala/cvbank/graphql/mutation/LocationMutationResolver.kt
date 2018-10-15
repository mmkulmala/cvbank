package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.data.*
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LocationMutationResolver(
        private val locationDao: LocationDao
) : GraphQLMutationResolver {
    fun createLocation(input: LocationInput) =
            locationDao.createLocation(input.address, input.postalCode, input.city,
                    input.countryCode, input.region)

}