package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.data.DegreeHistoryInput
import org.springframework.stereotype.Component

@Component
class AwardMutationResolver(
        private val awardDao: AwardDao
) : GraphQLMutationResolver {

    fun createAward(input: DegreeHistoryInput) =
            awardDao.createAward(input.title, input.date, input.awarder, input.summary)
}