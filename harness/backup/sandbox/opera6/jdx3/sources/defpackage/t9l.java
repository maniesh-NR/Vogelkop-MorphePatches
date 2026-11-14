package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t9l implements vnk, jma, jrp {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public t9l() {
        this.a = new ArrayMap(0);
        this.b = new SparseArray();
        this.c = new j1d((Object) null);
        this.d = new ArrayMap(0);
    }

    public t9l(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = new pde(og.a);
        this.c = p37.z(viewGroup);
        this.d = new gyf(viewGroup, 200L);
        viewGroup.postOnAnimation(new s9l(this, (byte) 0));
    }

    public t9l(BrowserActivity browserActivity, SettingsManager settingsManager, wv1 wv1Var) {
        this.a = browserActivity;
        this.b = settingsManager;
        this.c = wv1Var;
        this.d = new ArrayList();
    }

    public t9l(fao faoVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = faoVar;
    }

    public /* synthetic */ t9l(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public t9l(m9f m9fVar) {
        this.a = m9fVar;
        int i = m9fVar.a;
        this.b = new yvb((q0) m9fVar.c, i);
        this.c = new byte[i];
        this.d = new byte[i];
    }

    public final void a(w1n w1nVar) {
        ((ArrayList) this.d).add(w1nVar);
    }

    public final ll4 b() {
        return new ll4((BrowserActivity) this.a, (SettingsManager) this.b, (wv1) this.c, (ArrayList) this.d, (byte) 3, false);
    }

    public final u7k c(byte[] bArr) {
        t9l t9lVar = this;
        byte[] bArr2 = bArr;
        yvb yvbVar = (yvb) t9lVar.b;
        m9f m9fVar = (m9f) t9lVar.a;
        int i = m9fVar.a;
        int i2 = m9fVar.b;
        byte[][] bArr3 = new byte[i2][];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[i];
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        int i3 = 0;
        while (i3 < i2) {
            sfe.h0(i3, 20, bArr2);
            if (i3 < 0 || i3 >= i2) {
                qp2.o("index out of bounds");
                return null;
            }
            sfe.w0(i3, bArr4, 24, 8);
            yvb yvbVar2 = yvbVar;
            int i4 = 24;
            yvbVar2.a(3, 0, (byte[]) t9lVar.c, bArr4, bArr5);
            int i5 = i3;
            byte[] bArr8 = (byte[]) t9lVar.d;
            byte[] bArr9 = new byte[i];
            byte[] bArr10 = bArr6;
            byte[] bArr11 = bArr5;
            int i6 = 0;
            while (i6 != 15) {
                sfe.h0(i6, i4, bArr2);
                sfe.h0(0, 28, bArr2);
                int i7 = i6;
                yvb yvbVar3 = yvbVar2;
                byte[] bArr12 = bArr10;
                yvbVar3.a(3, 0, bArr8, bArr2, bArr12);
                sfe.h0(1, 28, bArr2);
                byte[] bArr13 = bArr7;
                yvbVar3.a(3, 0, bArr8, bArr2, bArr13);
                byte[] bArr14 = bArr8;
                for (int i8 = 0; i8 < i; i8++) {
                    bArr13[i8] = (byte) (bArr13[i8] ^ bArr11[i8]);
                }
                yvbVar3.a(0, 0, bArr12, bArr13, bArr9);
                i6 = i7 + 1;
                bArr2 = bArr;
                bArr8 = bArr14;
                bArr7 = bArr13;
                bArr11 = bArr9;
                bArr10 = bArr12;
                yvbVar2 = yvbVar3;
                i4 = 24;
            }
            yvbVar = yvbVar2;
            bArr3[i5] = bArr9;
            i3 = i5 + 1;
            t9lVar = this;
            bArr2 = bArr;
            bArr6 = bArr10;
        }
        return new u7k(bArr3);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        sfe.h0(0, 20, bArr2);
        sfe.h0(0, 24, bArr2);
        sfe.h0(0, 28, bArr2);
        yvb yvbVar = (yvb) this.b;
        byte[] bArr3 = new byte[yvbVar.b];
        yvbVar.a(3, 0, bArr, bArr2, bArr3);
        return bArr3;
    }

    public final void e(byte[] bArr, byte[] bArr2) {
        int i = ((m9f) this.a).a;
        ybh.B(i, "secretKeySeed", bArr);
        ybh.B(i, "publicSeed", bArr2);
        byte[] bArr3 = (byte[]) this.c;
        System.arraycopy(bArr, 0, bArr3, 0, bArr3.length);
        byte[] bArr4 = (byte[]) this.d;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr4.length);
    }

    public final void f() {
        pde pdeVar = (pde) this.b;
        Object objG = ((kze) this.c).g();
        Object obj = ng.a;
        if (!Intrinsics.a(objG, obj) || !((ViewGroup) this.a).isLaidOut()) {
            obj = og.a;
        }
        xf8.F0(pdeVar, obj);
    }

    public final void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var) {
        csh cshVarV;
        Rect rect;
        g1g g1gVar = (g1g) this.a;
        g1gVar.L(bArr, i + i2);
        g1gVar.N(i);
        g1g g1gVar2 = (g1g) this.b;
        yan yanVar = (yan) this.c;
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = tym.a;
        if (g1gVar.a() > 0 && g1gVar.j() == 120 && tym.H(g1gVar, g1gVar2, inflater)) {
            g1gVar.L(g1gVar2.a, g1gVar2.c);
        }
        yanVar.c = false;
        x36 x36Var = null;
        yanVar.g = null;
        yanVar.h = -1;
        yanVar.i = -1;
        int iA = g1gVar.a();
        if (iA >= 2 && g1gVar.H() == iA) {
            int[] iArr = yanVar.d;
            if (iArr != null && yanVar.b) {
                g1gVar.O(g1gVar.H() - 2);
                int iH = g1gVar.H();
                int[] iArr2 = yanVar.a;
                while (g1gVar.b < iH && g1gVar.a() > 0) {
                    switch (g1gVar.A()) {
                        case 3:
                            if (g1gVar.a() < 2) {
                                break;
                            } else {
                                int iA2 = g1gVar.A();
                                int iA3 = g1gVar.A();
                                iArr2[3] = yan.a(iA2 >> 4, iArr);
                                iArr2[2] = yan.a(iA2 & 15, iArr);
                                iArr2[1] = yan.a(iA3 >> 4, iArr);
                                iArr2[0] = yan.a(iA3 & 15, iArr);
                                yanVar.c = true;
                            }
                        case 4:
                            if (g1gVar.a() < 2 || !yanVar.c) {
                                break;
                            } else {
                                int iA4 = g1gVar.A();
                                int iA5 = g1gVar.A();
                                iArr2[3] = yan.c(iArr2[3], iA4 >> 4);
                                iArr2[2] = yan.c(iArr2[2], iA4 & 15);
                                iArr2[1] = yan.c(iArr2[1], iA5 >> 4);
                                iArr2[0] = yan.c(iArr2[0], iA5 & 15);
                            }
                            break;
                        case 5:
                            if (g1gVar.a() < 6) {
                                break;
                            } else {
                                int iA6 = g1gVar.A();
                                int iA7 = g1gVar.A();
                                int i3 = (iA6 << 4) | (iA7 >> 4);
                                int iA8 = ((iA7 & 15) << 8) | g1gVar.A();
                                int iA9 = g1gVar.A();
                                int iA10 = g1gVar.A();
                                yanVar.g = new Rect(i3, (iA9 << 4) | (iA10 >> 4), iA8 + 1, (((iA10 & 15) << 8) | g1gVar.A()) + 1);
                            }
                        case 6:
                            if (g1gVar.a() < 4) {
                                break;
                            } else {
                                yanVar.h = g1gVar.H();
                                yanVar.i = g1gVar.H();
                            }
                    }
                }
            }
            if (yanVar.d != null && yanVar.b && yanVar.c && (rect = yanVar.g) != null && yanVar.h != -1 && yanVar.i != -1 && rect.width() >= 2 && yanVar.g.height() >= 2) {
                Rect rect2 = yanVar.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                bq4 bq4Var = new bq4();
                g1gVar.N(yanVar.h);
                bq4Var.o(g1gVar);
                yanVar.b(bq4Var, true, rect2, iArr3);
                g1gVar.N(yanVar.i);
                bq4Var.o(g1gVar);
                yanVar.b(bq4Var, false, rect2, iArr3);
                x36Var = new x36((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / yanVar.f, 0, 0, rect2.left / yanVar.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / yanVar.e, rect2.height() / yanVar.f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
            }
        }
        if (x36Var != null) {
            cshVarV = h1b.v(x36Var);
        } else {
            a1b a1bVar = h1b.b;
            cshVarV = csh.e;
        }
        op5Var.accept(new a46(cshVarV, -9223372036854775807L, 5000000L));
    }

    public final void onDismissed(Bundle bundle) {
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.d;
        boolean z = bundle.getBoolean("dldpRedirect", false);
        if (hsdpShimActivity.b || z) {
            hsdpShimActivity.a = null;
            hsdpShimActivity.finish();
        }
    }

    public final void onError(Bundle bundle) {
        String.valueOf(bundle);
        String str = (String) this.a;
        String str2 = (String) this.b;
        HashMap map = (HashMap) this.c;
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.d;
        hsdpShimActivity.startActivityForResult(y4h.t(str, str2, map), 0);
        hsdpShimActivity.a = null;
        hsdpShimActivity.b = false;
        hsdpShimActivity.finish();
    }

    public final void onShown(Bundle bundle) {
        ((HsdpShimActivity) this.d).b = true;
    }

    public final int z() {
        return 2;
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        return new cp8(((h61) ((z4k) this.a).b).a, (File) ((jrp) this.b).mo1zza(), (pup) ((jrp) this.c).mo1zza(), arp.a((rii) this.d));
    }
}
