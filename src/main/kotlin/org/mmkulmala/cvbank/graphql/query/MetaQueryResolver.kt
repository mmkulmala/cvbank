package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.LocationDao
import org.mmkulmala.cvbank.dao.MediaDao
import org.mmkulmala.cvbank.dao.MetaDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class MetaQueryResolver(
        private val metaDao: MetaDao
): GraphQLQueryResolver {
    fun meta(id: String) = metaDao.getMetaById(id)
}