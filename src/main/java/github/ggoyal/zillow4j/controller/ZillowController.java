package github.ggoyal.zillow4j.controller;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;
import com.zillow._static.xsd.searchresults.Searchresults;
import com.zillow._static.xsd.zillowtypes.DetailedProperty;
import github.ggoyal.zillow4j.service.ZillowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ZillowController {

    @Autowired
    private ZillowService zillowService;

    @GetMapping
    public String echo() {

        return "hello";
    }

    //http://localhost:8080/api/GetRegionChildren?state=wa&city=seattle&childtype=neighborhood
    //http://www.zillow.com/webservice/GetComps.htm?zws-id=<ZWSID<&zpid=48749425&count=5
    @GetMapping("/regionChildren")
    public RegionchildrenResultType.Response getRegionChildren(@RequestParam(value = "regionId", required = false) String regionId,
                                                               @RequestParam(value = "state", required = false) String state,
                                                               @RequestParam(value = "county", required = false) String county,
                                                               @RequestParam(value = "city", required = false) String city,
                                                               @RequestParam(value = "childtype", required = false) String childtype) {

        return zillowService.getRegionChildren(regionId, state, county, city, childtype);
    }


    @GetMapping("/Zestimate")
    public DetailedProperty getZestimate(@RequestParam(value = "zpid") Integer zpid,
                                         @RequestParam(value = "rentzestimate", required = false) Boolean rentzestimate) {

        return zillowService.getZestimate(zpid, rentzestimate);
    }


    @GetMapping("/searchResults")
    public Searchresults.Response getSearchResult(@RequestParam(value = "address") String address,
                                                  @RequestParam(value = "citystatezip") String citystatezip,
                                                  @RequestParam(value = "rentzestimate", required = false) Boolean rentzestimate) {
        return zillowService.getSearchResult(address, citystatezip, rentzestimate);
    }
}
