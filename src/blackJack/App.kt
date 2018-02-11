package blackJack

import blackjack.models.Game
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

interface AppState:RState {
    var game: Game
}

class App:RComponent<RProps, AppState>(){

    override fun AppState.init() {
        game = Game()
    }

    override fun RBuilder.render() {
        gameUi(state.game)

    }
}

fun RBuilder.app() = child(App::class){

}