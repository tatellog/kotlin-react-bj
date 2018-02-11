@file:Suppress("UnsafeCastFromDynamic")

package index


import kotlinx.html.style
import kotlinx.html.title
import blackJack.*
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        gameUi()

        }


}


