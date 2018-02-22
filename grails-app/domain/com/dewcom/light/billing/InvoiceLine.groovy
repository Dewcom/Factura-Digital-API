package com.dewcom.light.billing

import com.dewcom.light.utils.Constants

/**
 * Created by chen on 16/01/17.
 */
class InvoiceLine {
    Invoice invoice
    Service product
    Integer quantity
    Double subTotal
    Double total
    Byte enabled = Constants.ESTADO_ACTIVO

    static belongsTo = [Invoice]
    static constraints = {
    }
}
