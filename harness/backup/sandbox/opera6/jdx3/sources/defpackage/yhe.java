package defpackage;

import android.app.PendingIntent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.view.PreviewView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class yhe implements wm, qye, vlf, kod, rwg, h4h, o7h, hti, n2k, hpf, f94, nwh {
    public final /* synthetic */ byte a;
    public Object b;

    public yhe(byte b) {
        this.a = b;
        byte b2 = 1;
        switch (b) {
            case 14:
                wub wubVar = new wub();
                wubVar.a = new yp9(wubVar, 134, (byte) 1);
                this.b = wubVar;
                break;
            case 15:
                this.b = d77.a(ExtraCroppingQuirk.class);
                break;
            case SizeUtil.textSize0 /* 20 */:
                break;
            case SizeUtil.textSize2 /* 24 */:
                this.b = new urj(b2);
                break;
            default:
                u9d u9dVar = new u9d();
                String[] strArr = {"first", Constants.Params.NAME};
                nf2 nf2Var = nf2.NAME;
                u9dVar.put(strArr, nf2Var);
                u9dVar.put(new String[]{"last", Constants.Params.NAME}, nf2Var);
                u9dVar.put(new String[]{"given", Constants.Params.NAME}, nf2Var);
                u9dVar.put(new String[]{"family", Constants.Params.NAME}, nf2Var);
                u9dVar.put(new String[]{"full", Constants.Params.NAME}, nf2Var);
                nf2 nf2Var2 = nf2.SIGNUP_PASSWORD;
                u9dVar.put(new String[]{"set", "password"}, nf2Var2);
                u9dVar.put(new String[]{"choose", "password"}, nf2Var2);
                u9dVar.put(new String[]{"new", "password"}, nf2Var2);
                u9dVar.put(new String[]{"confirm"}, nf2Var2);
                u9dVar.put(new String[]{"password"}, nf2.PASSWORD);
                u9dVar.put(new String[]{Constants.Params.EMAIL}, nf2.EMAIL_ADDRESS);
                nf2 nf2Var3 = nf2.USERNAME;
                u9dVar.put(new String[]{"user"}, nf2Var3);
                u9dVar.put(new String[]{"username"}, nf2Var3);
                u9dVar.put(new String[]{"login"}, nf2Var3);
                u9dVar.put(new String[]{"birth"}, nf2.BIRTHDAY);
                this.b = u9dVar.g();
                break;
        }
    }

    public yhe(View view, gim gimVar, him himVar) {
        this.a = (byte) 7;
        this.b = view;
        view.setOnClickListener(new zvd(gimVar, (byte) 9));
        view.setOnLongClickListener(new zt((Object) himVar, (byte) 12));
    }

    public yhe(cie cieVar, bn bnVar) {
        this.a = (byte) 0;
        this.b = bnVar;
    }

    public yhe(d4d d4dVar) {
        this.a = (byte) 10;
        int i = d4dVar.c;
        byte b = d4dVar.d;
        this.b = new wub[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((wub[]) this.b)[i2] = new wub(d4dVar, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yhe(hjf hjfVar) {
        this.a = (byte) 5;
        this.b = (AutofillManager) hjfVar.getSystemService(AutofillManager.class);
    }

    public /* synthetic */ yhe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public yhe(long[] jArr) {
        rde rdeVar;
        this.a = (byte) 22;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            rdeVar = new rde(jArrCopyOf.length);
            int i = rdeVar.b;
            if (i < 0) {
                zwg.u("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = rdeVar.a;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    rdeVar.a = jArrCopyOf2;
                }
                int i2 = rdeVar.b;
                if (i != i2) {
                    System.arraycopy(jArrCopyOf2, i, jArrCopyOf2, jArrCopyOf.length + i, i2 - i);
                }
                System.arraycopy(jArrCopyOf, 0, jArrCopyOf2, i, jArrCopyOf.length);
                rdeVar.b += jArrCopyOf.length;
            }
        } else {
            rdeVar = new rde();
        }
        this.b = rdeVar;
    }

    public static yhe f(Context context, int i, Intent intent, int i2, boolean z) {
        return new yhe((Object) PendingIntent.getActivity(context, i, intent, i2 | c26.s(z)), (byte) 8);
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        OperaListItem operaListItem = (OperaListItem) ((hlk) this.b).k.e;
        Locale locale = Locale.ROOT;
        v0g.m(operaListItem, sko.k(fpfVar.b, "\nID: ", fpfVar.a));
    }

    @Override // defpackage.rwg
    public final void a(buk bukVar) {
        all eukVar;
        if (!xug.n()) {
            ((PreviewView) this.b).getContext().getMainExecutor().execute(new q2g(this, bukVar, (byte) 8));
            return;
        }
        zd4 zd4Var = bukVar.e;
        ((PreviewView) this.b).k = zd4Var.g();
        bxg bxgVar = ((PreviewView) this.b).i;
        Rect rectG = zd4Var.g().g();
        bxgVar.getClass();
        bxgVar.a = new Rational(rectG.width(), rectG.height());
        synchronized (bxgVar) {
            bxgVar.c = rectG;
        }
        bukVar.b(((PreviewView) this.b).getContext().getMainExecutor(), new a32((Object) this, (Object) zd4Var, (Object) bukVar, (byte) 26));
        PreviewView previewView = (PreviewView) this.b;
        n1f n1fVar = previewView.b;
        int i = previewView.a;
        if (!(n1fVar instanceof euk) || PreviewView.d(bukVar, i)) {
            PreviewView previewView2 = (PreviewView) this.b;
            boolean zD = PreviewView.d(bukVar, previewView2.a);
            PreviewView previewView3 = (PreviewView) this.b;
            ywg ywgVar = previewView3.d;
            if (zD) {
                eukVar = new all(previewView3, ywgVar);
                eukVar.i = false;
                eukVar.k = new AtomicReference();
            } else {
                eukVar = new euk(previewView3, ywgVar);
            }
            previewView2.b = eukVar;
        }
        xd4 xd4VarG = zd4Var.g();
        PreviewView previewView4 = (PreviewView) this.b;
        xwg xwgVar = new xwg(xd4VarG, previewView4.f, previewView4.b);
        ((PreviewView) this.b).g.set(xwgVar);
        zd4Var.b().g(((PreviewView) this.b).getContext().getMainExecutor(), xwgVar);
        ((PreviewView) this.b).b.j(bukVar, new a32((Object) this, (Object) xwgVar, (Object) zd4Var, (byte) 27));
        PreviewView previewView5 = (PreviewView) this.b;
        if (previewView5.indexOfChild(previewView5.c) == -1) {
            PreviewView previewView6 = (PreviewView) this.b;
            previewView6.addView(previewView6.c);
        }
    }

    public final void b(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public final ListenableFuture c(csh cshVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a1b a1bVarU = cshVar.u(0);
        while (a1bVarU.hasNext()) {
            qjd qjdVar = (qjd) a1bVarU.next();
            Uri uriD0 = sfe.d0(qjdVar.e);
            if (uriD0 != null) {
                arrayList2.add(new mkg(qjdVar.e, new egd(uriD0), null, qjdVar.a));
                ejd ejdVarA = qjdVar.a();
                ejdVarA.b = uriD0;
                arrayList.add(ejdVarA.a());
            }
        }
        ((okg) this.b).a(-1, (mkg[]) arrayList2.toArray(new mkg[0]));
        return yr9.c(arrayList);
    }

    @Override // defpackage.wm
    public final void d(bm bmVar) {
        ((bn) this.b).m(bmVar);
    }

    public final void e(byte[] bArr) {
        int i = 0;
        while (true) {
            wub[] wubVarArr = (wub[]) this.b;
            if (i >= wubVarArr.length) {
                return;
            }
            wub wubVar = wubVarArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                p8f[] p8fVarArr = (p8f[]) wubVar.a;
                if (i3 < p8fVarArr.length) {
                    p8f p8fVar = p8fVarArr[i3];
                    short s = (short) (i2 + i3);
                    vci vciVar = (vci) ((iuh) p8fVar.d).b;
                    byte[] bArr2 = new byte[842];
                    vciVar.reset();
                    vciVar.g(0, bArr.length, bArr);
                    vciVar.g(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
                    int i4 = 840;
                    vciVar.p(0, 840, bArr2);
                    int iB = p8f.B(p8fVar, 0, Constants.Crypt.KEY_LENGTH, bArr2, 840);
                    while (iB < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        vciVar.p(i5, 168, bArr2);
                        i4 = 168 + i5;
                        iB += p8f.B(p8fVar, iB, 256 - iB, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.wm
    public final void g() {
        ((bn) this.b).I();
    }

    public final Object get() {
        return new dni((Context) ((qh) this.b).a, dni.d, "com.google.android.datatransport.events");
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        OperaListItem operaListItem = (OperaListItem) ((hlk) this.b).k.e;
        Locale locale = Locale.ROOT;
        v0g.m(operaListItem, "Anonymous account\nID: ".concat(cpfVar.a));
    }

    public Integer[] i() {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) this.b;
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        int[] outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        if (outputFormats != null) {
            return b82.l(outputFormats);
        }
        return null;
    }

    public long j(int i, Size size) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    @Override // defpackage.qye
    public final nf2 k(AssistStructure.ViewNode viewNode) {
        nf2 nf2VarB;
        u9d u9dVar = (u9d) this.b;
        if (Build.VERSION.SDK_INT >= 30 && (nf2VarB = r9n.b(viewNode, u9dVar)) != null) {
            return nf2VarB;
        }
        nf2 nf2VarN = scd.n(viewNode.getTextIdEntry(), u9dVar);
        if (nf2VarN != null) {
            return nf2VarN;
        }
        nf2 nf2VarN2 = scd.n(viewNode.getIdEntry(), u9dVar);
        if (nf2VarN2 != null) {
            return nf2VarN2;
        }
        return null;
    }

    public Size[] l(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public final Pattern m(String str) {
        Object obj;
        wub wubVar = (wub) this.b;
        synchronized (wubVar) {
            obj = ((yp9) wubVar.a).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        wub wubVar2 = (wub) this.b;
        synchronized (wubVar2) {
            ((yp9) wubVar2.a).put(str, patternCompile);
        }
        return patternCompile;
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    public final float o(i iVar) {
        z5l z5lVar = (z5l) this.b;
        RecyclerView recyclerView = z5lVar.f;
        if (iVar.getBindingAdapterPosition() != -1) {
            int iOrdinal = ((y5l) z5lVar.n.g()).b.ordinal();
            if (iOrdinal == 0) {
                return djh.b(((((z5lVar.q.i.a(iVar.itemView) <= 0.0f ? iVar.itemView.getTranslationX() : 0.0f) + iVar.itemView.getLeft()) + (iVar.itemView.getWidth() / 2)) - (recyclerView.getWidth() / 2)) / z5lVar.w.b(recyclerView, r1).x, -0.5f, 0.5f);
            }
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
            }
        }
        return 0.0f;
    }

    @Override // defpackage.wm
    public final void onAdClicked() {
        ((bn) this.b).onAdClicked();
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        b94 b94Var = (b94) this.b;
        String message = iOException.getMessage();
        if (message == null) {
            message = "Unknown failure";
        }
        b94Var.run(new u1m(message));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        b94 b94Var = (b94) this.b;
        try {
            if (pzhVar.q) {
                b94Var.run(v1m.a);
            } else {
                b94Var.run(new u1m("Bad response: " + pzhVar.c));
            }
            pzhVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vtp.v(pzhVar, th);
                throw th2;
            }
        }
    }

    public final void p(String str) {
        ((oy) this.b).g(str);
    }

    @Override // defpackage.n2k
    public final m2k q() {
        return (urj) this.b;
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        v0g.m((OperaListItem) ((hlk) this.b).k.e, "No account");
    }

    public final void s(wub wubVar, wub wubVar2) {
        int i;
        p8f[] p8fVarArr = (p8f[]) wubVar2.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            wub[] wubVarArr = (wub[]) this.b;
            if (i3 >= wubVarArr.length) {
                return;
            }
            p8f p8fVar = ((p8f[]) wubVar.a)[i3];
            wub wubVar3 = wubVarArr[i3];
            int[] iArr = (int[]) p8fVar.b;
            byte b = ((d4d) p8fVar.c).d;
            int[] iArr2 = (int[]) ((p8f[]) wubVar3.a)[i2].b;
            int[] iArr3 = (int[]) p8fVarArr[i2].b;
            int i4 = i2;
            while (true) {
                i = Constants.Crypt.KEY_LENGTH;
                if (i4 >= 256) {
                    break;
                }
                iArr[i4] = hyg.j(iArr2[i4] * iArr3[i4]);
                i4++;
            }
            int i5 = 1;
            while (i5 < b) {
                int[] iArr4 = (int[]) ((p8f[]) wubVar3.a)[i5].b;
                int[] iArr5 = (int[]) p8fVarArr[i5].b;
                int i6 = i2;
                while (i6 < i) {
                    int i7 = i6;
                    iArr[i7] = hyg.j(iArr4[i6] * iArr5[i6]) + iArr[i6];
                    i6 = i7 + 1;
                    i = Constants.Crypt.KEY_LENGTH;
                }
                i5++;
                i2 = 0;
                i = Constants.Crypt.KEY_LENGTH;
            }
            i3++;
            i2 = 0;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 28:
                return super.toString() + "{fragment=" + ((nsk) this.b) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        switch (this.a) {
            case 6:
                int id = operaListItem.getId();
                OperaRadioGroup operaRadioGroup = (OperaRadioGroup) this.b;
                if (!operaRadioGroup.b) {
                    operaRadioGroup.b = true;
                    int i = operaRadioGroup.a;
                    if (i != -1) {
                        operaRadioGroup.c(i, false);
                    }
                    operaRadioGroup.b = false;
                    operaRadioGroup.b(id);
                    break;
                }
                break;
            default:
                ((wzj) this.b).b.V(z ? 1 : 0, "speed_dial.enabled");
                break;
        }
    }

    public final void v(String str) {
        oy oyVar = (oy) this.b;
        oyVar.b();
        oyVar.g(str);
    }
}
