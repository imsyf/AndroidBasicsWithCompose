package com.posebasics.app.data

import com.posebasics.app.R
import com.posebasics.app.toc.CourseUnitProps
import com.posebasics.app.toc.PathwayProps

object Store {

    private val courseUnits: List<CourseUnit> = listOf(
        CourseUnit(
            id = 1,
            title = "Your first Android app",
            description = "Learn programming basics and create your first Android app.",
            pathways = listOf(
                Pathway(
                    id = 1,
                    badge = R.drawable.badge_u1p1,
                    title = "Introduction to Kotlin",
                    description = "Learn introductory programming concepts in Kotlin to prepare for building Android apps in Kotlin.",
                    published = "April 2022",
                    demos = listOf(
                        Demo(
                            type = DemoType.Codelab,
                            title = "Your first program in Kotlin",
                            description = "Learn how to create and modify simple programs in Kotlin.",
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Create and use variables in Kotlin",
                            description = "Learn why variables are useful in programming, as well as how to define and update variables in your Kotlin code.",
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Create and use functions in Kotlin",
                            description = "Learn about functions in Kotlin.",
                        ),
                        Demo(
                            type = DemoType.Project,
                            title = "Kotlin Basics",
                            description = "Apply the basic concepts of the Kotlin programming language to solve the given problems.",
                        ),
                    )
                ),
                Pathway(
                    id = 2,
                    badge = R.drawable.badge_u1p2,
                    title = "Set up Android Studio",
                    description = "Install and set up Android Studio, create your first project, and run it on a device or emulator.",
                    published = "April 2022",
                    demos = listOf(
                        Demo(
                            type = DemoType.Codelab,
                            title = "Download and install Android Studio",
                            description = "Learn how to download and install Android Studio.",
                        ),
                        Demo(
                            route = R.id.u1p2c1_greeting_card,
                            type = DemoType.Codelab,
                            title = "Create your first Android app",
                            description = "Learn how to create your first Android app.",
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Run your first app on the Android Emulator",
                            description = "Learn how to run an app on the Android Emulator.",
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "How to connect your Android device",
                            description = "Learn how to connect your app in Android Studio to your physical Android device.",
                        ),
                    )
                ),
                Pathway(
                    id = 3,
                    badge = R.drawable.badge_u1p3,
                    title = "Build a basic layout",
                    description = "Build an Android app with a simple user interface that displays text and images.",
                    published = "April 2022",
                    demos = listOf(
                        Demo(
                            route = R.id.u1p3c1_happy_birthday,
                            type = DemoType.Codelab,
                            title = "Build a simple app with text composables",
                            description = "Learn how to build a simple app with composable functions.",
                        ),
                        Demo(
                            route = R.id.u1p3c2_happy_birthday,
                            type = DemoType.Codelab,
                            title = "Add images to your Android app",
                            description = "Learn how to add images to your app using a composable function.",
                        ),
                        Demo(
                            route = R.id.u1p3pra1_article,
                            type = DemoType.Practice,
                            title = "Compose Basics: Article",
                            description = "Build a screen which displays a tutorial for Jetpack Compose.",
                        ),
                        Demo(
                            route = R.id.u1p3pra2_taskcompleted,
                            type = DemoType.Practice,
                            title = "Compose Basics: Task Manager",
                            description = "Build a screen that users see when they complete all the tasks for a given day.",
                        ),
                        Demo(
                            route = R.id.u1p3pra3_quadrants,
                            type = DemoType.Practice,
                            title = "Compose Basics: Quadrant",
                            description = "Build a screen that is divided into four quadrants. Each quadrant provides the name of a Composable function and describes it in one sentence.",
                        ),
                        Demo(
                            route = R.id.u1p3pro1_businesscard,
                            type = DemoType.Project,
                            title = "Create a Business Card app",
                            description = "Learn how to create an Android app that showcases your business card.",
                        ),
                    )
                ),
            ),
        ),
        CourseUnit(
            id = 2,
            title = "Building app UI",
            description = "Continue learning the fundamentals of Kotlin, and start building more interactive apps.",
            pathways = listOf(
                Pathway(
                    id = 1,
                    badge = R.drawable.badge_u2p1,
                    title = "Kotlin fundamentals",
                    description = "Learn more fundamentals of Kotlin, object-oriented programming, and lambdas.",
                    published = "April 2022",
                    demos = listOf(
                        Demo(
                            type = DemoType.Codelab,
                            title = "Write conditionals in Kotlin",
                            description = "Learn how to write conditionals in Kotlin."
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Use nullability in Kotlin ",
                            description = "Learn how to use nullability in Kotlin."
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Use classes and objects in Kotlin",
                            description = "Learn how to use classes and objects in Kotlin."
                        ),
                        Demo(
                            type = DemoType.Codelab,
                            title = "Use function types and lambda expressions in Kotlin",
                            description = "Learn how to use lambda expressions and higher order functions in Kotlin."
                        ),
                        Demo(
                            type = DemoType.Practice,
                            title = "Kotlin Fundamentals ",
                            description = "Apply the basic concepts of the Kotlin programming language to solve the given problems."
                        ),
                    )
                ),
                Pathway(
                    id = 2,
                    badge = R.drawable.badge_u2p2,
                    title = "Add a button to an app",
                    description = "Learn how to respond to a button click in an Android app.",
                    published = "April 2022",
                    demos = listOf(
                        Demo(
                            route = R.id.u2p2c1_diceroller,
                            type = DemoType.Codelab,
                            title = "Create an interactive Dice Roller app",
                            description = "Learn how to build an interactive Dice Roller app that lets users roll a dice and then shows them the result."
                        ),
                    )
                ),
                Pathway(
                    id = 3,
                    badge = R.drawable.badge_u2p3,
                    title = "Interact with UI and state",
                    description = "Create a tip calculator app that calculates the tip from user input.",
                    published = "April 2022",
                    demos = listOf()
                ),
            ),
        ),
        CourseUnit(
            id = 3,
            title = "Display lists and use Material Design",
            description = "Build apps that display a list of data and learn how to make your apps more beautiful with Material Design.",
            pathways = listOf(
                Pathway(
                    id = 1,
                    badge = R.drawable.badge_u3p1,
                    title = "More Kotlin fundamentals",
                    description = "Learn additional Kotlin programming concepts that will enable you to build more interesting and fun Android apps.",
                    published = "July 2022",
                    demos = listOf()
                ),
                Pathway(
                    id = 2,
                    badge = R.drawable.badge_u3p2,
                    title = "Build a scrollable list",
                    description = "Create an app that displays a scrollable list of text and images using Compose.",
                    published = "July 2022",
                    demos = listOf()
                ),
                Pathway(
                    id = 3,
                    badge = R.drawable.badge_u3p3,
                    title = "Build beautiful apps",
                    description = "Make your apps more beautiful and intuitive to use with Material Design, animations, and accessibility best practices.",
                    published = "July 2022",
                    demos = listOf()
                ),
            ),
        ),
        CourseUnit(
            id = 4,
            title = "Navigation and app architecture",
            description = "Learn the best practices of app architecture to build more complex apps. Enhance your users’ ability to navigate across, into and back out from the various screens within your app for a consistent and predictable user experience.",
            pathways = listOf(
                Pathway(
                    id = 1,
                    badge = R.drawable.badge_u4p1,
                    title = "Architecture Components",
                    description = "Learn about app architecture and how to use ViewModels, UI State, and StateFlow to build more complex apps.",
                    published = "August 2022",
                    demos = listOf()
                ),
                Pathway(
                    id = 2,
                    badge = R.drawable.badge_u4p2,
                    title = "Navigation in Jetpack Compose",
                    description = "Learn how to use the Navigation component to build more complex apps with more screens and how to navigate and pass data between different composables.",
                    published = "August 2022",
                    demos = listOf()
                ),
                Pathway(
                    id = 3,
                    badge = R.drawable.badge_u4p3,
                    title = "Adapt for different screen sizes",
                    description = "In this pathway, you'll learn how to adapt your app to different screen sizes and provide a better user experience, as well as how to test your adaptive UI.",
                    published = "August 2022",
                    demos = listOf()
                ),
            ),
        ),
        CourseUnit(
            id = 5,
            title = "Connect to the internet",
            description = "Use Kotlin coroutines to perform multiple tasks at once, and learn about HTTP and REST to get data from the internet using Retrofit. Then use the Coil library to display images in your app.",
            pathways = listOf(
                Pathway(
                    id = 1,
                    badge = R.drawable.badge_u5p1,
                    title = "Get data from the internet",
                    description = "Implement coroutines to perform tasks concurrently without blocking the app, and learn about HTTP and REST to get data from the internet.",
                    published = "October 2022",
                    demos = listOf()
                ),
                Pathway(
                    id = 2,
                    badge = R.drawable.badge_u5p2,
                    title = "Load and display images from the internet",
                    description = "Apply architecture best practices to the app and use Coil to download and display images.",
                    published = "October 2022",
                    demos = listOf()
                ),
            ),
        ),
    )

    val courseUnitProps: List<CourseUnitProps> = courseUnits.map {
        CourseUnitProps(
            id = it.id,
            title = it.title,
            description = it.description,
            pathways = it.pathways.size,
        )
    }

    fun getPathwayProps(unitId: Int): List<PathwayProps> = courseUnits
        .first { it.id == unitId }
        .pathways.map {
            PathwayProps(
                id = it.id,
                badge = it.badge,
                title = it.title,
                description = it.description,
            )
        }

    private lateinit var currentCourseUnit: CourseUnit
    fun setCurrentCourseUnit(id: Int) {
        currentCourseUnit = courseUnits[id - 1]
    }

    lateinit var currentPathway: Pathway
    fun setCurrentPathway(id: Int) {
        currentPathway = currentCourseUnit.pathways[id - 1]
    }
}
