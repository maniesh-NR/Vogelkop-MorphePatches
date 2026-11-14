package defpackage;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001e"}, d2 = {"Lhq;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "adapterClassName", "", "J", "g", "()J", "latencyMillis", "Lnsd;", "c", "Lnsd;", "()Lnsd;", "adError", "Landroid/os/Bundle;", "d", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "credentials", "e", "h", "name", "f", "id", "instanceName", "instanceId", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class hq {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("Adapter")
    private final String adapterClassName;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("Latency")
    private final long latencyMillis;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("Error")
    private final nsd adError;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    @t2j("Credentials")
    private final Bundle credentials;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    @t2j("Ad Source Name")
    private final String name;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    @t2j("Ad Source ID")
    private final String id;

    /* renamed from: g, reason: from kotlin metadata */
    @NotNull
    @t2j("Ad Source Instance Name")
    private final String instanceName;

    /* renamed from: h, reason: from kotlin metadata */
    @NotNull
    @t2j("Ad Source Instance ID")
    private final String instanceId;

    public hq(String str, long j, nsd nsdVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.adapterClassName = str;
        this.latencyMillis = j;
        this.adError = nsdVar;
        this.credentials = bundle;
        this.name = str2;
        this.id = str3;
        this.instanceName = str4;
        this.instanceId = str5;
    }

    /* renamed from: a, reason: from getter */
    public final nsd getAdError() {
        return this.adError;
    }

    /* renamed from: b, reason: from getter */
    public final String getAdapterClassName() {
        return this.adapterClassName;
    }

    /* renamed from: c, reason: from getter */
    public final Bundle getCredentials() {
        return this.credentials;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq)) {
            return false;
        }
        hq hqVar = (hq) obj;
        return Intrinsics.a(this.adapterClassName, hqVar.adapterClassName) && this.latencyMillis == hqVar.latencyMillis && Intrinsics.a(this.adError, hqVar.adError) && Intrinsics.a(this.credentials, hqVar.credentials) && Intrinsics.a(this.name, hqVar.name) && Intrinsics.a(this.id, hqVar.id) && Intrinsics.a(this.instanceName, hqVar.instanceName) && Intrinsics.a(this.instanceId, hqVar.instanceId);
    }

    /* renamed from: f, reason: from getter */
    public final String getInstanceName() {
        return this.instanceName;
    }

    /* renamed from: g, reason: from getter */
    public final long getLatencyMillis() {
        return this.latencyMillis;
    }

    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iE = z1m.e(this.adapterClassName.hashCode() * 31, 31, this.latencyMillis);
        nsd nsdVar = this.adError;
        return this.instanceId.hashCode() + dgh.a(this.instanceName, dgh.a(this.id, dgh.a(this.name, (this.credentials.hashCode() + ((iE + (nsdVar == null ? 0 : nsdVar.hashCode())) * 31)) * 31)));
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
