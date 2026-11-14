package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx0g;", "", "", "", "a", "Ljava/util/List;", "noFillUrls", "", "b", "J", "refreshIntervalInSeconds", "c", "Ljava/lang/String;", "gwsQueryId", "Lprb;", "d", "Lprb;", "responseInfoExtras", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class x0g {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("nofill_urls")
    public final List<String> noFillUrls;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("refresh_interval")
    public final long refreshIntervalInSeconds;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    @t2j("gws_query_id")
    public final String gwsQueryId;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    @t2j("response_info_extras")
    public final prb responseInfoExtras;

    public x0g(ArrayList arrayList, long j, String str, prb prbVar) {
        this.noFillUrls = arrayList;
        this.refreshIntervalInSeconds = j;
        this.gwsQueryId = str;
        this.responseInfoExtras = prbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0g)) {
            return false;
        }
        x0g x0gVar = (x0g) obj;
        return Intrinsics.a(this.noFillUrls, x0gVar.noFillUrls) && this.refreshIntervalInSeconds == x0gVar.refreshIntervalInSeconds && Intrinsics.a(this.gwsQueryId, x0gVar.gwsQueryId) && Intrinsics.a(this.responseInfoExtras, x0gVar.responseInfoExtras);
    }

    public final int hashCode() {
        return this.responseInfoExtras.a.hashCode() + dgh.a(this.gwsQueryId, z1m.e(this.noFillUrls.hashCode() * 31, 31, this.refreshIntervalInSeconds));
    }

    public final String toString() {
        return "ParentCommonConfig(noFillUrls=" + this.noFillUrls + ", refreshIntervalInSeconds=" + this.refreshIntervalInSeconds + ", gwsQueryId=" + this.gwsQueryId + ", responseInfoExtras=" + this.responseInfoExtras + ")";
    }
}
