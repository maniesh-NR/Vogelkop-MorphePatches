package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public interface osc {
    void d(rsc rscVar, long j, long j2, boolean z);

    void i(rsc rscVar, long j, long j2);

    default void r(rsc rscVar, long j, long j2, int i) {
    }

    psc u(rsc rscVar, long j, long j2, IOException iOException, int i);
}
