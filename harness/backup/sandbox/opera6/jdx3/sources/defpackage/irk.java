package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class irk implements spm {
    public boolean a;
    public String b = "";
    public final /* synthetic */ mrk c;

    public irk(mrk mrkVar) {
        this.c = mrkVar;
    }

    public final void a(CharSequence charSequence) {
        mrk mrkVar = this.c;
        xpm xpmVar = mrkVar.H;
        if (xpmVar.a.s()) {
            charSequence = xpmVar.a.r();
        }
        String string = charSequence.toString();
        if (Intrinsics.a(this.b, string)) {
            return;
        }
        this.b = string;
        if (!mrkVar.R) {
            mrkVar.S = null;
        }
        if (mrkVar.c()) {
            if (!((Boolean) xpmVar.c.g()).booleanValue() || mrkVar.v.O()) {
                this.a = true;
                mrkVar.i(string);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            mrk mrkVar = this.c;
            mrkVar.b.post(new br((Object) mrkVar, i2, (byte) 24));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean c(int i, KeyEvent keyEvent) {
        mrk mrkVar = this.c;
        if (mrkVar.d()) {
            if (fr3.H(0, keyEvent)) {
                if (i == 19) {
                    b(keyEvent.getAction(), 1);
                    return true;
                }
                if (i == 20) {
                    b(keyEvent.getAction(), 2);
                    return true;
                }
                if (i == 61) {
                    b(keyEvent.getAction(), 4);
                    return true;
                }
            } else if (fr3.H(4, keyEvent) && i == 61) {
                b(keyEvent.getAction(), 3);
                return true;
            }
        } else if (fr3.H(0, keyEvent) && (i == 19 || i == 20)) {
            mrkVar.f();
            mrkVar.h(null);
            return true;
        }
        return false;
    }

    public final void d(int i, int i2) {
    }

    public final void e() {
        c1f c1fVar = this.c.P;
        if (c1fVar != null) {
            c1fVar.b();
        }
    }

    public final void f(boolean z) {
    }

    public final void g() {
        a(this.c.H.a.r());
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c.T) {
            return;
        }
        a(charSequence);
    }
}
