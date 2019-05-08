var exec = require('cordova/exec');

var RollbarProxy = function() {};

RollbarProxy.prototype.sendJsonPayload = function(json, success, error) {
  exec(success, error, 'RollbarCordova', 'sendJsonPayload', [json]);
}

if (typeof module != 'undefined' && module.exports) {
  module.exports = RollbarProxy;
}
