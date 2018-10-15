package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.mmkulmala.cvbank.dao.SkillDao
 import org.mmkulmala.cvbank.dao.SkillsDao
 import org.mmkulmala.cvbank.dao.SocialDao
 import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SocialQueryResolver(
        private val socialDao: SocialDao
): GraphQLQueryResolver {
    fun social(id: String) = socialDao.getSocialById(id)
}