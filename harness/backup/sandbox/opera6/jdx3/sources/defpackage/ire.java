package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ire extends msh {
    public final List D;
    public final List E;

    /* JADX WARN: Illegal instructions before constructor call */
    public ire(String str, String str2, String str3, Uri uri, Uri uri2, long j, long j2, String str4, String str5, int i, int i2, int i3, ArrayList arrayList, String str6, ArrayList arrayList2, ArrayList arrayList3, p12 p12Var, List list, List list2, String str7, qre qreVar, xlg xlgVar) {
        Uri uri3 = (Uri) arrayList2.get(0);
        Uri uri4 = Uri.EMPTY;
        super(str, str2, str3, uri3, 4, uri4, uri4, uri, uri2, j, j2, str4, str5, i, i2, i3, arrayList, str6, p12Var, list, list2, str7, qreVar, xlgVar, null);
        this.D = Collections.unmodifiableList(arrayList2);
        this.E = Collections.unmodifiableList(arrayList3);
    }
}
