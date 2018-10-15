package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.mmkulmala.cvbank.dao.SkillDao
 import org.mmkulmala.cvbank.dao.SkillsDao
 import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SkillsQueryResolver(
        private val skillsDao: SkillsDao
): GraphQLQueryResolver {
    fun skills(id: String) = skillsDao.getSkillsById(id)
}