package com.dewcom.light.billing


class Service {
   String description
   Double price

    static constraints = {
        description  blank: false, nullable: false
        price  nullable: false
    }
}
