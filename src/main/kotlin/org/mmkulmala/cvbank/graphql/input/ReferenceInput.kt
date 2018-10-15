package fi.phz.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */

data class ReferenceInput(
        val name: String,
        val flavor: String,
        val private: Boolean,
        val contact: List<ReferenceContactInput>
)