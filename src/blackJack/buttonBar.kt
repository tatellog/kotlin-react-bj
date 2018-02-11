package blackJack

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div


fun RBuilder.buttonBar(controller : contrllerGame){
    div {
        button {
            +"Deal"
            attrs.onClickFunction = {
                controller.deal()
            }
        }
        button {
            +"Hit"
            attrs.onClickFunction = {
                controller.hit()
            }
        }
        button {
            +"Stay"
            attrs.onClickFunction = {
                controller.stay()
            }
        }

    }
}

interface contrllerGame{
    fun hit()
    fun deal()
    fun stay ()
}
