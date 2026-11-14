package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class jo4 implements xo4, did {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jo4(int i, int i2, int i3, Object obj) {
        this.d = obj;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void c(ssa ssaVar, int i) {
        gid gidVar = (gid) this.d;
        ssaVar.U(gidVar.c, i, this.a, this.b, this.c);
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        zo4 zo4Var = (zo4) this.d;
        int iMin = Math.min(this.a, zo4Var.l.length);
        int iMin2 = Math.min(this.b, zo4Var.l.length) - iMin;
        if (iMin2 == 0) {
            return null;
        }
        int i = this.c;
        if (iMin2 == 1) {
            return remoteMediaClient.queueMoveItemToNewIndex(zo4Var.l[iMin], i, (JSONObject) null);
        }
        int[] iArr = new int[iMin2];
        int i2 = 0;
        System.arraycopy(zo4Var.l, iMin, iArr, 0, iMin2);
        int[] iArr2 = zo4Var.l;
        if (i < iMin) {
            i2 = iArr2[i];
        } else if (i < iArr2.length) {
            i2 = iArr2[i + iMin2];
        }
        return remoteMediaClient.queueReorderItems(iArr, i2, (JSONObject) null);
    }
}
