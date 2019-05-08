package com.rollbar.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import android.content.Context;
import com.rollbar.android.Rollbar;

public class RollbarCordova extends CordovaPlugin {
    private Rollbar rollbar;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Context context = this.cordova.getActivity().getApplicationContext();

        rollbar = Rollbar.init(context);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("sendJsonPayload".equals(action)) {
            rollbar.sendJsonPayload(args.getString(0));

            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
}
