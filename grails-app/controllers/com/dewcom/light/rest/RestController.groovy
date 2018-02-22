package com.dewcom.light.rest

import com.dewcom.light.utils.Constants
import grails.converters.JSON
import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import org.springframework.validation.Errors
import org.springframework.validation.FieldError

import java.lang.reflect.UndeclaredThrowableException

class RestController {

    protected void handleRESTExceptions(def messageSource, Exception e) {
      /*  log.error("Error en llamada REST")
        ResponseREST tmpResponse = new ResponseREST()

        if (e instanceof UndeclaredThrowableException) {
            e = e.getUndeclaredThrowable()
        }

        tmpResponse.message = e.message
        tmpResponse.code = Constants.ERROR_UNDECLARED_EXCEPTION

        log.info "=======Response con errores======="
        log.info tmpResponse as JSON
        render tmpResponse as JSON*/
    }

    protected void handleDataErrorsREST(def messageSource, Errors errors) {
    /*    FieldError fieldError = errors.fieldError
        JSONObject errorObj = new JSONObject()
        ResponseREST respTemporal = new ResponseREST()

        if (fieldError) {

            JSONArray tpmErrorList = new JSONArray()

            for (error in errors.allErrors) {

                FieldErrorREST errorCampoREST = new FieldErrorREST()
                errorCampoREST.errorCode = getValidationErrorCode(error.code)
                errorCampoREST.message = error.defaultMessage
                errorCampoREST.field = error.field

                tpmErrorList.put(errorCampoREST)
            }

            errorObj.put("errors", tpmErrorList)

            respTemporal.code = Constants.ERROR_VALIDACION_DE_CAMPOS
            respTemporal.message = messageSource.getMessage("default.general.validation.error", null, Locale.default)
            respTemporal.data = errorObj
            render respTemporal as JSON

        } else {
            respTemporal.code = Constants.ERROR_RESPONSE_CON_ERRORES
            respTemporal.message = messageSource.getMessage("rest.error.response.con.errores", null, Locale.default)
            respTemporal.data = errors.allErrors[0]
            log.error "Error verificando entidad : " + respTemporal.data
            log.info "=======Response con errores======="
            log.info respTemporal as JSON
            render respTemporal as JSON
        }*/
    }
}