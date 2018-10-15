package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.dao.EducationDao
import fi.phz.cvbank.data.EducationInput
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class EducationMutationResolver(
        private val educationDao: EducationDao
) : GraphQLMutationResolver {
    fun createEducation(input: EducationInput) =
            educationDao.createEducation(input.institution, input.area, input.studyType,
                    input.startDate, input.endDate, input.gpa, input.courses)

}