package io.github.nguyenyou.lamini.tags

import org.scalajs.dom

trait HtmlTags {
  def htmlTag[Ref <: dom.html.Element](name: String): HtmlTag[Ref] = new HtmlTag(name)
  lazy val div: HtmlTag[dom.HTMLDivElement] = htmlTag("div")    
}