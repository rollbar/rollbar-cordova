# Testing updates to rollbar-java SDK

Ony when making changes to rollbar-java that affect Cordova support, or must be
tested during development with this plugin, you will need to build with local
files for rollbar-java.

## rollbar-java development build

Build rollbar-java with your changes.
```
./gradlew build
```

## Include aar/jar files in the dev/ folder

These build products are required:

* rollbar-web.jar
* rollbar-logback.jar
* rollbar-log4j2.jar
* rollbar-api.jar
* rollbar-java.jar
* rollbar-android-release.aar

## Update plugin.xml

Comment the production framework tag:
```
<framework src="com.rollbar:rollbar-android:1.+" type="gradleReference" />
```

Uncomment the dev framework section directly below the above tag in plugin.xml,
including the reference to dev/rollbar.gradle.

The plugin is now ready to be added to the Cordova app.
