package io.swagger.api;

import io.swagger.model.Challenge;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-26T16:01:14.232Z")

@Controller
public class ChallengeApiController implements ChallengeApi {

    private static final Logger log = LoggerFactory.getLogger(ChallengeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChallengeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Challenge>> findChallengeByCategory(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "beginner, intermediate, advanced") @Valid @RequestParam(value = "category", required = true) List<String> category) {
        String accept = request.getHeader("Accept");
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        if (accept != null && accept.contains("application/json")) {
            try {
                responseEntity = new ResponseEntity<List<Challenge>>(objectMapper.readValue("[ {  \"id\" : 1,  \"title\" : \"title\",  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  }}, {  \"id\" : 0,  \"title\" : \"title\",  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  }} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                responseEntity = new ResponseEntity<List<Challenge>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return responseEntity;
    }

    public ResponseEntity<List<Challenge>> findChallengeByTitle(@NotNull @ApiParam(value = "challenge title", required = true) @Valid @RequestParam(value = "title", required = true) String title) {
        String accept = request.getHeader("Accept");
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        if (accept != null && accept.contains("application/json")) {
            try {
                responseEntity = new ResponseEntity<List<Challenge>>(objectMapper.readValue("[ {  \"id\" : 0,  \"title\" : \"title\",  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  }}, {  \"id\" : 0,  \"title\" : \"title\",  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                responseEntity = new ResponseEntity<List<Challenge>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return responseEntity;
    }

}
