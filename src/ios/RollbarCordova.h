
#import <Cordova/CDV.h>

@interface RollbarCordova : CDVPlugin

- (void)sendJsonPayload:(CDVInvokedUrlCommand*)command;

@end
