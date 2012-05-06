package vaadin.scala.tests

import vaadin.scala._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PanelTests extends FunSuite {

  test("content") {
    val panel = new Panel

    val layout = new VerticalLayout
    panel.content = layout
    assert(panel.content === layout)
  }

  test("scrollable") {
    val panel = new Panel

    assert(!panel.scrollable)

    panel.scrollable = true
    assert(panel.scrollable)
  }

  test("scrollLeft") {
    val panel = new Panel

    assert(panel.scrollLeft === 0)

    panel.scrollLeft = 126
    assert(panel.scrollLeft === 126)
  }

  test("scrollTop") {
    val panel = new Panel

    assert(panel.scrollTop === 0)

    panel.scrollTop = 37
    assert(panel.scrollTop === 37)
  }

}