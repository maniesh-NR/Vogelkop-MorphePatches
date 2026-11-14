package defpackage;

import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class nll {
    public final ThemeableLottieAnimationView b;
    public final i7f a = new i7f();
    public byte c = 0;

    public nll(ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.b = themeableLottieAnimationView;
    }

    public final void a() {
        ((n2d) this.b).k.remove(this);
        this.c = (byte) 2;
        i7f i7fVar = this.a;
        g7f g7fVar = new g7f(i7fVar);
        while (g7fVar.hasNext()) {
            ((oll) g7fVar.next()).a();
        }
        i7fVar.clear();
    }
}
