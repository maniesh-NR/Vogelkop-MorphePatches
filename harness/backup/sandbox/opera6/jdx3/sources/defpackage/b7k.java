package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class b7k implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final Object c;

    public /* synthetic */ b7k(byte b, View view, Object obj) {
        this.a = b;
        this.b = view;
        this.c = obj;
    }

    public b7k(ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, TextSwitcher textSwitcher) {
        this.a = (byte) 2;
        this.b = constraintLayout;
        this.c = textSwitcher;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
        }
        return (FrameLayout) constraintLayout;
    }
}
