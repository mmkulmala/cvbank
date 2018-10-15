package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.data.*
import org.springframework.stereotype.Component

@Component
class BasicsMutationResolver(
        private val basicsDao: BasicsDao
) : GraphQLMutationResolver {
    fun createBasics(input: ContactInput) =
            basicsDao.createBasics(input.name, input.label, input.picture,
                    input.email, input.phone, input.website, input.summary,
                    Location(address = input.location.address, postalCode = input.location.postalCode, city = input.location.city,
                            countryCode = input.location.countryCode, region = input.location.region),
                    input.profiles.map { Sample(network = it.network, username = it.username, url = it.url) })
}