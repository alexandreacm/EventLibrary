#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(Eventlibrary, NSObject)

RCT_EXTERN_METHOD(onMyEvent:(NSString)appName
                 withResolver:(RCTPromiseResolveBlock)resolve
                 withRejecter:(RCTPromiseRejectBlock)reject)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
