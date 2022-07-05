import com.gradle.gradlebuild

def call(){
    echo 'this is the Gradle project'
    echo 'this is the Gradle project for ${name}'
    def gradlebuild =new gradlebuild(script:this)
    gradlebuild.gradle()
}
