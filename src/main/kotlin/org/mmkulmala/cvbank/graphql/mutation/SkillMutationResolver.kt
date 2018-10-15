package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.SkillsInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class SkillMutationResolver(
        private val skillDao: SkillDao
) : GraphQLMutationResolver {
    fun createSkill(input: SkillsInput) =
            skillDao.createSkill(input.name, input.level, input.keywords)

}