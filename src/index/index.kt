@file:Suppress("UnsafeCastFromDynamic")

package index


import blackJack.app
import blackjack.models.Game
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        app()

        }


}


