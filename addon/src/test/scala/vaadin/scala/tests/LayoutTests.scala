package vaadin.scala.tests

import org.scalatest.FunSuite
import vaadin.scala._
import com.vaadin.terminal.Sizeable
import com.vaadin.ui.Layout.MarginInfo

class LayoutTests extends FunSuite {

  test("VerticalLayout, constructor with all params but without names") {
    val layout = new VerticalLayout(10 px, 100 em, true, true, "Caption", "Style")
    assert(layout.p.getWidth === 10)
    assert(layout.p.getWidthUnits === Sizeable.UNITS_PIXELS)
    assert(layout.p.getHeight === 100)
    assert(layout.p.getHeightUnits === Sizeable.UNITS_EM)
    assert(layout.p.getMargin === new MarginInfo(true, true, true, true))
    assert(layout.spacing === true)
    assert(layout.caption.get === "Caption")
    assert(layout.p.getStyleName === "Style")

  }

  test("VerticalLayout, default constructor") {
    val layout = new VerticalLayout()
    assert(layout.p.getWidth === 100)
    assert(layout.p.getWidthUnits === Sizeable.UNITS_PERCENTAGE)
    assert(layout.p.getHeight === -1)
    assert(layout.p.getHeightUnits === Sizeable.UNITS_PIXELS)
    assert(layout.p.getMargin === new MarginInfo(false, false, false, false))
    assert(layout.spacing === false)
    assert(layout.caption === None)
    assert(layout.p.getStyleName === "")
  }
  
  test("VerticalLayout, add") {
    val layout = new VerticalLayout
    
    val label = new Label
    layout.add(label, 2, Alignment.bottomCenter)
    
    assert(layout.p.getComponent(0) === label.p)
    assert(layout.p.getExpandRatio(label.p) === 2)
    assert(layout.alignment(label) === Alignment.bottomCenter)
    assert(layout.p.getComponentAlignment(label.p) === com.vaadin.ui.Alignment.BOTTOM_CENTER)

    assert(layout.p.getComponentIndex(label.p) === 0)
  }
  
  test("VerticalLayout, add with index") {
    val layout = new VerticalLayout
    layout.add(new Label())
    layout.add(new Label())
    layout.add(new Label())
    
    val button = new Button
    layout.addComponent(button, index = 2)

    assert(layout.p.getComponentIndex(button) === 2)
  }

}