package com.opera.android.downloads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.OperaApplication;
import com.opera.android.widget.SnapToTopLinearLayoutManager;
import defpackage.p12;
import defpackage.tjg;
import defpackage.ug7;
import defpackage.uld;
import defpackage.we7;
import defpackage.xbf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DownloadsPanel extends FrameLayout {
    public RecyclerView a;
    public p12 b;
    public ug7 c;
    public ViewGroup d;

    public DownloadsPanel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        xbf xbfVar = ((OperaApplication) context.getApplicationContext()).x().o;
        p12 p12Var = xbfVar != null ? (p12) xbfVar.f : null;
        this.b = p12Var;
        if (p12Var != null) {
            ug7 ug7Var = this.c;
            ViewGroup viewGroup = this.d;
            xbf xbfVar2 = (xbf) p12Var.a;
            boolean z = ((ViewGroup) p12Var.b) != null;
            if (z) {
                p12Var.j();
            }
            p12Var.e = ug7Var;
            p12Var.b = viewGroup;
            if (!z) {
                ((we7) p12Var.g).a(xbfVar2);
                ((tjg) xbfVar2.b).F((uld) p12Var.f);
            }
            p12Var.B(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p12 p12Var = this.b;
        if (p12Var != null) {
            ViewGroup viewGroup = this.d;
            xbf xbfVar = (xbf) p12Var.a;
            if (((ViewGroup) p12Var.b) == viewGroup) {
                p12Var.j();
                ((tjg) xbfVar.b).H((uld) p12Var.f);
                ((we7) p12Var.g).b(xbfVar);
                p12Var.b = null;
                p12Var.e = null;
            }
            this.b = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerViewFindViewById = findViewById(2131362615);
        this.a = recyclerViewFindViewById;
        recyclerViewFindViewById.t = true;
        getContext();
        recyclerViewFindViewById.C0(new SnapToTopLinearLayoutManager());
        xr6 xr6Var = new xr6();
        xr6Var.g = false;
        this.a.B0(xr6Var);
        WeakHashMap weakHashMap = r5n.a;
        this.d = (ViewGroup) ((View) m5n.f(this, 2131363522));
    }
}
