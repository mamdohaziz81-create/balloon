GameMaster AI — Android prototype

This is a starter Android project targeting Android 8+ (tested target SDK 35 / Android 15).


Important status

This is not yet an autonomous AI that can understand and play arbitrary games. It currently provides:



An Android app shell.

An AccessibilityService declaration for future user-authorized touch/gesture automation.

A GitHub Actions workflow to build a debug APK.


It does not yet include screen capture, a vision model, game-rule learning, a planner, or automatic gameplay. Those features require implementation and testing against real games. Do not leave automation running unattended until it has been validated.


Build without a PC

Upload these project files to a GitHub repository on the main branch. GitHub Actions will build a debug APK:



Open the repository's Actions tab.

Select Build Android APK.

Tap Run workflow if it has not started automatically.

Open the completed run and download the GameMasterAI-debug-apk artifact.


Permissions

The app's AccessibilityService is not enabled by default. Android requires the user to enable it explicitly in Settings. Screen capture, if added later, must use Android's MediaProjection consent flow. The app must not bypass game protections, purchases, ads, or other platform controls.

