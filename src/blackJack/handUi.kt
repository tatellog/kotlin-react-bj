@file:Suppress("UnsafeCastFromDynamic")

package blackJack
import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi() {
    div {
        attrs.style = js {
            width = "10rem"
            height = "10rem"
            padding = "1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "#ffb3ba"
        }

        div { b { +"Player Hand" } }
        div {

        }
        div { b { +"12 points" } }
    }
}