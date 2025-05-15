package io.github.nguyenyou.lamini.tags

import org.scalajs.dom

class HtmlTag[+Ref <: dom.html.Element](
    val name: String
) {
  def apply(children: HtmlTag[dom.html.Element]*): Ref = {
    val element = dom.document.createElement(name)
    children.foreach(child => element.appendChild(child()))
    element.asInstanceOf[Ref]
  }
}
