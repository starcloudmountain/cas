package org.apereo.cas.configuration.model.support.geo.maxmind;

import org.apereo.cas.configuration.support.RequiresModule;
import org.apereo.cas.configuration.support.RequiredProperty;
import org.springframework.core.io.Resource;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * This is {@link MaxmindProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-support-geolocation-maxmind")

@Getter
@Setter
public class MaxmindProperties implements Serializable {

    private static final long serialVersionUID = 7883029275219817797L;

    /**
     * Path to the location of the database file containing cities.
     */
    @RequiredProperty
    private transient Resource cityDatabase;

    /**
     * Path to the location of the database file containing countries.
     */
    @RequiredProperty
    private transient Resource countryDatabase;
}
