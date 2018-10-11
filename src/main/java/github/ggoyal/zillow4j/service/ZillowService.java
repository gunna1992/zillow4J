package github.ggoyal.zillow4j.service;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;
import com.zillow._static.xsd.zillowtypes.DetailedProperty;

public interface ZillowService {

    /**
     * @param regionId  The regionId of the region to retrieve subregions from.
     * @param state     The state of the region to retrieve subregions from.
     * @param country   The county of the region to retrieve subregions from.
     * @param city      The city of the region to retrieve subregions from.
     * @param childType The type of subregions to retrieve (available types: state, county, city, zipcode, and neighborhood).
     * @return
     */

    //
    RegionchildrenResultType.Response getRegionChildren(String regionId, String state, String country, String city, String childType);


    /**
     * For a specified Zillow property identifier (zpid), the GetZestimate API returns:
     * <p>
     * The most recent property Zestimate
     * <p>
     * The date the Zestimate was computed
     * <p>
     * The valuation range
     * <p>
     * The Zestimate ranking within the property's ZIP code.
     * <p>
     * The full property address and geographic location (latitude/longitude) and a set of identifiers that uniquely represent the region (ZIP code, city, county & state) in which the property exists.
     * <p>
     * The GetZestimate API will only surface properties for which a Zestimate exists. If a request is made for a property that has no Zestimate, an error code is returned. Zillow doesn't have Zestimates for all the homes in its database. For such properties, we do have tax assessment data, but that is not provided through the API. For more information, see our Zestimate coverage.
     * <p>
     * The GetZestimate Web Service is located at:
     * http://www.zillow.com/webservice/GetZestimate.html
     *
     * @param zpid          The Zillow Property ID for the property for which to obtain information. The parameter type is an integer.
     * @param rentzestimate Return Rent Zestimate information if available (boolean true/false, default: false)
     * @return
     */

    DetailedProperty getZestimate(Integer zpid, Boolean rentzestimate);

}
