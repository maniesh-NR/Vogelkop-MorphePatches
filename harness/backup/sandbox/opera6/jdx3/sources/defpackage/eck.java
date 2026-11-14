package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class eck implements fck {
    public final /* synthetic */ View a;
    public final /* synthetic */ dxh b;
    public final /* synthetic */ View c;
    public final /* synthetic */ dxh d;

    public eck(View view, dxh dxhVar, View view2, dxh dxhVar2) {
        this.a = view;
        this.b = dxhVar;
        this.c = view2;
        this.d = dxhVar2;
    }

    @Override // defpackage.fck
    public final int a() {
        return this.d.a(this.c.getContext());
    }

    @Override // defpackage.fck
    public final int b() {
        return this.b.a(this.c.getContext());
    }

    @Override // defpackage.fck
    public final View getView() {
        return this.a;
    }
}
