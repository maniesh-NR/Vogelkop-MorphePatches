package defpackage;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final /* synthetic */ class h2d implements j3d {
    @Override // defpackage.j3d
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        f30 f30Var = dzm.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            izc.c("Unable to load composition.");
        } else {
            h9o.m("Unable to parse composition", th);
        }
    }
}
