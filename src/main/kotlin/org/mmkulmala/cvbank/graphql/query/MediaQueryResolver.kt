package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.LocationDao
import org.mmkulmala.cvbank.dao.MediaDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class MediaQueryResolver(
        private val mediaDao: MediaDao
): GraphQLQueryResolver {
    fun media(id: String) = mediaDao.getMediaById(id)
}