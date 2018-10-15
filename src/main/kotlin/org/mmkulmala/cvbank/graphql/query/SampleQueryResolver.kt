package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.mmkulmala.cvbank.dao.SampleDao
 import org.mmkulmala.cvbank.dao.SetDao
 import org.mmkulmala.cvbank.dao.SkillDao
 import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SampleQueryResolver(
        private val sampleDao: SampleDao
): GraphQLQueryResolver {
    fun sample(id: String) = sampleDao.getSampleById(id)
}