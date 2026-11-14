package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class dqh implements View.OnLayoutChangeListener {
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ u5l f;

    public dqh(RecyclerView recyclerView, int i, int i2, int i3, int i4, u5l u5lVar) {
        this.a = recyclerView;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = u5lVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        final RecyclerView recyclerView = this.a;
        final int i9 = this.b;
        final int i10 = this.c;
        final int i11 = this.d;
        final int i12 = this.e;
        final u5l u5lVar = this.f;
        recyclerView.postOnAnimation(new Runnable() { // from class: cqh
            @Override // java.lang.Runnable
            public final void run() {
                exg.y(recyclerView, i9, i10, i11, i12, u5lVar, false);
            }
        });
    }
}
