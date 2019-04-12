#import "RollbarPlugin.h"
#import <Cordova/CDV.h>
#import <Rollbar/Rollbar.h>

@implementation RollbarPlugin

- (void)pluginInitialize {
    NSString* token = [self.commandDelegate.settings objectForKey:[@"RollbarClientToken" lowercaseString]];
    [Rollbar initWithAccessToken:token];
}

- (void)send:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* json = [command.arguments objectAtIndex:0];
    NSData* data = [json dataUsingEncoding:NSUTF8StringEncoding];

    [Rollbar send:data];

    if (json != nil && [json length] > 0) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"Sent OK"];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
