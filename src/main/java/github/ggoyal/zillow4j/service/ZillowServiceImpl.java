package github.ggoyal.zillow4j.service;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZillowServiceImpl implements ZillowService {
//X1-ZWz18buiybkn4b_a6mew

    //http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=X1-ZWz18buiybkn4b_a6mew&state=wa&city=seattle&childtype=neighborhood


    private final static String GET_REGION_CHILDREN_URL = "http://www.zillow.com/webservice/GetRegionChildren.htm";
    //  private final static String GET_REGION_CHILDREN_URL = "http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=X1-ZWz18buiybkn4b_a6mew&state=wa&city=seattle&childtype=neighborhood";
    @Value("${zillow4j.zws-id}")
    private String zwsId;

    @Override
    public RegionchildrenResultType.Response getRegionChildren(String regionId, String state, String county, String city, String childType) {
        //   At least regionId or state is required
        regionId = StringUtils.trimToNull(regionId);
        state = StringUtils.trimToNull(state);

        if (regionId == null && state == null)
            throw new IllegalArgumentException("At least regionId or state is required");

        county = StringUtils.trimToNull(county);
        city = StringUtils.trimToNull(city);
        childType = StringUtils.trimToNull(childType);

        RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> params = new HashMap<>();
//        if (regionId != null)
//            params.put("regionId", regionId);
//        if (state != null)
//            params.put("state", state);
//        if (county != null)
//            params.put("county", county);
//        if (city != null)
//            params.put("city", city);
//        if (childType != null)
//            params.put("childtype", childType);
//        if (childType != null)
//            params.put("zws-id", zwsId);

        StringBuilder url = new StringBuilder(GET_REGION_CHILDREN_URL);
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
}
