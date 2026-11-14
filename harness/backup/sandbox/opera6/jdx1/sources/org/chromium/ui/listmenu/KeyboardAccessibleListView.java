package org.chromium.ui.listmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes.dex */
public class KeyboardAccessibleListView extends ListView {
    public int a;

    public KeyboardAccessibleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }

    public final void a(int i) {
        View focusedChild = getFocusedChild();
        View viewFocusSearch = focusedChild != null ? focusedChild.focusSearch(i) : focusSearch(i);
        if (viewFocusSearch != null) {
            viewFocusSearch.requestFocus();
        }
    }

    public final void b(int i, KeyEvent keyEvent, int i2) {
        View childAt;
        setSelection(i);
        super.onKeyDown(i2, keyEvent);
        int firstVisiblePosition = i - getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= getChildCount() || (childAt = getChildAt(firstVisiblePosition)) == null) {
            return;
        }
        childAt.requestFocus();
    }

    @Override // android.widget.AdapterView
    public final int getSelectedItemPosition() {
        int positionForView;
        View focusedChild = getFocusedChild();
        return (focusedChild == null || (positionForView = getPositionForView(focusedChild)) == -1) ? this.a : positionForView;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        int count = getCount();
        int i2 = 0;
        if (keyEvent.hasNoModifiers() && (i == 61 || i == 20)) {
            if (count == 0) {
                a(130);
                return true;
            }
            int selectedItemPosition = getSelectedItemPosition();
            int firstVisiblePosition = getFirstVisiblePosition();
            int i3 = count - 1;
            if (selectedItemPosition >= i3 && getLastVisiblePosition() >= i3) {
                a(130);
                return true;
            }
            if (selectedItemPosition >= firstVisiblePosition) {
                firstVisiblePosition = selectedItemPosition + 1;
            }
            if (i3 >= 0) {
                i2 = i3;
                i3 = 0;
            }
            if (firstVisiblePosition < i3) {
                firstVisiblePosition = i3;
            } else if (firstVisiblePosition > i2) {
                firstVisiblePosition = i2;
            }
            b(firstVisiblePosition, keyEvent, i);
            return true;
        }
        if ((!keyEvent.hasModifiers(1) || i != 61) && (!keyEvent.hasNoModifiers() || i != 19)) {
            return super.onKeyDown(i, keyEvent);
        }
        if (count == 0) {
            a(33);
            return true;
        }
        int selectedItemPosition2 = getSelectedItemPosition();
        int firstVisiblePosition2 = getFirstVisiblePosition();
        if (selectedItemPosition2 <= 0) {
            if (firstVisiblePosition2 <= 0) {
                a(33);
                return true;
            }
            selectedItemPosition2 = firstVisiblePosition2;
        }
        int i4 = selectedItemPosition2 - 1;
        int i5 = count - 1;
        if (i5 >= 0) {
            i2 = i5;
            i5 = 0;
        }
        if (i4 < i5) {
            i4 = i5;
        } else if (i4 > i2) {
            i4 = i2;
        }
        b(i4, keyEvent, i);
        return true;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public final void setSelection(int i) {
        this.a = i;
        super.setSelection(i);
    }
}
