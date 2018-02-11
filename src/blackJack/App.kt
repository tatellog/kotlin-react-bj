package blackJack

import blackjack.models.Game
import react.*


interface AppState:RState{
    var game : Game
}

class App:RComponent<RProps, AppState>(){

    override fun AppState.init() {
        game = Game()

    }
    override fun RBuilder.render() {
        gameUi(state.game, object : contrllerGame {
            override fun deal() {
                setState {
                    game.deal()
                }
            }

            override fun stay() {
                setState {
                    game.hit()
                }
            }

            override fun hit() {
                setState {
                    game.stay()
                }
            }

        })
    }


}

fun RBuilder.app() = child(App::class){}