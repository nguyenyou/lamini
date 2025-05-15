package www

import io.github.nguyenyou.lamini.api.L
import org.scalajs.dom

@main 
def main(): Unit = {
    val container = dom.document.getElementById("app")
    L.render(container, L.div)
}