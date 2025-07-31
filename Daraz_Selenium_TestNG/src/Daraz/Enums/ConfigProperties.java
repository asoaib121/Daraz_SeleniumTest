package Daraz.Enums;

/**
 * Enums to restrict the values used on Property files. Without using enums there can be null pointer exceptions happy.
 * because of typos.
 * <p>
 * Whenever a new value is added to property file, corresponding enum should be created here.
 *
 * <pre>
 *     <b>
 *         <a href="https://www.youtube.com/channel.UC6PTXUHb6j40xf0ccdRI11A">Testing Mini Bytes Youtube channel</a>
 *     </b>
 * </pre>
 *
 * Jan 21, 2021
 * @author Amuthan Sakthivel
 * @version 1.0
 * @since 1.0
 * @see Daraz.utils.PropertyUtils
 */

public enum ConfigProperties {
    URL,
    OVERRIDEREPORTS,
    PASSEDSTEPSSCREENSHOTS,
    FAILEDSTEPSSCREENSHOTS,
    SKIPEDSTEPSSCREENSHOTS,
    RETRYFAILEDTESTS,
    RUNMODE,
    BROWSER;

}
