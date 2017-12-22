#!/usr/local/bin/wish
wm minsize . 1000 750
wm title . "Image Editor"
wm resizable . 0 1
wm geometry . 300x200+50+50
wm attributes . -alpha ".98"
image create photo icon3 -file "icon3.png" 
wm iconphoto .  icon3
wm protocol . WM_DELETE_WINDOW {
    set response [tk_messageBox -type yesno -message "Really quit?"]
    if {$response eq "yes"} {
        destroy .
    }
}


frame .1myFrame1 -background #eeeaea  -height 625 -width 110  
canvas .1myFrame1.canvas -background #eeeaea  -height 625 -width 110
pack .1myFrame1.canvas
place .1myFrame1 -x 890 -y 125
frame .1myFrame1.photo -background #eeeaea -height 400 -width 110 
place .1myFrame1.photo -x 0 -y 130

#.myFrame1.canvas create line 5 100 100 100 -fill black -smooth true 
image create photo add -file "add.png" 
button .1myFrame1.add -image add -relief flat -command {tk_getOpenFile -title "Choose Picture"}



place .1myFrame1.add -x 8 -y 17

image create photo clear -file "clear.png" 
image create photo line1 -file "line.png" 
image create photo line2 -file "line.png" 
button .1myFrame1.clear -image clear -relief flat 
place .1myFrame1.clear -x 12 -y 580
label .1myFrame1.line -image line1 -relief flat -bg #eeeaea -font bold -fg #f9f9f9 
place .1myFrame1.line -x 9 -y 100
label .1myFrame1.line2 -image line2 -relief flat -bg #eeeaea -font bold -fg #f9f9f9 
place .1myFrame1.line2 -x 9 -y 570

labelframe .1myFrame3 -background #201a1b -height 525 -width 780 -padx 5 -pady 5 -bd 10 

place .1myFrame3 -x 110 -y 160 
image create photo icon2 -file "icon2.png" 
label .1myFrame3.icon2 -image icon2 -relief flat -fg #201a1b
place .1myFrame3.icon2 -x 310 -y 190

frame .1myFrame4 -background #201a1b -height 65 -width 780 -padx 5 -pady 5
place .1myFrame4 -x 110 -y 685
#image create photo guide -file "guide.png" 
#label .myFrame4.guide -image guide -relief groove -background #201a1b
#canvas .myFrame4.canvas -background #201a1b  -height 65 -width 780
#label .myFrame4.guide1  -text "1 Import \n  Image " -font {Helvetica -18 bold} -background #201a1b -fg #d1dd7b
label .1myFrame4.guide1  -text "1 导入图片" -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b
label .1myFrame4.guide2  -text "2 切换背景色\
 " -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b
label .1myFrame4.guide3  -text "3 调色板" -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b 
label .1myFrame4.guide4  -text "4 画笔" -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b 
label .1myFrame4.guide5  -text "5 自动套取" -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b
label .1myFrame4.guide6  -text "6 选框" -font {Helvetica -19 bold} -background #201a1b -fg #d1dd7b
 
place .1myFrame4.guide1 -x 10 -y 10
place .1myFrame4.guide2 -x 130 -y 10
place .1myFrame4.guide3 -x 270 -y 10
place .1myFrame4.guide4 -x 370 -y 10
place .1myFrame4.guide5 -x 460 -y 10
place .1myFrame4.guide6 -x 580 -y 10

labelframe .1myFrame5 -background #424242 -height 35 -width 890 -padx 5 -pady 5
place .1myFrame5 -x 0 -y 125
label .1myFrame5.font -background #424242 -fg #c4c3b9 -text "Frame作用：图片导入路径" -font {Arial -18 bold}
place .1myFrame5.font -x 10

#bind .1myFrame3 <B1.Motion> {
#set coordx %x
#set coordy %y
#}

#proc CanvasMark{x y }{
#set x {canvasx $x}
#set y {canvasy $y}
#}
#$can bind movable<B1.Motion> {CanvasMark $x $y}

#label .1myFrame3.record -get coordx
#pack .1myFrame3.record
#.myFrame3.canvas1 create image icon2 100 100


#.myFrame3.canvas1 create image icon 5 5
#pack .myFrame1 -side right
#grid .myFrame1.clear -column 10 -row 2 -sticky w
#grid .myFrame1.add -column 20 -row 20 -sticky w
 
#pack .myFrame1.add -side right
frame .myFrame1  -relief ridge -bd 2 -padx 5 -pady 5 -height 125 -width 890 -bg #272727
place .myFrame1 -x 0 -y 0

frame .myFrame2  -relief ridge -bd 2 -padx 5 -pady 5 -height 125 -width 110 -bg gray
place .myFrame2 -x 890 -y 0


