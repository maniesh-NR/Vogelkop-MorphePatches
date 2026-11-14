package defpackage;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxzh;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "adapterClassName", "c", "responseId", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "getResponseExtras", "()Landroid/os/Bundle;", "responseExtras", "Lhq;", "d", "Lhq;", "getLoadedAdSourceResponseInfo", "()Lhq;", "loadedAdSourceResponseInfo", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "adSourceResponses", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class xzh {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("Mediation Adapter Class Name")
    private final String adapterClassName;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("Response ID")
    private final String responseId;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    @t2j("Response Extras")
    private final Bundle responseExtras;

    /* renamed from: d, reason: from kotlin metadata */
    @t2j("Loaded Ad Source Response Info")
    private final hq loadedAdSourceResponseInfo;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    @t2j("Ad Source Responses")
    private final List<hq> adSourceResponses;

    public xzh(String str, String str2, Bundle bundle, hq hqVar, List list) {
        this.adapterClassName = str;
        this.responseId = str2;
        this.responseExtras = bundle;
        this.loadedAdSourceResponseInfo = hqVar;
        this.adSourceResponses = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getAdSourceResponses() {
        return this.adSourceResponses;
    }

    /* renamed from: b, reason: from getter */
    public final String getAdapterClassName() {
        return this.adapterClassName;
    }

    /* renamed from: c, reason: from getter */
    public final String getResponseId() {
        return this.responseId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzh)) {
            return false;
        }
        xzh xzhVar = (xzh) obj;
        return Intrinsics.a(this.adapterClassName, xzhVar.adapterClassName) && Intrinsics.a(this.responseId, xzhVar.responseId) && Intrinsics.a(this.responseExtras, xzhVar.responseExtras) && Intrinsics.a(this.loadedAdSourceResponseInfo, xzhVar.loadedAdSourceResponseInfo) && Intrinsics.a(this.adSourceResponses, xzhVar.adSourceResponses);
    }

    public final int hashCode() {
        String str = this.adapterClassName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.responseId;
        int iHashCode2 = (this.responseExtras.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        hq hqVar = this.loadedAdSourceResponseInfo;
        return this.adSourceResponses.hashCode() + ((iHashCode2 + (hqVar != null ? hqVar.hashCode() : 0)) * 31);
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
