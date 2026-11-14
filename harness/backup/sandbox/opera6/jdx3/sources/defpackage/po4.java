package defpackage;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class po4 implements ResultCallback {
    public final /* synthetic */ zo4 a;

    public /* synthetic */ po4(zo4 zo4Var) {
        this.a = zo4Var;
    }

    public final void onResult(Result result) {
        MediaError mediaError;
        RemoteMediaClient.MediaChannelResult mediaChannelResult = (RemoteMediaClient.MediaChannelResult) result;
        zo4 zo4Var = this.a;
        wo4 wo4Var = zo4Var.q;
        if (wo4Var != null) {
            if (wo4Var.a == 3 && !mediaChannelResult.getStatus().isSuccess() && (mediaError = mediaChannelResult.getMediaError()) != null) {
                zo4Var.C0(mediaError);
            }
            if (zo4Var.q.a == 11) {
                zo4Var.L = true;
            }
            zo4Var.q = null;
            if (zo4Var.v != null) {
                while (true) {
                    yo4 yo4Var = (yo4) zo4Var.n.pollFirst();
                    if (yo4Var == null) {
                        break;
                    }
                    byte b = yo4Var.a;
                    PendingResult pendingResultM = yo4Var.b.m(zo4Var.v);
                    if (pendingResultM != null) {
                        zo4Var.q = new wo4(b, pendingResultM);
                        pendingResultM.setResultCallback(new po4(zo4Var));
                        break;
                    }
                }
                if (zo4Var.N0()) {
                    zo4Var.Q0(false);
                }
                MediaStatus mediaStatus = zo4Var.v.getMediaStatus();
                if (mediaStatus != null) {
                    zo4Var.M0(mediaStatus);
                    zo4Var.O0(mediaStatus);
                }
            }
        }
    }
}
