package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class qo4 implements xo4, OnSuccessListener, op5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qo4(Object obj, int i, Object obj2, Object obj3) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ qo4(ro9 ro9Var, bsc bscVar, tjd tjdVar, int i) {
        this.b = ro9Var;
        this.c = bscVar;
        this.d = tjdVar;
        this.a = i;
    }

    public final void accept(Object obj) {
        ro9 ro9Var = (ro9) this.b;
        ((prd) obj).t(ro9Var.b, (jrd) ro9Var.c, (bsc) this.c, (tjd) this.d, this.a);
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        int iL;
        zo4 zo4Var = (zo4) this.b;
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.d;
        int i = this.a;
        int[] iArrCopyOf = new int[i];
        Arrays.fill(iArrCopyOf, 0);
        for (int i2 = 0; i2 < i; i2++) {
            int iL2 = sgb.L(i2, 0, iArr.length, iArr);
            if (iL2 < zo4Var.l.length && (iL = sgb.L(i2, 0, iArr2.length, iArr2)) < i) {
                iArrCopyOf[iL] = zo4Var.l[iL2];
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (iArrCopyOf[i3] == 0) {
                int i4 = 1;
                for (int i5 = i3 + 1; i5 < i; i5++) {
                    int i6 = iArrCopyOf[i5];
                    if (i6 == 0) {
                        i4++;
                    } else {
                        iArrCopyOf[i5 - i4] = i6;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i - i4);
            } else {
                i3++;
            }
        }
        if (Arrays.equals(zo4Var.l, iArrCopyOf)) {
            return null;
        }
        return remoteMediaClient.queueReorderItems(iArrCopyOf, 0, (JSONObject) null);
    }

    public final void onSuccess(Object obj) {
        zzb zzbVar = (zzb) this.b;
        tzb tzbVar = (tzb) this.c;
        r0k r0kVar = (r0k) this.d;
        Integer num = (Integer) obj;
        int i = zzbVar.d;
        a0c a0cVar = zzbVar.e;
        int i2 = this.a;
        if (i != i2) {
            return;
        }
        a0cVar.u = tzbVar.a;
        a0cVar.t = u85.d(a0cVar.requireContext(), r0kVar, num.intValue(), new z8e(a0cVar, (byte) 1), a0cVar, a0cVar.s, new zr9((Object) zzbVar, (Object) tzbVar, (byte) 16), new lt2(zzbVar, i2, tzbVar, (byte) 3));
    }
}
