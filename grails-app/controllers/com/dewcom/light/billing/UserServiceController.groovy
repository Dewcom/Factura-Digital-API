package com.dewcom.light.billing

import com.dewcom.light.rest.RestController
import grails.plugin.springsecurity.annotation.Secured

class UserServiceController extends RestController{
    static allowedMethods = [get: "GET", create: "POST", update: "PUT", delete: "DELETE"]
    def messageSource
    def userServiceService

    /**
     * Este método se encarga de obtener una lista de productos o uno específico por medio del ID
     * @author Mauricio Fernández Mora
     */
    @Secured(['ROLE_ANONYMOUS'])
    def get() {

    }

    /**
     * Este método se encarga de crear un nuevo producto
     * @author Mauricio Fernández
     *
     */
    @Secured(['ROLE_ANONYMOUS'])
    def create() {
    }

    /**
     * Este método se encarga de borrar (Borrado lógico) un producto
     * @author Mauricio Fernández Mora
     * @param id
     */
    @Secured(['ROLE_ANONYMOUS'])
    def delete() {

    }

    /**
     * Este método se encarga de modificar un producto
     * @author Mauricio Fernández Mora
     */
    @Secured(['ROLE_ANONYMOUS'])
    def update() {

    }
}
