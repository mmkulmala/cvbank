package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class SkillQueryResolver(
        private val skillDao: SkillDao
): GraphQLQueryResolver {
    fun skill(id: String) = skillDao.getSkillById(id)
}