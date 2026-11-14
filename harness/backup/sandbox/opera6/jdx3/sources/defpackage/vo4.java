package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* loaded from: classes.dex */
public final class vo4 implements RemoteMediaClient.ProgressListener {
    public final /* synthetic */ zo4 a;

    public vo4(zo4 zo4Var) {
        this.a = zo4Var;
    }

    public final void onProgressUpdated(long j, long j2) {
        zo4 zo4Var = this.a;
        if (zo4Var.L || zo4Var.y0(new t14((byte) 27))) {
            return;
        }
        if (j > 0) {
            zo4Var.K = false;
        }
        zo4Var.s = j;
        if (j2 < 0) {
            j2 = -9223372036854775807L;
        }
        zo4Var.E = j2;
    }
}
