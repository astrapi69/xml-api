## Change log
----------------------

Version 1.4
-------------

ADDED:

- new interface XmlFileToGenericObject that can transform a xml file to an object without giving explicitly the class
  type of the return type

Version 1.3
-------------

ADDED:

- new enum Converter that provides framework names that can make xml transformations
- new package-info files for package documentation

CHANGED:

- update of gradle to new version 7.6-rc-1
- update of gradle-plugin dependency of 'io.freefair.gradle:lombok-plugin' in version 6.5.1
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.11.0
- removed all unused test dependencies

Version 1.2
-------------

ADDED:

- new export declaration in module-info.java for package io.github.astrapi69.xml.api

CHANGED:

- update of gradle to new version 7.5-rc-2
- update of test dependency throw-able to new test dependency throwable in new minor version 2.3
- update of gradle-plugin dependency of 'io.freefair.gradle:lombok-plugin' in version 6.5.0.2
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.7.2

Version 1.1
-------------

ADDED:

- new interface XmlToGenericObject for provide transformation from a xml string to an object without giving explicitly the class type of the return type

Version 1
-------------

ADDED:

- new CHANGELOG.md file created
- moved all interface classes from xml-extensions and jaxb-extensions to this repository

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into
changelogs
