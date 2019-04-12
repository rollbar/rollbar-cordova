
#import <Cordova/CDV.h>

@interface RollbarPlugin : CDVPlugin

- (void)send:(CDVInvokedUrlCommand*)command;

@end
