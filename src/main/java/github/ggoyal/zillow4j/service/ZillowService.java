package github.ggoyal.zillow4j.service;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;

public interface ZillowService {

    /**
     * @param regionId  The regionId of the region to retrieve subregions from.
     * @param state     The state of the region to retrieve subregions from.
     * @param country   The county of the region to retrieve subregions from.
     * @param city      The city of the region to retrieve subregions from.
     * @param childType The type of subregions to retrieve (available types: state, county, city, zipcode, and neighborhood).
     * @return
     */
    RegionchildrenResultType.Response getRegionChildren(String regionId, String state, String country, String city, String childType);
}
