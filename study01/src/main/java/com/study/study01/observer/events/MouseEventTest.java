package com.study.study01.observer.events;


import com.study.study01.observer.events.mouseevent.Mouse;
import com.study.study01.observer.events.mouseevent.MouseEventCallback;
import com.study.study01.observer.events.mouseevent.MouseEventType;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
