Demo of how a syntax error in an inclde build breaks syncing when `kotlin.mpp.enableCInteropCommonization=true`.

Set `kotlin.mpp.enableCInteropCommonization` to false in main project's gradle.properties and the Android Studio's gradle sync works again.
