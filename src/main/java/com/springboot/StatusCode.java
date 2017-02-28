package com.springboot;

import org.springframework.http.HttpStatus;

/**
 * @author haribabu.ka on 14-10-2016.
 */
public enum StatusCode {

    // HTTP COMMON Error codes.
    U200("200", "Success", HttpStatus.OK),
    U202("202", "Invalid User", HttpStatus.OK),
    U203("202", "Invalid Cart Id", HttpStatus.OK),
    U204("202", "Invalid Order Id", HttpStatus.OK),
    U205("204", "No Content", HttpStatus.NO_CONTENT),
    U400("400", "Bad Request", HttpStatus.NOT_FOUND),
    U401("400", "Header is Empty", HttpStatus.NOT_FOUND),
    U402("400", "User Not Found In Database", HttpStatus.NOT_FOUND),
    U403("400", "User Not Logged in", HttpStatus.NOT_FOUND),
    U404("404", "Event Attributes of Broker Event is null", HttpStatus.NOT_FOUND),
    U405("405", "Audit Info of Broker Event is null", HttpStatus.NOT_FOUND),
    U406("406", "User Info not found in Broker Event", HttpStatus.NOT_FOUND),
    U407("407", "Header is Empty", HttpStatus.NOT_FOUND),
    U408("408", "Cart Id already exist for other user", HttpStatus.NOT_FOUND),

    E400("400", "Bad Request", HttpStatus.BAD_REQUEST),


    // Notification Error codes
    N401("400", "Bad Request - Not a valid DeliveryType: Supported formats :  EMAIL and MESSAGE .", HttpStatus.NOT_FOUND),



    C401("400", "Civic Address zipCode Invalid", HttpStatus.BAD_REQUEST),
    C402("400", "Postal Address zipCode Invalid", HttpStatus.BAD_REQUEST),
    C403("400", "Bad Request - Service and Shipping Address Empty", HttpStatus.NOT_FOUND),


