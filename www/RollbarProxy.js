var exec = require('cordova/exec');

var RollbarProxy = function() {};

RollbarProxy.prototype.send = function(json, success, error) {
    exec(success, error, 'RollbarPlugin', 'send', [json]);
}

if (typeof module != 'undefined' && module.exports) {
    module.exports = RollbarProxy;
}
