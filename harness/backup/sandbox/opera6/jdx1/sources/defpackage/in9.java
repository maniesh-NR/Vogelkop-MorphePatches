package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class in9 implements x2m {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public in9(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.x2m
    public final void a() {
    }

    @Override // defpackage.x2m
    public final void c() {
    }

    @Override // defpackage.x2m
    public final void d(y2m y2mVar) {
    }

    @Override // defpackage.x2m
    public final void e(y2m y2mVar) {
        y2mVar.C(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.x2m
    public final void f(y2m y2mVar) {
        y2mVar.C(this);
        y2mVar.b(this);
    }
}
