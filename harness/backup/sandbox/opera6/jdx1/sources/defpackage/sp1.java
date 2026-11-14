package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class sp1 implements Window.Callback {
    public final Window.Callback a;
    public bxk b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ xp1 f;

    public sp1(xp1 xp1Var, Window.Callback callback) {
        this.f = xp1Var;
        if (callback != null) {
            this.a = callback;
        } else {
            qp2.o("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            xp1 xp1Var = this.f;
            xp1Var.B();
            gc gcVar = xp1Var.o;
            if (gcVar == null || !gcVar.j(keyCode, keyEvent)) {
                wp1 wp1Var = xp1Var.L;
                if (wp1Var == null || !xp1Var.G(wp1Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (xp1Var.L == null) {
                        wp1 wp1VarA = xp1Var.A(0);
                        xp1Var.H(wp1VarA, keyEvent);
                        boolean zG = xp1Var.G(wp1VarA, keyEvent.getKeyCode(), keyEvent);
                        wp1VarA.k = false;
                        if (!zG) {
                        }
                    }
                    return false;
                }
                wp1 wp1Var2 = xp1Var.L;
                if (wp1Var2 != null) {
                    wp1Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof itd)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        bxk bxkVar = this.b;
        if (bxkVar != null) {
            View view = i == 0 ? new View(((usl) bxkVar.b).a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            xp1 xp1Var = this.f;
            xp1Var.B();
            gc gcVar = xp1Var.o;
            if (gcVar != null) {
                gcVar.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        xp1 xp1Var = this.f;
        if (i == 108) {
            xp1Var.B();
            gc gcVar = xp1Var.o;
            if (gcVar != null) {
                gcVar.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            wp1 wp1VarA = xp1Var.A(i);
            if (wp1VarA.m) {
                xp1Var.r(wp1VarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.a.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        itd itdVar = menu instanceof itd ? (itd) menu : null;
        if (i == 0 && itdVar == null) {
            return false;
        }
        if (itdVar != null) {
            itdVar.y = true;
        }
        bxk bxkVar = this.b;
        if (bxkVar != null && i == 0) {
            usl uslVar = (usl) bxkVar.b;
            if (!uslVar.d) {
                uslVar.a.l = true;
                uslVar.d = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (itdVar != null) {
            itdVar.y = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        itd itdVar = this.f.A(0).h;
        if (itdVar != null) {
            d(list, itdVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return this.a.onWindowStartingActionMode(callback, i);
        }
        xp1 xp1Var = this.f;
        re wjjVar = new wjj(xp1Var.k, callback);
        se seVarL = xp1Var.l(wjjVar);
        if (seVarL != null) {
            return wjjVar.e(seVarL);
        }
        return null;
    }
}
