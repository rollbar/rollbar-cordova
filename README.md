## Attention:

As of May 2024, Rollbar will not be actively updating this repository and plans to archive it in January of 2025. We encourage our community to fork this repo if you wish to continue its development. While Rollbar will no longer be engaging in active development, we remain committed to reviewing and merging pull requests related to security updates. If an actively maintained fork emerges, please reach out to our support team and we will link to it from our documentation.


# Rollbar-cordova

[Rollbar](https://rollbar.com) is a real-time exception reporting service for Java, Objective C, Javascript and other
languages. The Rollbar service will alert you of problems with your code and help you understand
them in ways never possible before. We love it and we hope you will too.

Rollbar-cordova is the SDK for Cordova apps, includinng full support for Android,
iOS, and Javascript environments in Cordova.

## Setup Instructions

1. [Sign up for a Rollbar account](https://rollbar.com/signup)
2. Follow the [Getting Started](https://rollbar.readme.io/docs/rollbar-cordova#section-getting-started) instructions in our [Rollbar Cordova docs](https://rollbar.readme.io/docs/rollbar-cordova) to install rollbar-cordova and configure it for your platform.

## Usage and Reference

For complete Usage instructions and configuration reference, see our [Cordova docs](https://rollbar.readme.io/docs/rollbar-cordova#section-configuration).

## Release History & Changelog

See our [Releases](https://github.com/rollbar/rollbar-cordova/releases) page for a list of all releases, including changes.

## Help / Support

If you run into any issues, please email us at [support@rollbar.com](mailto:support@rollbar.com)

For bug reports, please [open an issue on Github](https://github.com/rollbar/rollbar-cordova/issues/new).

## Development

The following applies only if you make changes to rollbar-java, rollbar-ios, or rollbar.js
that must be tested with rollbar-cordova while in development. These dependencies are installed
when the plugin is added, and you must remove and re-add the plugin from a local folder when making these changes.

### Rollbar-ios

Update the pod element in plugin.xml with your git branch location.
```
<pod name="Rollbar" git="git@github.com:rollbar/rollbar-ios.git" branch="master" />
```

### Rollbar-java

Follow the instructions in [dev/README.md](https://github.com/rollbar/rollbar-cordova/tree/master/dev/README.md).

### Rollbar.js

Replace lib/rollbar.js with your development version.

## Contributing

1. Fork it
2. Create your feature branch (```git checkout -b my-new-feature```).
3. Commit your changes (```git commit -am 'Added some feature'```)
4. Push to the branch (```git push origin my-new-feature```)
5. Create new Pull Request

## License
Rollbar-gem is free software released under the MIT License. See [LICENSE](LICENSE) for details.
