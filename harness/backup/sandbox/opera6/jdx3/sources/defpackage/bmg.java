package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class bmg {
    public final ki a;
    public final zyk b = z4c.b(new kof((byte) 23));

    public bmg(ki kiVar) {
        this.a = kiVar;
    }

    public final void a(Context context, String str, String str2, String str3, String str4, String str5, List list, f90 f90Var) {
        deg degVar = (deg) this.b.getValue();
        String str6 = (String) CollectionsKt.firstOrNull(list);
        Uri uri = str6 == null ? null : Uri.parse(str6);
        int iH = z7h.h(context, 128.0f);
        dwh dwhVarG = degVar.g(uri);
        dwhVarG.b.b(iH, iH);
        dwhVarG.c(Bitmap.Config.RGB_565);
        dwhVarG.b();
        dwhVarG.j();
        dwhVarG.f(new phi(new ue9(this, str, str2, str3, str4, str5, list, f90Var)));
    }
}
