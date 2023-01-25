/**
 * Precompiled [lab7.java-library-conventions.gradle.kts][Lab7_java_library_conventions_gradle] script plugin.
 *
 * @see Lab7_java_library_conventions_gradle
 */
public
class Lab7_javaLibraryConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Lab7_java_library_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
