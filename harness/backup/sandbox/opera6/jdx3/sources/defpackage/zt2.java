package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaListItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zt2 extends i implements h4g {
    public final jt b;
    public final wth c;
    public final w4g d;
    public final int e;
    public Integer f;
    public String g;
    public String h;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public zt2(ViewGroup viewGroup, wth wthVar, w4g w4gVar) {
        Object objInflate = p37.U(viewGroup).inflate(2131558535, viewGroup, false);
        if (objInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        ?? r4 = (OperaListItem) objInflate;
        jt jtVar = new jt(r4, (byte) 2);
        super((View) r4);
        this.b = jtVar;
        this.c = wthVar;
        this.d = w4gVar;
        int i = vmj.g;
        this.e = tmj.i(((i) this).itemView.getContext());
    }

    @Override // defpackage.h4g
    public final boolean P(int i, String str) {
        Integer num = this.f;
        return num != null && i == num.intValue() && Intrinsics.a(str, this.g);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.h4g
    public final void s() {
        int i = vmj.g;
        ?? r0 = this.b.b;
        Context context = r0.getContext();
        String str = this.h;
        if (str == null) {
            str = this.g;
        }
        if (str == null) {
            str = "";
        }
        r0.z(new mxh(tmj.m(context, str, 0, 0, null, 60)));
    }

    @Override // defpackage.h4g
    public final void w(Bitmap bitmap) {
        int i = this.e;
        Context context = ((i) this).itemView.getContext();
        PathInterpolator pathInterpolator = s8i.d;
        p8i p8iVar = new p8i(i, i / 2, context, bitmap);
        p8iVar.a(f03.s(((i) this).itemView.getContext()));
        this.b.b.z(new mxh(p8iVar));
    }
}
