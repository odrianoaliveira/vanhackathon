package com.skipthedishes.vanhacsaopaulofair.interfaces.rest.cousine;

import com.skipthedishes.vanhacsaopaulofair.model.Cousine;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */


@Api(value = "CousineApi", description = "The Cousine Api")
public interface CousineApi {

    @ApiOperation(value = "", nickname = "getCousineByCousineIdStoresGet", notes = "", tags={ "Cousine", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "v1/Cousine/{cousineId}/stores",
            method = RequestMethod.GET)
    ResponseEntity<Cousine> getCousineByCousineIdStoresGet(@ApiParam(value = "", required = true) @PathVariable("cousineId") Long cousineId);


    @ApiOperation(value = "", nickname = "apiV1CousineGet", notes = "", tags={ "Cousine", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Cousine",
            method = RequestMethod.GET)
    ResponseEntity<Void> apiV1CousineGet();


    @ApiOperation(value = "", nickname = "apiV1CousineSearchBySearchTextGet", notes = "", tags={ "Cousine", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Cousine/search/{searchText}",
            method = RequestMethod.GET)
    ResponseEntity<Void> apiV1CousineSearchBySearchTextGet(@ApiParam(value = "", required = true) @PathVariable("searchText") String searchText);

}
