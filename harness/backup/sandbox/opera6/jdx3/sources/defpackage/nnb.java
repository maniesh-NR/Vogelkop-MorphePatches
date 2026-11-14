package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class nnb extends fnb {
    public final HttpURLConnection i;
    public final AtomicBoolean j;
    public WritableByteChannel k;
    public OutputStream l;
    public final /* synthetic */ pnb m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnb(pnb pnbVar, Executor executor, onb onbVar, HttpURLConnection httpURLConnection, tom tomVar) {
        super(executor, onbVar, tomVar);
        this.m = pnbVar;
        this.j = new AtomicBoolean(false);
        this.i = httpURLConnection;
    }

    @Override // defpackage.fnb
    public final void c(Exception exc) {
        this.m.b(new s21("Exception received from UploadDataProvider", exc));
    }
}
