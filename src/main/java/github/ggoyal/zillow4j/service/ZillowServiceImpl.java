package github.ggoyal.zillow4j.service;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;
import com.zillow._static.xsd.searchresults.Searchresults;
import com.zillow._static.xsd.zestimate.ZestimateResultType;
import com.zillow._static.xsd.zillowtypes.DetailedProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

import static org.apache.commons.lang3.StringUtils.trimToNull;

@Service
public class ZillowServiceImpl implements ZillowService {

    //http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=X1-ZWz18buiybkn4b_a6mew&state=wa&city=seattle&childtype=neighborhood

    private final static String REGION_CHILDREN_URL = "http://www.zillow.com/webservice/GetRegionChildren.htm";
    private final static String COMPS_URL = "http://www.zillow.com/webservice/GetDeepComps.htm";
    private final static String ZESTIMATE_URL = "http://www.zillow.com/webservice/GetZestimate.htm";
    private final static String SEARCH_RESULTS = "https://www.zillow.com/webservice/GetSearchResults.htm";

    @Value("${zillow4j.zws-id}")
    private String zwsId;
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public RegionchildrenResultType.Response getRegionChildren(String regionId, String state, String county, String city, String childType) {
        //   At least regionId or state is required
        regionId = trimToNull(regionId);
        state = trimToNull(state);

        if (regionId == null && state == null)
            throw new IllegalArgumentException("At least regionId or state is required");

        county = trimToNull(county);
        city = trimToNull(city);
        childType = trimToNull(childType);


        StringBuilder url = new StringBuilder(REGION_CHILDREN_URL);
        url.append("?zws-id=").append(zwsId);
        if (regionId != null)
            url.append("&regionId=").append(regionId);
        if (state != null)
            url.append("&state=").append(state);
        if (county != null)
            url.append("&county=").append(county);
        if (city != null)
            url.append("&city=").append(city);
        if (childType != null)
            url.append("&childtype=").append(childType);


        RegionchildrenResultType response = restTemplate.getForObject(url.toString(),
                RegionchildrenResultType.class);

        return response.getResponse();
    }

    @Override
    public DetailedProperty getZestimate(Integer zpid, Boolean rentzestimate) {

        if (zpid == null)
            throw new IllegalArgumentException("At least zpid is required");
        if (rentzestimate == null)
            rentzestimate = false;

        StringBuilder url = new StringBuilder(ZESTIMATE_URL);
        url.append("?zws-id=").append(zwsId);
        url.append("&zpid=").append(zpid);
        url.append("&rentzestimate=").append(rentzestimate);

        ZestimateResultType response = restTemplate.getForObject(url.toString(), ZestimateResultType.class);

        return response.getResponse();
    }

    @Override
    public Searchresults.Response getSearchResult(String address, String citystatezip, Boolean rentzestimate) {

        address = trimToNull(address);
        citystatezip = trimToNull(citystatezip);

        if (address == null || citystatezip == null) {

            throw new IllegalArgumentException("at least address or citystatezip is required");

        }

        if (citystatezip != null)
            citystatezip = URLEncoder.encode(citystatezip);
        if (address != null)
            address = URLEncoder.encode(address);
        if (rentzestimate == null)
            rentzestimate = false;

        StringBuilder url = new StringBuilder(SEARCH_RESULTS);
        url.append("?zws-id=").append(zwsId);
        if (address != null)
            url.append("&address=").append(address);
        if (citystatezip != null)
            url.append("&citystatezip=").append(citystatezip);
        url.append("&rentzestimate=").append(rentzestimate);

        Searchresults response = restTemplate.getForObject(url.toString(), Searchresults.class);
        return response.getResponse();


    }

}
