package com.dewcom.light.billing

import com.dewcom.light.utils.Constants
import com.dewcom.light.utils.JSONMapper
import com.dewcom.light.rest.RestController
import com.dewcom.light.rest.billing.BillRequest
import com.dewcom.light.rest.ResponseREST
import com.dewcom.light.rest.billing.UpdateBillRequest
import grails.plugin.springsecurity.annotation.Secured
import grails.converters.*

class InvoiceController extends RestController {
    static allowedMethods = [get: "GET", create: "POST", update: "PUT", delete: "DELETE"]
    def messageSource
    def invoiceService

    /**
     * Este método se encarga de obtener una lista de facturas o una especifico por medio del ID
     * @author Leonardo Chen
     */
    @Secured(['ROLE_ANONYMOUS'])
    def get() {

    }


    def getBillsByCustomerId() {

    }

    /**
     * Este método se encarga de crear una factura
     * @author Leonardo Chen
     * @param name
     */
    @Secured(['ROLE_ANONYMOUS'])
    def create() {

    }

    /**
     * Este método se encarga de borrar (Borrado lógico) un contacto
     * @author Leonardo Chen
     * @param id
     */
    @Secured(['ROLE_ANONYMOUS'])
    def delete() {
    }


    /**
     * Este método se encarga de modificar una factura
     * @author Leonardo Chen
     * @param name
     */
    @Secured(['ROLE_ANONYMOUS'])
    def update() {
    }
}
