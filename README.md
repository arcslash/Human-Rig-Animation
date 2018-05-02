Android 3D Model Viewer - Control Humanoid Rig for sesor coordinates
=======================

![codeship badge](https://codeship.com/projects/52cf9560-deb2-0134-4203-2aaddef843aa/status?branch=master)

This is a demo of OpenGL ES 2.0.
It is basically an android application with a 3D engine that can load Wavefront OBJ, STL & DAE files.
The purpose of this application is to learn and share how to draw using OpenGL language.

* Wafefront format (OBJ): https://en.wikipedia.org/wiki/Wavefront_.obj_file
* STereoLithography format (STL): https://en.wikipedia.org/wiki/STL_(file_format)
* Collada format (DAE): https://en.wikipedia.org/wiki/COLLADA


News (22/12/2017)
=================

* Implemented collision detection algorithm: ray-aabb + ray-triangle + octree
* Support for collada files with skeletal animations :)
* Fixed #28: Load texture feature is now available


Android Market
==============

[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" width="323" height="125">](https://play.google.com/store/apps/details?id=org.andresoviedo.dddmodel2)


About
=====

Load 3D models and see how to do it with this open source code application.

The main purpose of this app is to show how to draw in android using the OpenGL 2.0 by sharing the source code.
So please, don't expect this application to be much richer or nicer than the ones already published in the app store,
but at least it's opened to anyone who wants to contribute or don't want to start a similar project from scratch.

As this is my first android app and Im still learning the OpenGL 2.0 language, it is highly probable that there are bugs;
but I will try to continue improving the app and adding more features. So please send me your comments, suggestions or
complains by opening an [issue](https://github.com/andresoviedo/android-3D-model-viewer/issues) or email me to andresoviedo@gmail.com.

The app comes with some included 3D models that were taken for free from Internet (http://www.turbosquid.com).


Whats next
==========

* Stabilize app performance
* Code refactoring
* Carboard support?
* Chromecast support?
* ...


Features
========

  - OpenGL ES 2.0 API
  - Formats: OBJ (wavefront), STL (STereoLithography) & DAE (Collada-BETA)
  - calculation of normals
  - transformations: scaling, rotation, translation
  - colors
  - textures
  - lighting
  - wireframe & points mode
  - bounding box drawing
  - object selection
  - camera support!
    - tap to select object
    - drag to move camera
    - rotate with 2 fingers to rotate camera
    - pinch & spread to zoom in/out the camera
  - skeletal animations
  - ray collision detection


Try it
======

  * Play Store:  https://play.google.com/store/apps/details?id=org.andresoviedo.dddmodel2
  * APK: [app-release.apk](app/build/outputs/apk/app-release.apk)
  * Source code: clone the repository, compile with gradle and install with adb

```
    export ANDROID_HOME=/home/$USER/Android/Sdk
    ./gradlew assembleDebug
    adb install -r app/build/outputs/apk/app-debug.apk
    adb shell am start -n org.andresoviedo.dddmodel2/org.andresoviedo.app.model3D.MainActivity
```

* Open the application. You should see a menu. From there you can load some demos or load your own model
* Once the scenario is loaded, pinch and rotate to see the 3D scene from another perspective.


Screenshot
==========

![Screenshot1](screenshots/screenshot1.png)
![Screenshot2](screenshots/screenshot2.png)
![Screenshot3](screenshots/screenshot3.png)
![Screenshot4](screenshots/screenshot4.png)
![Screenshot5](screenshots/screenshot5.png)
![Screenshot6](screenshots/screenshot6.png)
![Screenshot7](screenshots/screenshot7.png)
![cowboy.gif](screenshots/cowboy.gif)
![stormtrooper.gif](screenshots/stormtrooper.gif)


Final Notes
===========

You are free to use this program while you keep this file and the authoring comments in the code.
Any comments and suggestions are welcome.


Contact
=======

http://www.andresoviedo.org


Donations
=========

[<img src="https://www.paypalobjects.com/webstatic/en_US/i/btn/png/btn_donate_92x26.png">](https://www.paypal.me/andresoviedo)



  - (f) Fixed loading external files issue #6
  - (i) Project moved to gradle
- 1.2.0 (06/04/2016)
  - (n) Implemented selection of objects
- 1.1.0 (30/03/2016)
  - (n) Implemented lighting & toggle textures & lights
  - (i) Refactoring of 3DObjectImpl
- 1.0.0 (27/03/2016)
  - (n) First release in Google Play Android Market
# Human-Rig-Animation
# Human-Rig-Animation
