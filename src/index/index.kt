package index

import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        h1 {
            +"Black Jack"
            div {
                div { b { + "Player Hand" } }
                div { b { + "Cards goes Here" } }
                div { b { + "12 points" } }
            }

        }

    }
}
