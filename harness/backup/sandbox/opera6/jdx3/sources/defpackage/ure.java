package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ure extends msh {
    public final List D;
    public final long E;
    public final long F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final Uri K;
    public final int L;
    public final w9h M;

    public ure(String str, String str2, String str3, Uri uri, Uri uri2, Uri uri3, long j, long j2, String str4, String str5, int i, int i2, int i3, ArrayList arrayList, String str6, ArrayList arrayList2, long j3, long j4, int i4, int i5, int i6, int i7, Uri uri4, int i8, w9h w9hVar, p12 p12Var, List list, List list2, String str7, qre qreVar) {
        super(str, str2, str3, (Uri) arrayList2.get(0), 4, Uri.EMPTY, uri, uri2, uri3, j, j2, str4, str5, i, i2, i3, arrayList, str6, p12Var, list, list2, str7, qreVar, null, null);
        this.D = Collections.unmodifiableList(arrayList2);
        this.E = j3;
        this.F = j4;
        this.G = i4;
        this.H = i5;
        this.I = i6;
        this.J = i7;
        this.K = uri4;
        this.L = i8;
        this.M = w9hVar;
        if (w9hVar != null) {
            w9hVar.j.b = qreVar.b == null ? 1 : 2;
        }
    }
}
