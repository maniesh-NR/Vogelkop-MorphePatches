package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class klf implements kr9 {
    @Override // defpackage.kr9
    public final br9 a() {
        return new nr9(1, mlf.g, llf.class, "shouldReportJobStopEvent", "shouldReportJobStopEvent(Landroid/app/job/JobParameters;)Z", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof klf) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
