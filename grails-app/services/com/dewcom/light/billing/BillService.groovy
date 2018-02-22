package com.dewcom.light.billing

import com.dewcom.light.rest.billing.BillRequest
import com.dewcom.light.rest.billing.UpdateBillRequest
import grails.transaction.Transactional

@Transactional
class BillService {

    def messageSource
    def adminService

    Invoice getBill(def billId) {

    }


    def getAllBills() {

    }


    def getAllBillsByCustomerId(def customerId) {

    }

    def createBill(BillRequest argRestBill) {

    }

    def deleteBill(Invoice bill) {

    }

    def updateBill(UpdateBillRequest argUpdateBillRequest) {

    }
}

