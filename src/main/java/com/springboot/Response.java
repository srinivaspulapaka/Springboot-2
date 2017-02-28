package com.springboot;


import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private T content;
    private String message;
   /* private List<String> fieldStatus;
    private T fieldValue;*/
    private String code;
    private HttpStatus httpStatus;

    public Response() {
    }

    public Response(String code, String message, HttpStatus httpStatus) {
        this.message = message;
        this.code = code;

        this.httpStatus = httpStatus;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setStatus(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();

        this.httpStatus = statusCode.getHttpStatus();
    }

    public String getMessage() {
        return message;
    }

  /*  public List<String> getFieldStatus() {
        return fieldStatus;
    }
*/
    public String getCode() {
        return code;
    }

   // @JsonIgnore
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

   /* public void addMessage(String message) {
        if (fieldStatus == null) {
            fieldStatus = new ArrayList<>();
        }
        fieldStatus.add(message);
    }

    public T getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(T fieldValue) {
        this.fieldValue = fieldValue;
    }
*/
    @Override
    public String toString() {
        return "Response{" +
            "content=" + content +
            ", message='" + message + '\'' +
           /* ", fieldStatus=" + fieldStatus +
            ", fieldValue=" + fieldValue +*/
            ", code='" + code + '\'' +
            ", httpStatus=" + httpStatus +
            '}';
    }
}
