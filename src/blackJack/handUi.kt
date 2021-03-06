@file:Suppress("UnsafeCastFromDynamic")

package blackJack
import blackjack.models.Hand
import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi(hand: Hand) {
    div {
        attrs.style = js {
            width = "10rem"
            height = "10rem"
            padding = "1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "#ffb3ba"
            color = "white"
        }

        div { b { +"Player Hand" } }
        div {
            hand.cards.forEach {
                div { + it.toString() }
            }

        }
        div { b { +"${hand.handValue()} Points" } }
    }
}