set img [image create photo -file 1.png]
button .myFrame2.1  -image $img -relief flat -bg gray -command {tk_chooseColor -title "Choose Color"}
place .myFrame2.1 -x 15 -y 0

set img [image create photo -file 2.png]
button .myFrame2.2 -image $img  -relief flat -bg gray -command {tk_chooseColor -title "Choose Color"}
place .myFrame2.2 -x 15 -y 60

set img [image create photo -file 3.png]
button .myFrame1.1 -image $img  -relief flat  -bg #272727
place .myFrame1.1 -x 0 -y 0

set img [image create photo -file 4.png]
button .myFrame1.2 -image $img  -relief flat  -bg #272727
place .myFrame1.2 -x 110 -y 0

set img [image create photo -file 5.png]
button .myFrame1.3 -image $img  -relief flat  -bg #272727
place .myFrame1.3 -x 190 -y 0

set img [image create photo -file 6.png]
button .myFrame1.4 -image $img  -relief flat  -bg #272727 -command {tk_getOpenFile -title "Choose Picture"}
place .myFrame1.4 -x 390 -y 0

set img [image create photo -file 7.png]
button .myFrame1.5 -image $img  -relief flat  -bg #272727
place .myFrame1.5 -x 450 -y 0

set img [image create photo -file 8.png]
button .myFrame1.6 -image $img  -relief flat  -bg #272727  
place .myFrame1.6 -x 510 -y 0

set img [image create photo -file 9.png]
button .myFrame1.7 -image $img  -relief flat  -bg #272727
place .myFrame1.7 -x 570 -y 0

set img [image create photo -file 10.png]
button .myFrame1.8 -image $img  -relief flat  -bg #272727
place .myFrame1.8 -x 630 -y 0

set img [image create photo -file 11.png]
button .myFrame1.9 -image $img  -relief flat  -bg #272727
place .myFrame1.9 -x 690 -y 0

set img [image create photo -file 12.png]
button .myFrame1.10 -image $img  -relief flat  -bg #272727
place .myFrame1.10 -x 750 -y 0

set img [image create photo -file 13.png]
button .myFrame1.11 -image $img  -relief flat  -bg #272727
place .myFrame1.11 -x 20 -y 50

set img [image create photo -file 14.png]
button .myFrame1.12 -image $img  -relief flat  -bg #272727
place .myFrame1.12 -x 170 -y 50

set img [image create photo -file 15.png]
button .myFrame1.13 -image $img  -relief flat  -bg #272727
place .myFrame1.13 -x 320 -y 50

set img [image create photo -file 16.png]
button .myFrame1.14 -image $img  -relief flat  -bg #272727
place .myFrame1.14 -x 470 -y 50

set img [image create photo -file 17.png]
button .myFrame1.15 -image $img  -relief flat  -bg #272727
place .myFrame1.15 -x 620 -y 55

set img [image create photo -file 18.png]
button .myFrame1.16 -image $img  -relief flat  -bg #272727
place .myFrame1.16 -x 770 -y 55


frame .left  -background #272727 -width 110 -height 590
place .left -x 0 -y 160

label .left.line1  -text "—————" -font {Helvetica -19 bold} -background #272727 -fg #d1dd7b -relief flat
place .left.line1 -x 5 -y 103
label .left.line2  -text "—————" -font {Helvetica -19 bold} -background #272727 -fg #d1dd7b -relief flat
place .left.line2 -x 5 -y 235
label .left.line3  -text "—————" -font {Helvetica -19 bold} -background #272727 -fg #d1dd7b -relief flat
place .left.line3 -x 5 -y 465

image creat photo .triangleleft -file "triangleleft.png"
button .left.triangleleft -image .triangleleft  -relief flat -bg #272727
place  .left.triangleleft -x 16 -y 2
image creat photo .triangleright  -file "triangleright.png"
button .left.triangleright -image .triangleright -relief flat -bg #272727
place  .left.triangleright  -x 60 -y 0

image creat photo .trimbox  -file "trimbox.png"
button .left.trimbox -image .trimbox -relief flat -bg #272727
place .left.trimbox -x 10 -y 20
image creat photo .cursor  -file "cursor.png"
button .left.cursor -image .cursor -relief flat -bg #272727
place .left.cursor -x 60 -y 20

image creat photo .box  -file "box.png"
button .left.box -image .box -relief flat -bg #272727
place .left.box -x 10 -y 50
image creat photo .rope  -file "rope.png"
button .left.rope -image .rope -relief flat -bg #272727
place .left.rope -x 60 -y 50

