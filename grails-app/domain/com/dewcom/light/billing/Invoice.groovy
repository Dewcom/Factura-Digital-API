package com.dewcom.light.billing

import com.dewcom.light.thirdparty.Customer
import com.dewcom.light.user.User

class Invoice {
    String invoiceKey
    String invoiceConsecutive
    User user
    Date creationDate = new Date()
    Customer customer
    Double subTotalAmount
    Double totalAmount
    String invoiceXML

    static hasMany = [invoiceLines: InvoiceLine]
    static belongsTo = [Customer]

    static mapping = {
        invoiceLines cascade: "all-delete-orphan"
    }

    static constraints = {
        user  nullable: true
        creationDate  nullable: true
        customer  nullable: true
        subTotalAmount  nullable: true
        totalAmount nullable: true
        creationDate nullable: true
    }
}
