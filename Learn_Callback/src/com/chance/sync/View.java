package com.chance.sync;

/**
 * 这个View就相当于B类
 * @author xiaanming
 *
 */
//public class View implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource {
public class View {

    protected OnClickListener mOnClickListener;

//    setOnClickListener()的参数是OnClickListener接口------>背景三
    public void setOnClickListener(OnClickListener l) {
//        if (!isClickable()) {
//            setClickable(true);
//        }
        mOnClickListener = l;
    }

    public boolean performClick() {
//        sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED);

        if (mOnClickListener != null) {
//            playSoundEffect(SoundEffectConstants.CLICK);

            //这个不就是相当于B类调用A类的某个方法D，这个D就是所谓的回调方法咯
            mOnClickListener.onClick(this);
            return true;
        }

        return false;
    }
}
