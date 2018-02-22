package com.dewcom.light.billing

import com.dewcom.light.rest.billing.BillRequest
import com.dewcom.light.rest.billing.UpdateBillRequest
import grails.transaction.Transactional

@Transactional
class UserServiceService {

    def messageSource
    def adminService

    Invoice getService(def billId) {

    }


    def getAllServices() {

    }


    def getAllServicesByCustomerId(def customerId) {

    }

    def createService(BillRequest argRestBill) {

    }

    def deleteService(Invoice bill) {

    }

    def updateService(UpdateBillRequest argUpdateBillRequest) {

    }
}

