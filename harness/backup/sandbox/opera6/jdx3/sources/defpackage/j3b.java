package defpackage;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class j3b extends FrameLayout {
    public final dll a;
    public final or2 b;
    public int c;
    public final i3b d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [i3b] */
    public j3b(final l2b l2bVar, dll dllVar) {
        super(l2bVar, null, 0, 0);
        this.a = dllVar;
        LayoutInflater.from(l2bVar).inflate(2131558937, this);
        int i = 2131362034;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362034, this);
        if (themeableLottieAnimationView != null) {
            i = 2131362414;
            if (w1h.j(2131362414, this) != null) {
                i = 2131362432;
                MaterialButton materialButtonJ = w1h.j(2131362432, this);
                if (materialButtonJ != null) {
                    i = 2131363197;
                    if (w1h.j(2131363197, this) != null) {
                        i = 2131363509;
                        TextView textView = (TextView) w1h.j(2131363509, this);
                        if (textView != null) {
                            i = 2131363525;
                            TextView textView2 = (TextView) w1h.j(2131363525, this);
                            if (textView2 != null) {
                                this.b = new or2(this, themeableLottieAnimationView, materialButtonJ, textView, textView2, (byte) 12);
                                this.d = new cll() { // from class: i3b
                                    @Override // defpackage.cll
                                    public final void K() {
                                        j3b j3bVar = this.a;
                                        ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) j3bVar.b.d;
                                        float fB = ((n2d) themeableLottieAnimationView2).d.b.b();
                                        themeableLottieAnimationView2.j(f03.E(j3bVar.c, l2bVar, 0));
                                        themeableLottieAnimationView2.h();
                                        themeableLottieAnimationView2.o(fB, true);
                                    }
                                };
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(int i) {
        this.c = i;
        ((ThemeableLottieAnimationView) this.b.d).j(f03.E(i, getContext(), 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.F(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.H(this.d);
    }
}
