package defpackage;

import android.content.ContentResolver;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.zzbs;
import com.google.ads.interactivemedia.v3.internal.zzsf;
import com.leanplum.internal.Clock;
import com.opera.api.Callback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class qsh implements hrl, f94, zun, cco, zzsf {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public qsh(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                is7 is7Var = new is7();
                this.b = is7Var;
                this.c = new u7k(is7Var);
                break;
        }
    }

    public /* synthetic */ qsh(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public qsh(dpj dpjVar, n9h n9hVar) {
        this.a = (byte) 8;
        this.b = n9hVar;
        Objects.requireNonNull(dpjVar);
        this.c = dpjVar;
    }

    public qsh(grl grlVar) {
        this.a = (byte) 7;
        this.b = new Handler();
        this.c = grlVar;
    }

    public /* synthetic */ qsh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qsh(String str, ArrayList arrayList) {
        this.a = (byte) 1;
        this.b = str;
        this.c = h1b.s(arrayList);
    }

    public qsh(stm stmVar, s9i s9iVar) {
        this.a = (byte) 0;
        this.b = s9iVar;
        this.c = new c6j(stmVar, true);
    }

    public qsh(tcc tccVar, eoj eojVar, k6l k6lVar) {
        this.a = (byte) 2;
        this.b = eojVar;
        this.c = k6lVar;
        aib.C(k6lVar, tccVar, new goj(this));
        vml.d(new foj(this, (byte) 0), 1000L);
    }

    @Override // defpackage.zun
    public final void F(tun tunVar) {
        wun wunVar = (wun) this.c;
        ArrayList arrayList = wunVar.f;
        vun vunVar = (vun) this.b;
        arrayList.remove(vunVar);
        LinkedHashMap linkedHashMap = wunVar.c;
        p6l p6lVar = vunVar.b;
        String str = vunVar.a;
        if (p6lVar == p6l.a) {
            wunVar.g.i();
            linkedHashMap.remove(str);
            linkedHashMap.put(str, tunVar);
            wunVar.d();
        } else {
            wunVar.d.put(str, tunVar);
        }
        ArrayList arrayList2 = vunVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uun uunVar = (uun) obj;
            if (!uunVar.b) {
                uunVar.a.F(tunVar);
            }
        }
        wunVar.c();
    }

    public final void a(arl arlVar) {
        ((Handler) this.b).postDelayed((grl) this.c, arlVar.a.getDuration() == 0 ? 2000 : 3500);
    }

    public final Point b(RecyclerView recyclerView, int i) {
        pde pdeVar = (pde) this.b;
        sxj sxjVar = ((eyj) pdeVar.g()).j.a;
        int i2 = sxjVar.d;
        int i3 = sxjVar.b;
        int i4 = sxjVar.c;
        int i5 = sxjVar.a;
        m2l m2lVar = (m2l) ((x2l) this.c).H(i);
        if (m2lVar != null) {
            if (m2lVar instanceof u2l) {
                Size size = ((eyj) pdeVar.g()).e;
                int width = size.getWidth() + i5 + i4;
                int height = size.getHeight() + i3 + i2;
                if (recyclerView.getLayoutDirection() == 1) {
                    width = -width;
                }
                return new Point(width, height);
            }
            if (m2lVar instanceof g2l) {
                Size size2 = ((eyj) pdeVar.g()).g;
                int width2 = size2.getWidth() + i5 + i4;
                int height2 = size2.getHeight() + i3 + i2;
                if (recyclerView.getLayoutDirection() == 1) {
                    width2 = -width2;
                }
                return new Point(width2, height2);
            }
            if (m2lVar instanceof l2l) {
                Size size3 = ((eyj) pdeVar.g()).h;
                int width3 = size3.getWidth() + i5 + i4;
                int height3 = size3.getHeight() + i3 + i2;
                sxj sxjVar2 = ((eyj) pdeVar.g()).j.c;
                int i6 = width3 + sxjVar2.a + sxjVar2.c;
                if (recyclerView.getLayoutDirection() == 1) {
                    i6 = -i6;
                }
                return new Point(i6, height3 + sxjVar2.b + sxjVar2.d);
            }
            if (m2lVar instanceof k2l) {
                Size size4 = ((eyj) pdeVar.g()).j.e;
                sxj sxjVar3 = ((eyj) pdeVar.g()).j.d;
                int width4 = size4.getWidth() + sxjVar3.a + sxjVar3.c;
                if (recyclerView.getLayoutDirection() == 1) {
                    width4 = -width4;
                }
                return new Point(width4, size4.getHeight() + sxjVar3.b + sxjVar3.d);
            }
        }
        return new Point(0, 0);
    }

    public final void c(Uri uri, Callback callback) {
        ContentResolver contentResolver = (ContentResolver) this.b;
        qln qlnVar = (qln) this.c;
        iyk iykVar = new iyk(this, callback, (byte) 11);
        ami amiVar = qlnVar.f;
        j12 j12Var = new j12(iykVar, (byte) 13);
        s14 s14Var = (s14) amiVar.d;
        umi umiVar = (umi) s14Var.d;
        nml nmlVarE = umiVar.e(new is6((Object) s14Var, (Object) contentResolver, (Object) uri, false, (byte) 5));
        nmlVarE.b(umiVar.f(new roj(s14Var, j12Var, (byte) 15)));
        nmlVarE.a(null);
    }

    @Override // defpackage.cco
    public final void d() {
        x5f x5fVar = (x5f) this.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).d().b(new d5f(vb0.d, (byte) 3));
            x5fVar.U0(x56VarF);
        }
        ((n1) this.b).d();
    }

    @Override // defpackage.cco
    public final void e(boolean z) {
        x5f x5fVar = (x5f) this.c;
        vb0 vb0Var = z ? vb0.b : vb0.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).d().b(new d5f(vb0Var, (byte) 3));
            x5fVar.U0(x56VarF);
        }
        ((n1) this.b).e(z);
    }

    @Override // defpackage.zun
    public final void f(boolean z) {
        wun wunVar = (wun) this.c;
        ArrayList arrayList = wunVar.f;
        vun vunVar = (vun) this.b;
        arrayList.remove(vunVar);
        ArrayList arrayList2 = vunVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uun uunVar = (uun) obj;
            if (!uunVar.b) {
                uunVar.a.f(z);
            }
        }
        wunVar.c();
    }

    public final void onCancel() {
        Handler handler = (Handler) this.b;
        grl grlVar = (grl) this.c;
        handler.removeCallbacks(grlVar);
        grlVar.run();
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        vml.c(new ssi(this, (n9h) this.b, (byte) 17));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        int i;
        n9h n9hVar = (n9h) this.b;
        ArrayList arrayList = new ArrayList();
        e74 e74VarH = pzhVar.h();
        long jMax = (e74VarH == null || (i = e74VarH.c) < 0) ? 3600000L : Math.max(Math.min(i * 1000, Clock.DAY_MILLIS), 60000L);
        try {
            dpj dpjVar = (dpj) this.c;
            String strString = pzhVar.g.string();
            dpjVar.getClass();
            arrayList.addAll(nb6.W(new bql((byte) 5), vsi.d(strString, new hai((byte) 21), false)));
            vml.c(new n6m(this, n9hVar, arrayList, jMax));
        } catch (IOException unused) {
            vml.c(new cbl((Object) n9hVar, (byte) 19));
        }
    }

    public final String toString() {
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.cco
    public final String u() {
        return ((n1) this.b).u();
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((wpp) ((oam) this.c).b).a(new wmb(JavaScriptMessage$MsgChannel.nativeXhr, JavaScriptMessage$MsgType.nativeResponse, (String) this.b, (zzbs) obj));
    }
}
