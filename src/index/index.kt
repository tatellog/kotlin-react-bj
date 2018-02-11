@file:Suppress("UnsafeCastFromDynamic")

package index

import kotlinext.js.js
import kotlinx.html.style
import kotlinx.html.title
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        div {
            h1 { +"Black Jack"}
            div {

                attrs.title = "Foo"
                attrs.style = js {
                    display = "flex"
                }
                div {
                    div { b { + "Player Hand" } }
                    div {  + "Cards goes Here" }
                    div { b { + "12 points" } }
                }

                div {
                    div { b { + "Dealer Hand" } }
                    div { + "Cards goes Here"  }
                    div { b { + "14 points" } }
                }
            }

            }
        }


}