    C406("502", "WSDL - Response is Null","Red", HttpStatus.BAD_GATEWAY),
    E401("101-1", "PostalAddressValidationRequest must exist","Red", HttpStatus.NOT_FOUND),
    E402("101-2", "PostalAddressValidationRequest clientId must exist","Red", HttpStatus.NOT_FOUND),
    E403("101-3", "PostalAddressValidationRequest clientId invalid","Red", HttpStatus.NOT_FOUND),
    E404("101-4", "PostalAddressValidationRequest input Address must exist","Red", HttpStatus.NOT_FOUND),
    E405("101-5", "InputAddress address Line1 must exist","Red", HttpStatus.NOT_FOUND),
    E406("101-6", "InputAddress address Line1: Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E407("101-7", "InputAddress address Line2: Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E408("101-8", "InputAddress locality and InputAddress state Or Province must exist","Red", HttpStatus.NOT_FOUND),
    E409("101-9", "InputAddress locality Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E4010("101-10", "InputAddress state Or Province Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E4011("101-11", "InputAddress postCode Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E4012("101-12", "InputAddress addressLine3 is reserved for future use","Red", HttpStatus.NOT_FOUND),
    E4013("101-13", "InputAddress country is reserved for future use","Red", HttpStatus.NOT_FOUND),
    E4014("101-14", "InputAddress country is reserved for future use","Red", HttpStatus.NOT_FOUND),
    E4015("400_15", "Exception Occured At Address Validation ", HttpStatus.SERVICE_UNAVAILABLE),
    E500("500", "Internal Server Error","Red", HttpStatus.INTERNAL_SERVER_ERROR),

    // Cart Service Codes
    E701("701", "Invalid Cart Id","Red", HttpStatus.BAD_REQUEST),
    E702("702", "Invalid Cart Event","Red", HttpStatus.BAD_REQUEST),
    E703("703", "Error in retrieving cart", HttpStatus.INTERNAL_SERVER_ERROR),
    E704("704", "Invalid Cart Event Type","Red", HttpStatus.BAD_REQUEST),
    E705("705", "Shopping Cart is Empty","Red", HttpStatus.BAD_GATEWAY),

    //Order Service Codes
    E800("800", "Order initialized successfully", HttpStatus.OK),
    E801("801", "Invalid Order Id/Cart is empty","Red", HttpStatus.NOT_FOUND),
    E802("802", "Invalid Order Event","Red", HttpStatus.NOT_FOUND),
    E803("803", "Error in retrieving Order", HttpStatus.INTERNAL_SERVER_ERROR),
    E804("804", "Order submitted successfully", HttpStatus.OK),
    E805("805", "Order rejected status updated successfully", HttpStatus.OK),
    E806("806", "Invalid Order Id","Red", HttpStatus.NOT_FOUND),
    E807("807", "Interfacing System Errors: Failures returend by interfacing systems (like OES, EM or BIGMAC). The interfacing system message and error code will be communicated in Message Detail ","Red", HttpStatus.FAILED_DEPENDENCY),
    E808("808", "Logical Errors: Failure to pass business validation rules in POIM, or rules to validate mandatory elements that may not be enforced in the schema definition ","Red", HttpStatus.NOT_FOUND),
    E809("809", "POIM Internal System Errors: Failure to process the XML message in POIM resulting in a system error, system timeouts. ","Red", HttpStatus.BAD_REQUEST),
    E810("810", "XML Validation Errors: Failure to receive a valid XML message from the calling system. ","Red", HttpStatus.BAD_REQUEST),
    E811("811", "Duplicate message received in POIM, perhaps caused by a previous timeout. ","Red", HttpStatus.BAD_REQUEST),
    E812("812", "POIM Internal System Errors: Failure to receive a successful response when invoking internal POIM services ","Red", HttpStatus.SERVICE_UNAVAILABLE),
    E813("813", "POIM Catastrophic Failure: Catastrophic failures in POIM like  queues are down. Such failures will also alarm in Sentry and the application AIP (production support). ","Red", HttpStatus.FAILED_DEPENDENCY),
    E814("814", "Error occurred while processing the POIM Order submission ","Red", HttpStatus.INTERNAL_SERVER_ERROR),
    E815("815", "Few fields were missing to process the POIM Order ","Red", HttpStatus.BAD_REQUEST),
    E816("816", "Error occurred while fetching the product info ", "Red", HttpStatus.OK),
    E817("817", "Shopping cart is empty ", "Red", HttpStatus.OK),
    E818("818", "Billing contact details are not provided ", "Red", HttpStatus.OK),
    E819("819", "Desired due date is missing in the service contact details ", "Red", HttpStatus.OK),
    E820("820", "Platform Create Order API failed to get TASK_ID and PROJECT_ID ", "Red", HttpStatus.OK),
    E821("821", "TASK_ID should not be empty in Platform Create Order API response ", "Red", HttpStatus.OK),
    E822("822", "PROJECT_ID should not be empty in Platform Create Order API response ", "Red", HttpStatus.OK),

    // sfaint service
    E901("901", "Invalid user","Red", HttpStatus.BAD_REQUEST),
    E906("906", "Create SF Account Service Failed","Red", HttpStatus.OK),
    E907("907", "Create Oppurtunity service Failed","Red", HttpStatus.OK),
    E908("908", "Credit Check service Failed","Red", HttpStatus.OK),
    E909("909", "Create Lead Service Failed","Red", HttpStatus.OK),

    E902("902", "Create SF Account Failed","Red", HttpStatus.OK),
    E903("903", "Created SF Account Successfully. But Create Oppurtunity Failed","Red", HttpStatus.OK),
    E904("904", "Created SF Account, Create Oppurtunity Successfully. But Credit Check Failed","Red", HttpStatus.OK),
    E905("905", "Created SF Account, Create Oppurtunity Successfully, Credit Check Failed and Create Lead Failed","Red", HttpStatus.OK),
    E910("910", "Contact us Create Lead Failed","Red", HttpStatus.OK),

    E911("911", "Create SF Account Successfully Completed","Green", HttpStatus.OK),
    E912("912", "Create Oppurtunity Successfully Completed","Green", HttpStatus.OK),
    E913("913", "Credit Check Successfully Completed","Green", HttpStatus.OK),
    E914("914", "Create Lead Successfully Completed","Green", HttpStatus.OK),
    E915("915", "Order to POIM Initiated Successfully","Green", HttpStatus.OK),
    E916("916", "Order to POIM Failed","red", HttpStatus.BAD_REQUEST),

    E917("917", "Customer lookup successful","Green", HttpStatus.OK),
    E918("918", "Customer lookup Failed","red", HttpStatus.OK),
    E920("920", "CreateSf Accont Process Failed ","red", HttpStatus.OK),
    E921("921", " ProcessOrder Failed ","red", HttpStatus.OK),
    E922("922", " Platform Create Order Failed ","red", HttpStatus.OK),

    //For Account
    E300("300_00", "Exception Occured At CreateEnterprise ", HttpStatus.SERVICE_UNAVAILABLE),
    E301("300_10", "CreateEnterprise Process Success", HttpStatus.OK),


    E302("300_20", "Exception Occured At BillingAccount Creation ", HttpStatus.SERVICE_UNAVAILABLE),
    E303("300_30"," BillingAccount Creation Success", HttpStatus.OK),

    E304("300_40", "Exception Occured At AssignAccountToEnterpriseWithLookUp Process", HttpStatus.BAD_REQUEST),
    E305("300_50", "AssignAccountToEnterprise Process Success ", HttpStatus.OK),

    E306("300_60", "Invalid OrderId", HttpStatus.BAD_REQUEST),
    E307("300_70", "No data For Given OrderId", HttpStatus.BAD_REQUEST),

    E308("300_80", "Exception Occured At CreateAccount Process", HttpStatus.BAD_REQUEST),
    E309("300_90", "CreateAccount Process Success", HttpStatus.OK),

    E310("300_11", "Enterprise Already Available Fot This OrderId", HttpStatus.OK),


    E312("300_12", "Exception Occured At GetAccount Process", HttpStatus.BAD_REQUEST),
    E313("300_13", "GetAccount Process Success", HttpStatus.OK),


    E314("300_14", "Invalid EnterPriseId", HttpStatus.BAD_REQUEST),
    E316("300_16", "Invalid CompanyName", HttpStatus.BAD_REQUEST),
    E317("300_17", "Invalid Email", HttpStatus.BAD_REQUEST),
    E318("300_18", "Invalid Name", HttpStatus.BAD_REQUEST),
    E319("300_19", "Invalid UserId", HttpStatus.BAD_REQUEST),
    E320("300_20", "Invalid UnitPrice", HttpStatus.BAD_REQUEST),
    E315("300_15", "Invalid Input", HttpStatus.BAD_REQUEST),
    E341("300_41", "InvalidEnterPriseId.Enterprise Id does not exist", HttpStatus.BAD_REQUEST),
    E322("300_22", "CreateAccount & AssignAccountToEnterpriseWithLookUp Procsses are Already Done ", HttpStatus.OK),
    E323("300_23", "CreateAccount  Procsses  Already Done for this OrderId ", HttpStatus.OK),
    E324("300_24", "CreateBillingAccount  Procsses Success.But Exception Occured At AssignAccountToEnterpriseWithLookUp Process", HttpStatus.OK);


    private HttpStatus httpStatus;
    private String code;
    private String message;
    private String colourCode;

    /**
     * StatusCode()  code,message, color, httpstatus argument constructor
     * @param code
     * @param message
     * @param colourCode
     * @param httpStatus
     */
    StatusCode(String code, String message, String colourCode, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.colourCode = colourCode;
        this.httpStatus = httpStatus;

    }

    /**
     * StatusCode()  code,message, httpstatus argument constructor
     * @param code
     * @param message
     * @param httpStatus
     */
    StatusCode(String code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.colourCode = colourCode;
        this.httpStatus = httpStatus;

    }

    /**
     * getCode()
     * @return code
     */

    public String getCode() {
        return code;
    }

    /**
     * getMessage() method
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * getHttpStatus()
     * @return httpStatus
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * getColourCode ()
     *
     * @return colourCode
     */
    public String getColourCode() { return colourCode; }
}
