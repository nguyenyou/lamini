package io.github.nguyenyou.lamini

import org.scalajs.dom
import io.github.nguyenyou.lamini.tags.{HtmlTag, HtmlTags}

trait Lamini extends HtmlTags {
  def render(container: dom.Element, root: HtmlTag[dom.html.Element]) = {
    container.appendChild(root())
  }
}
