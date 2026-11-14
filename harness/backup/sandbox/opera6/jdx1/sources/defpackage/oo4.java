package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class oo4 implements xo4, fjc, did, tqd, vqd, op5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oo4(int i, long j, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ oo4(d11 d11Var, int i, long j, long j2) {
        this.c = d11Var;
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ oo4(wnk wnkVar, long j, int i) {
        this.c = wnkVar;
        this.b = j;
        this.a = i;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        wnk wnkVar = (wnk) this.c;
        a46 a46Var = (a46) obj;
        wnkVar.h.getClass();
        byte[] bArrC = ir5.c(a46Var.a, a46Var.c);
        g1g g1gVar = wnkVar.c;
        g1gVar.L(bArrC, bArrC.length);
        wnkVar.a.f(bArrC.length, g1gVar);
        long j = a46Var.b;
        oj9 oj9Var = wnkVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            z4o.H(oj9Var.s == Long.MAX_VALUE);
        } else {
            long j3 = oj9Var.s;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        wnkVar.a.a(j2, this.a | 1, bArrC.length, 0, null);
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        gid gidVar = (gid) this.c;
        ssaVar.q0(gidVar.c, i, this.a, this.b);
    }

    public final void h(xkg xkgVar, nod nodVar) {
        xqd xqdVar = (xqd) this.c;
        xkgVar.seekTo(xqdVar.T0(nodVar, xkgVar, this.a), this.b);
    }

    public final void invoke(Object obj) {
        d11 d11Var = (d11) this.c;
        dkd dkdVar = (dkd) ((e11) obj);
        HashMap map = dkdVar.h;
        HashMap map2 = dkdVar.i;
        jrd jrdVar = d11Var.d;
        if (jrdVar != null) {
            String strC = dkdVar.c.c(d11Var.b, jrdVar);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.b));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + this.a));
        }
    }

    @Override // defpackage.vqd
    public final Object l(npd npdVar, nod nodVar, int i) {
        long currentPosition;
        csh cshVar = (csh) this.c;
        int iF0 = this.a;
        if (iF0 == -1) {
            iF0 = npdVar.t.f0();
            currentPosition = npdVar.t.getCurrentPosition();
        } else {
            currentPosition = this.b;
        }
        return npdVar.p(nodVar, cshVar, iF0, currentPosition);
    }

    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        int[] iArr = ((zo4) this.c).l;
        int length = iArr.length;
        int i = this.a;
        return remoteMediaClient.queueJumpToItem(i < length ? iArr[i] : 0, this.b, (JSONObject) null);
    }
}
