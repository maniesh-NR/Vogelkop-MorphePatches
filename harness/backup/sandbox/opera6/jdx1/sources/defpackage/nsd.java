package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lnsd;", "Lc09;", "", "W", "I", "E", "()Ljava/lang/Integer;", "code", "", "X", "Ljava/lang/String;", "G", "()Ljava/lang/String;", "message", "Y", "F", "domain", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class nsd extends c09 {

    /* renamed from: W, reason: from kotlin metadata */
    @t2j("Code")
    private final int code;

    /* renamed from: X, reason: from kotlin metadata */
    @NotNull
    @t2j("Message")
    private final String message;

    /* renamed from: Y, reason: from kotlin metadata */
    @NotNull
    @t2j("Domain")
    private final String domain;

    public nsd(int i, String str, String str2) {
        this.code = i;
        this.message = str;
        this.domain = str2;
    }

    public final Integer E() {
        return Integer.valueOf(this.code);
    }

    /* renamed from: F, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* renamed from: G, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsd)) {
            return false;
        }
        nsd nsdVar = (nsd) obj;
        return this.code == nsdVar.code && Intrinsics.a(this.message, nsdVar.message) && Intrinsics.a(this.domain, nsdVar.domain);
    }

    public final int hashCode() {
        return this.domain.hashCode() + dgh.a(this.message, Integer.hashCode(this.code) * 31);
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
