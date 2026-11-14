package defpackage;

import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lyrc;", "Lc09;", "Lxrc;", "W", "Lxrc;", "E", "()Lxrc;", "code", "", "X", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "message", "Lxzh;", "Y", "Lxzh;", "getResponseInfo", "()Lxzh;", "responseInfo", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class yrc extends c09 {

    /* renamed from: W, reason: from kotlin metadata */
    @NotNull
    @t2j("Code")
    private final xrc code;

    /* renamed from: X, reason: from kotlin metadata */
    @NotNull
    @t2j("Message")
    private final String message;

    /* renamed from: Y, reason: from kotlin metadata */
    @t2j("Response Info")
    private final xzh responseInfo;

    public yrc(xrc xrcVar, String str, xzh xzhVar) {
        this.code = xrcVar;
        this.message = str;
        this.responseInfo = xzhVar;
    }

    /* renamed from: E, reason: from getter */
    public final xrc getCode() {
        return this.code;
    }

    /* renamed from: F, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrc)) {
            return false;
        }
        yrc yrcVar = (yrc) obj;
        return this.code == yrcVar.code && Intrinsics.a(this.message, yrcVar.message) && Intrinsics.a(this.responseInfo, yrcVar.responseInfo);
    }

    public final int hashCode() {
        int iA = dgh.a(this.message, this.code.hashCode() * 31);
        xzh xzhVar = this.responseInfo;
        return iA + (xzhVar == null ? 0 : xzhVar.hashCode());
    }

    public final String toString() {
        bg8 bg8Var = bg8.c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        sj9 sj9Var = m5a.m;
        int i = m5a.o;
        int i2 = m5a.p;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayList.add(new AndroidBundleTypeAdapterFactory());
        wrc wrcVar = new wrc();
        eam eamVar = new eam(xrc.class);
        arrayList.add(new a6m(wrcVar, eamVar, eamVar.b == eamVar.a));
        sj9 sj9Var2 = sj9.e;
        Objects.requireNonNull(sj9Var2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = g2k.a;
        return new m5a(bg8Var, 1, new HashMap(map), true, sj9Var2, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, i, i2, new ArrayList(arrayDeque)).g(this);
    }
}
