const val RELEASE_USER = "hendraanggrian"
const val RELEASE_GROUP = "com.$RELEASE_USER"
const val RELEASE_ARTIFACT = "packr-gradle-plugin"
const val RELEASE_VERSION = "0.1"
const val RELEASE_DESC = "Start making native distributions for your JAR"
const val RELEASE_WEBSITE = "https://github.com/$RELEASE_USER/$RELEASE_ARTIFACT"

val BINTRAY_USER: String? = System.getenv("BINTRAY_USER")
val BINTRAY_KEY: String? = System.getenv("BINTRAY_KEY")