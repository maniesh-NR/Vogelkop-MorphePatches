package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public interface vg3 {
    ListenableFuture a(Uri uri);

    default ListenableFuture f(vjd vjdVar) {
        byte[] bArr = vjdVar.k;
        if (bArr != null) {
            return m(bArr);
        }
        Uri uri = vjdVar.m;
        if (uri != null) {
            return a(uri);
        }
        return null;
    }

    ListenableFuture m(byte[] bArr);
}
