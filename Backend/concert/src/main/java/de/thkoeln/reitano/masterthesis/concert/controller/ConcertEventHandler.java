//package de.thkoeln.reitano.masterthesis.concert.controller;
//
//import de.thkoeln.reitano.masterthesis.concert.domain.Concert;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
//import org.springframework.data.rest.core.annotation.HandleBeforeLinkSave;
//import org.springframework.data.rest.core.annotation.HandleBeforeSave;
//import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
//import org.springframework.stereotype.Component;
//
//@Component
//@RepositoryEventHandler(Concert.class)
//public class ConcertEventHandler {
//
//  Logger logger = LoggerFactory.getLogger(ConcertEventHandler.class);
//
//  @HandleBeforeCreate
//  public void debugHandleBeforeCreate(Concert concert){
//    logger.info("HandleBeforeCreate");
//  }
//
//  @HandleBeforeLinkSave
//  public void debugHandleBeforeLinkSave(Concert concert){
//    logger.info("HandleBeforeLinkSave");
//  }
//
//  @HandleBeforeSave
//  public void logHandleBeforeSave(Concert concert){
//    logger.info("HandleBeforeSave");
//  }
//}
