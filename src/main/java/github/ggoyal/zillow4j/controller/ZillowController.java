package github.ggoyal.zillow4j.controller;

import com.zillow._static.xsd.regionchildren.RegionchildrenResultType;
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
    @GetMapping("/GetRegionChildren")
    public RegionchildrenResultType.Response getRegionChildren(@RequestParam(value = "regionId", required = false) String regionId,
                                                               @RequestParam(value = "state", required = false) String state,
                                                               @RequestParam(value = "county", required = false) String county,
                                                               @RequestParam(value = "city", required = false) String city,
                                                               @RequestParam(value = "childtype", required = false) String childtype) {

        return zillowService.getRegionChildren(regionId, state, county, city, childtype);
    }
}
