package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.feed.FeedScrollViewContentWrapper;

/* loaded from: classes.dex */
public final class b5k implements View.OnLayoutChangeListener, ile {
    public final a5k a = new a5k(this, (byte) 0);
    public final a5k b = new a5k(this, (byte) 1);
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ c5k f;

    public b5k(c5k c5kVar) {
        this.f = c5kVar;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            FeedScrollView feedScrollView = this.f.l;
            if (feedScrollView.S || feedScrollView.R > 0) {
                b();
            }
        }
    }

    public final void b() {
        this.d = false;
        this.e = false;
        if (this.c) {
            this.c = false;
            c5k c5kVar = this.f;
            c5kVar.p.removeOnLayoutChangeListener(this);
            c5kVar.l.D.c(this);
            vml.a(this.a);
            vml.a(this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.opera.android.feed.FeedScrollView] */
    public final void c() {
        xw8 xw8VarB;
        c5k c5kVar = this.f;
        FeedScrollViewContentWrapper feedScrollViewContentWrapper = c5kVar.p;
        ?? r2 = c5kVar.l;
        this.d = false;
        if (this.c) {
            a5k a5kVar = this.b;
            vml.a(a5kVar);
            vml.d(a5kVar, 50L);
            if (feedScrollViewContentWrapper.e) {
                if (r2.getScrollY() >= feedScrollViewContentWrapper.getMeasuredHeight() - ((r2.getHeight() - r2.getPaddingTop()) - r2.getPaddingBottom())) {
                    boolean z = this.e;
                    b();
                    if (!z || (xw8VarB = c5kVar.b()) == null) {
                        return;
                    }
                    xw8VarB.g();
                    return;
                }
            }
            if (c5kVar.r.getVisibility() == 0 && r2.canScrollVertically(1)) {
                this.e = true;
                c5kVar.f();
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d) {
            return;
        }
        this.d = true;
        vml.c(new a5k(this, (byte) 1));
    }
}