image create photo flash -file "flash.png"
button .left.flash -image flash -relief flat -bg #272727
place .left.flash -x 10 -y 80


image create photo pencil -file "pencil.png"
button .left.pencil -image pencil -relief flat -bg #272727
place .left.pencil -x 10 -y 120
image create photo brush -file "brush.png"
button .left.brush -image brush -relief flat -bg #272727
place .left.brush -x 60 -y 120

image create photo eraser -file "eraser.png"
button .left.eraser -image eraser -relief flat -bg #272727
place .left.eraser -x 10 -y 150
image create photo bucket -file "bucket.png"
button .left.bucket -image bucket -relief flat -bg #272727
place .left.bucket -x 60 -y 150

image create photo rectangle -file "rectangle.png"
button .left.rectangle -image rectangle -relief flat -bg #272727
place .left.rectangle -x 10 -y 180
image create photo stamp   -file "stamp.png"
button .left.stamp -image stamp -relief flat -bg #272727
place .left.stamp -x 60 -y 180

image create photo rotate -file "rotate.png"
button .left.rotate -image rotate -relief flat -bg #272727
place .left.rotate -x 10 -y 210
image create photo circle -file "circle.png"
button .left.circle -image circle -relief flat -bg #272727
place .left.circle -x 60 -y 210

image create photo liquid -file "liquid.png"
button .left.liquid -image liquid -relief flat -bg #272727
place .left.liquid -x 10 -y 255
image create photo triangle -file "triangle.png"
button .left.triangle -image triangle -relief flat -bg #272727
place .left.triangle -x 60 -y 255

image create photo finger -file "finger.png"
button .left.finger -image finger -relief flat -bg #272727
place .left.finger -x 10 -y 285
image create photo sponge -file "sponge.png"
button .left.sponge  -image sponge -relief flat -bg #272727
place .left.sponge -x 60 -y 285

image create photo blackloupe -file "blackloupe.png"
button .left.blackloupe -image blackloupe -relief flat -bg #272727
place .left.blackloupe -x 10 -y 315
image create photo hand -file "hand.png"
button .left.hand -image hand -relief flat -bg #272727
place .left.hand -x 60 -y 315

image create photo eye -file "eye.png"
button .left.eye -image eye -relief flat -bg #272727
place .left.eye -x 10 -y 345
image create photo pen -file "pen.png"
button .left.pen -image pen -relief flat -bg #272727
place .left.pen -x 60 -y 345

image create photo enlarge -file "enlarge.png"
button .left.enlarge -image enlarge -relief flat -bg #272727
place .left.enlarge -x 10 -y 375
image create photo shrink -file "shrink.png"
button .left.shrink -image shrink -relief flat -bg #272727
place .left.shrink -x 60 -y 375

image create photo liquidpen -file "liquidpen.png"
button .left.liquidpen -image liquidpen -relief flat -bg #272727
place .left.liquidpen -x 10 -y 405
image create photo alphabet -file "alphabet.png"
button .left.alphabet -image alphabet -relief flat -bg #272727
place .left.alphabet -x 60 -y 405

image create photo grab -file "grab.png"
button .left.grab -image grab -relief flat -bg #272727
place .left.grab -x 10 -y 435
image create photo loupe -file "loupe.png"
button .left.loupe -image loupe -relief flat -bg #272727
place .left.loupe -x 60 -y 435

image create photo bgcolor -file "bgcolor.png"
button .left.bgcolor -image bgcolor -relief flat -bg #272727
place .left.bgcolor -x 0 -y 490 -width 110 -height 40

image create photo bgcolor1 -file "bgcolor1.png"
button .left.bgcolor1 -image bgcolor1 -relief flat -bg #272727
place .left.bgcolor1 -x 18 -y 537
image create photo bgcolor2 -file "bgcolor2.png"
button .left.bgcolor2 -image bgcolor2 -relief flat -bg #272727
place .left.bgcolor2 -x 43 -y 537
image create photo bgcolor3 -file "bgcolor3.png"
button .left.bgcolor3 -image bgcolor3 -relief flat -bg #272727
place .left.bgcolor3 -x 68 -y 537

image create photo bgcolor4 -file "bgcolor4.png"
button .left.bgcolor4 -image bgcolor4 -relief flat -bg #272727
place .left.bgcolor4 -x 18 -y 558
image create photo bgcolor5 -file "bgcolor5.png"
button .left.bgcolor5 -image bgcolor5 -relief flat -bg #272727
place .left.bgcolor5 -x 43 -y 558
image create photo bgcolor6 -file "bgcolor6.png"
button .left.bgcolor6 -image bgcolor6 -relief flat -bg #272727
place .left.bgcolor6 -x 68 -y 558


