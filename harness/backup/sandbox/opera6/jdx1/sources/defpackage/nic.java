package defpackage;

import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class nic implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ListPopupWindow b;

    public /* synthetic */ nic(ListPopupWindow listPopupWindow, byte b) {
        this.a = b;
        this.b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ListPopupWindow listPopupWindow = this.b;
        switch (b) {
            case 0:
                im7 im7Var = listPopupWindow.c;
                if (im7Var != null) {
                    im7Var.h = true;
                    im7Var.requestLayout();
                    break;
                }
                break;
            default:
                im7 im7Var2 = listPopupWindow.c;
                if (im7Var2 != null && im7Var2.isAttachedToWindow() && listPopupWindow.c.getCount() > listPopupWindow.c.getChildCount() && listPopupWindow.c.getChildCount() <= listPopupWindow.m) {
                    listPopupWindow.B.setInputMethodMode(2);
                    listPopupWindow.show();
                    break;
                }
                break;
        }
    }
}
