package org.paradrops.processings

import processing.core.PApplet

class Sketch : PApplet() {
    override fun settings() {
        super.settings()
        size(600, 600)
    }

    override fun draw() {
        super.draw()
        if (mousePressed) {
            ellipse(mouseX.toFloat(), mouseY.toFloat(), 50F, 50F)
        }
    }
}