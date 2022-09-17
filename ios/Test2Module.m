//
//  Test2Module.m
//  IPTSoftphone
//
//  Created by work_jic on 2022/09/16.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>
#import <React/RCTEventEmitter.h>

@interface RCT_EXTERN_MODULE(Clock, RCTEventEmitter)
RCT_EXTERN_METHOD(
                  getCurrentTime:(RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject
                  )
RCT_EXTERN_METHOD(dispatchEventEverySecond)
@end
