package com.dewcom.light.admin

import com.dewcom.light.rest.thirdparty.UpdateAgentTypeRequest
import com.dewcom.light.utils.Constants
import com.dewcom.light.exception.LightRuntimeException

import com.dewcom.light.configuration.Configuration

import com.dewcom.light.rest.thirdparty.UpdateCustomerTypeRequest
import com.dewcom.light.rest.thirdparty.UpdateIdentificationTypeRequest
import com.dewcom.light.rest.warehouse.UpdatePresentationTypeRequest
import com.dewcom.light.rest.warehouse.UpdateProductTypeRequest

import com.dewcom.light.thirdparty.CustomerType
import com.dewcom.light.thirdparty.IdentificationType
import grails.transaction.Transactional

@Transactional
class AdminService {
    //Identification type
    def messageSource

    IdentificationType getIdentificationType(def pid) {
        log.info "====== Getting identification type from DB ======"
        log.info pid
        try{
            IdentificationType idTypeFromDB = IdentificationType.findByIdAndEnabled(pid, Constants.ESTADO_ACTIVO);
            return idTypeFromDB
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.identification.type.error", null, Locale.default));
        }
    }

    List<IdentificationType> getAllIdentificationTypes() {
        log.info "====== Getting all identification types from DB ======"
        try{
            def idTypesFromDB = IdentificationType.findAllByEnabled(Constants.ESTADO_ACTIVO);
            return idTypesFromDB
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.all.identification.types.error", null, Locale.default));
        }
    }

    def createIdType(IdentificationType pidentificationType) {
        try{
            pidentificationType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("create.identification.type.error", null, Locale.default));
        }
    }

    def deleteIdType(IdentificationType pidentificationType) {
        try{
            pidentificationType.enabled = Constants.ESTADO_INACTIVO;
            pidentificationType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("delete.identification.type.error", null, Locale.default));
        }
    }

    def updateIdType(IdentificationType pidentificationType, UpdateIdentificationTypeRequest pupdateIdentificationTypeREST) {
        try{
            pidentificationType.name = pupdateIdentificationTypeREST.name;
            pidentificationType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("update.identification.type.error", null, Locale.default));
        }
    }


    //Customer type

    CustomerType getCustomerType(def pid) {
        log.info "====== Getting customer type from DB ======"
        log.info pid
        try{
            CustomerType customerTypeFromDB = CustomerType.findByIdAndEnabled(pid, Constants.ESTADO_ACTIVO);
            return customerTypeFromDB
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.customer.type.error", null, Locale.default));
        }
    }

    def getAllCustomerTypes() {
        log.info "====== Getting all customer types from DB ======"
        try{
            def customerTypesFromDB = CustomerType.findAllByEnabled(Constants.ESTADO_ACTIVO);
            return customerTypesFromDB
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.all.customer.types.error", null, Locale.default));
        }
    }

    def createCustomerType(CustomerType pcustomerType) {
        try{
            pcustomerType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("create.customer.type.error", null, Locale.default));
        }
    }

    def deleteCustomerType(CustomerType pcustomerType) {
        try{
            pcustomerType.enabled = Constants.ESTADO_INACTIVO;
            pcustomerType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("delete.customer.type.error", null, Locale.default));
        }
    }

    def updateCustomerType(CustomerType pcustomerType, UpdateCustomerTypeRequest pupdateCustomerTypeREST) {
        try{
            pcustomerType.name = pupdateCustomerTypeREST.name;
            pcustomerType.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("update.customer.type.error", null, Locale.default));
        }
    }

    //configurations
    def Configuration createConfiguration(Configuration argConfiguration) {
        def config
        try {
            config = argConfiguration.save(flush: true, failOnError:true)
        } catch (Exception e) {
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("create.configuration.error", null, Locale.default));
        }
        return config
    }

    def deleteConfiguration(Configuration argConfiguration) {
        try {
            argConfiguration.enabled = Constants.ESTADO_INACTIVO;
            argConfiguration.save(flush: true, failOnError:true)
        } catch (Exception e) {
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("delete.configuration.error", null, Locale.default));
        }
    }


        def getConfiguration(def argConfigId) {
        log.info "====== Getting configuration from db ======"
        log.info argConfigId
        try{
            Configuration config = Configuration.findById(argConfigId);
            return config
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.configuration.error", null, Locale.default));
        }
    }

    def getAllConfigurations() {
        log.info "====== Getting all configurations  from DB ======"
        try{
            def customerTypesFromDB = Configuration.findAllByEnabled(Constants.ESTADO_ACTIVO);
            return customerTypesFromDB
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("get.all.configurations.error", null, Locale.default));
        }
    }

    def updateConfiguration(Configuration argConfiguration) {
        try{
            argConfiguration.save(flush: true, failOnError:true)
        }catch(Exception e){
            log.error(e);
            throw new LightRuntimeException(messageSource.getMessage("update.configuration.error", null, Locale.default));
        }
    }
}
