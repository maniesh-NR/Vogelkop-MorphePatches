package defpackage;

import com.google.android.gms.common.api.OptionalModuleApi;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface s33 extends OptionalModuleApi, Closeable, mdc {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @ucf(occ.ON_DESTROY)
    void close();
}
