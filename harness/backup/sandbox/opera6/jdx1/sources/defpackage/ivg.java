package defpackage;

import J.N;
import ads_mobile_sdk.pd;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.custom_views.FadingTextView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.widget.MenuSettingsListItem;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ivg implements hpf, zkj, hoj, m2k, f7l, re, ll7, vnk, jqo, cdp {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public ivg(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new auj((byte) 3);
                this.c = new y3d(16);
                break;
            case 12:
                this.b = new hkj(0);
                this.c = new j1d((Object) null);
                break;
            case 13:
            default:
                this.b = new t59(1000L);
                this.c = zn8.a(10, new hv5());
                break;
            case 14:
                this.b = new g1g();
                this.c = new ezn();
                break;
        }
    }

    public /* synthetic */ ivg(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public ivg(hp2 hp2Var) {
        this.a = (byte) 6;
        this.c = hp2Var;
        this.b = new j1d((Object) null);
    }

    public /* synthetic */ ivg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ivg(EnumSet enumSet, SparseArray sparseArray) {
        this.a = (byte) 1;
        this.c = new ArrayList();
        this.b = enumSet;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            io7 io7Var = (io7) it.next();
            mch mchVar = (mch) sparseArray.get(io7Var.a);
            if (mchVar != null) {
                mchVar.b(new q2g(this, io7Var, (byte) 17));
            }
        }
    }

    public ivg(ExecutorService executorService) {
        this.a = (byte) 2;
        this.c = new ArrayMap(0);
        this.b = executorService;
    }

    public ivg(rg4 rg4Var) {
        this.a = (byte) 7;
        this.b = rg4Var;
        this.c = null;
    }

    public ivg(tah tahVar, amk amkVar) {
        this.a = (byte) 0;
        this.b = amkVar;
        Objects.requireNonNull(tahVar);
        this.c = tahVar;
    }

    public ivg(umi umiVar) {
        this.a = (byte) 5;
        this.b = umiVar;
        this.c = z4c.b(new unj((byte) 1));
    }

    public ivg(v4b v4bVar) {
        this.a = (byte) 9;
        this.b = v4bVar;
        this.c = new File("tab_screenshots");
    }

    public ivg(vx vxVar, or2 or2Var) {
        this.a = (byte) 8;
        this.c = vxVar;
        this.b = or2Var;
        LinearLayout linearLayout = (LinearLayout) ((rf2) or2Var.d).d;
        svk svkVar = new svk(this, (byte) 1);
        dll dllVarS = q9n.s(linearLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, linearLayout, svkVar);
        }
    }

    private final void C(epf epfVar) {
    }

    private final void D(epf epfVar) {
    }

    public final String A(hub hubVar) {
        String str;
        synchronized (((t59) this.b)) {
            str = (String) ((t59) this.b).e(hubVar);
        }
        if (str == null) {
            khi khiVar = (khi) ((ua7) this.c).h();
            try {
                hubVar.b(khiVar.a);
                byte[] bArrDigest = khiVar.a.digest();
                char[] cArr = rm5.k;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i << 1;
                        char[] cArr2 = rm5.j;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((ua7) this.c).K(khiVar);
            }
        }
        synchronized (((t59) this.b)) {
            ((t59) this.b).j(hubVar, str);
        }
        return str;
    }

    public final FadingTextView B() {
        return ((rf2) ((or2) this.b).d).j;
    }

    public final fr E(i iVar, int i) {
        f7n f7nVar;
        fr frVar;
        hkj hkjVar = (hkj) this.b;
        int iD = hkjVar.d(iVar);
        if (iD >= 0 && (f7nVar = (f7n) hkjVar.k(iD)) != null) {
            int i2 = f7nVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                f7nVar.a = i3;
                if (i == 4) {
                    frVar = f7nVar.b;
                } else if (i == 8) {
                    frVar = f7nVar.c;
                } else {
                    qp2.o("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    hkjVar.h(iD);
                    f7nVar.a = 0;
                    f7nVar.b = null;
                    f7nVar.c = null;
                    f7n.d.c(f7nVar);
                }
                return frVar;
            }
        }
        return null;
    }

    public final void F(i iVar) {
        f7n f7nVar = (f7n) ((hkj) this.b).get(iVar);
        if (f7nVar == null) {
            return;
        }
        f7nVar.a &= -2;
    }

    public final void G(i iVar) {
        j1d j1dVar = (j1d) this.c;
        int iJ = j1dVar.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (iVar == j1dVar.k(iJ)) {
                Object[] objArr = j1dVar.c;
                Object obj = objArr[iJ];
                Object obj2 = x7d.f;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    j1dVar.a = true;
                }
            } else {
                iJ--;
            }
        }
        f7n f7nVar = (f7n) ((hkj) this.b).remove(iVar);
        if (f7nVar != null) {
            f7nVar.a = 0;
            f7nVar.b = null;
            f7nVar.c = null;
            f7n.d.c(f7nVar);
        }
    }

    public final void H() {
        or2 or2Var = (or2) this.b;
        ((rf2) or2Var.d).e.setText(2132021771);
        B().setSingleLine(false);
        B().setText(2132019661);
        ((CardView) ((rf2) or2Var.d).i).setContentDescription(((LinearLayout) or2Var.c).getResources().getString(2132021850));
        J(1, "");
    }

    public final void I(fpf fpfVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                amk amkVar = (amk) obj;
                byte b2 = fpfVar.f;
                tah tahVar = (tah) this.c;
                if (b2 != 1) {
                    if (tahVar.N()) {
                        tahVar.z(f8a.h.a(fpfVar.b), amkVar);
                        break;
                    }
                } else {
                    cvg cvgVar = (cvg) tahVar.d;
                    db dbVar = (db) tahVar.b;
                    hvg hvgVar = new hvg(this, amkVar, (byte) 1);
                    cvgVar.getClass();
                    cvgVar.getParentFragmentManager().i0("FinishAccountSetupAuthPortalFragment_request", cvgVar, new bm8(new eof(cvgVar, hvgVar, (byte) 8), (byte) 14));
                    xih.w(cvgVar.requireActivity().getSupportFragmentManager(), dbVar, (fv2) null, false);
                    p8f p8fVar = ((nvg) tahVar.c).c;
                    lvg lvgVar = new lvg(8, 3);
                    mvg mvgVarT = p8fVar.t();
                    if (mvgVarT != null) {
                        mvgVarT.f.add(lvgVar);
                        p8fVar.G(mvgVarT);
                        break;
                    }
                }
                break;
            default:
                or2 or2Var = (or2) obj;
                String str = fpfVar.c;
                String str2 = fpfVar.b;
                if (!str.isEmpty() || !str2.isEmpty()) {
                    B().setSingleLine(true);
                    if (str.isEmpty()) {
                        B().setText("");
                        ((rf2) or2Var.d).e.setText(str2);
                    } else {
                        B().setText(str2);
                        ((rf2) or2Var.d).e.setText(str);
                    }
                    ((CardView) ((rf2) or2Var.d).i).setContentDescription(((LinearLayout) or2Var.c).getResources().getString(2132022088, str2));
                    J(fpfVar.e, str2);
                    break;
                } else {
                    H();
                    break;
                }
                break;
        }
    }

    public final void J(int i, String str) {
        or2 or2Var = (or2) this.b;
        OperaChip operaChip = ((rf2) or2Var.d).h;
        if (i == 0) {
            ((StylingTextView) ((MenuSettingsListItem) ((ei) or2Var.e).i).b.b).setText(str);
            operaChip.setText(2132019664);
        } else if (i == 1) {
            ((StylingTextView) ((MenuSettingsListItem) ((ei) or2Var.e).i).b.b).setText(2132017276);
            operaChip.setText(2132019663);
        } else if (i == 2) {
            ((StylingTextView) ((MenuSettingsListItem) ((ei) or2Var.e).i).b.b).setText(2132021725);
            operaChip.setText(2132021725);
        }
        operaChip.setEnabled(i != 1);
        operaChip.setActivated(i != 2);
    }

    public final void K() {
        ((WebView) this.b).setVisibility(4);
    }

    public final void a() {
        ((g94) this.b).l((ahb) ((uuj) this.c).b);
    }

    public final void a(int i) {
    }

    public final boolean b(int i) {
        return ((vkn) this.c).a.P(((qln) this.b).i()) == i;
    }

    public final List c() {
        return e8j.a;
    }

    public final Uri d(String str) {
        return ((v4b) this.b).h(new File((File) this.c, str));
    }

    public final long e(long j) {
        j1d j1dVar = (j1d) this.b;
        Long lValueOf = (Long) j1dVar.c(j);
        if (lValueOf == null) {
            hp2 hp2Var = (hp2) this.c;
            long j2 = hp2Var.b;
            hp2Var.b = 1 + j2;
            lValueOf = Long.valueOf(j2);
            j1dVar.g(j, lValueOf);
        }
        return lValueOf.longValue();
    }

    public final void f(String str, tmi tmiVar) {
        File file = new File(y(), str);
        new rml(Unit.a, (umi) this.b).b(new wx1(file, (byte) 6)).t(new vvf(tmiVar, file, (byte) 27)).l();
    }

    public final void g(LinkedHashSet linkedHashSet) {
        v4b v4bVar = (v4b) this.b;
        ArrayList arrayList = new ArrayList(k95.o(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next()));
        }
        mea meaVarListIterator = v4bVar.i(v4bVar.h((File) this.c)).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return;
            }
            Uri uri = (Uri) meaVar.next();
            if (!arrayList.contains(uri)) {
                v4bVar.k(uri);
            }
        }
    }

    public final void h(cpf cpfVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tah tahVar = (tah) this.c;
                cvg cvgVar = (cvg) tahVar.d;
                hvg hvgVar = new hvg(this, (amk) obj, (byte) 0);
                cvgVar.getClass();
                cvgVar.getParentFragmentManager().i0("FinishAccountSetupAuthPortalFragment_request", cvgVar, new bm8(new eof(cvgVar, hvgVar, (byte) 8), (byte) 14));
                wzg wzgVar = new wzg((Object) null, htg.class, (byte) 4);
                new zhj(wzgVar, (Bundle) null, 2, 4099, (String) null, false, Arrays.asList(new n6h[0])).c(cvgVar.requireContext());
                p8f p8fVar = ((nvg) tahVar.c).c;
                lvg lvgVar = new lvg(8, 3);
                mvg mvgVarT = p8fVar.t();
                if (mvgVarT != null) {
                    mvgVarT.f.add(lvgVar);
                    p8fVar.G(mvgVarT);
                    break;
                }
                break;
            default:
                or2 or2Var = (or2) obj;
                ((rf2) or2Var.d).e.setText(2132021771);
                B().setSingleLine(false);
                B().setText(2132021727);
                J(cpfVar.b, ((LinearLayout) or2Var.c).getResources().getString(2132022274));
                break;
        }
    }

    public final void i(String str, Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream)) {
                throw new IOException("compress failed");
            }
            byteArrayOutputStream.close();
            ((v4b) this.b).j(d(str), byteArrayOutputStream.toByteArray(), EnumSet.noneOf(u4b.class));
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x037c, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.vnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(byte[] r19, int r20, int r21, defpackage.unk r22, defpackage.op5 r23) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivg.j(byte[], int, int, unk, op5):void");
    }

    @Override // defpackage.re
    public final boolean k(se seVar, MenuItem menuItem) {
        return ((rii) this.b).k(seVar, menuItem);
    }

    public final boolean l(int i) {
        return ((ArrayList) ((dt1) ((vkn) this.c).a).d).get(i) instanceof hkb;
    }

    public final void m(SimpleUrlLoader simpleUrlLoader, String str, xnj xnjVar) {
        File file = new File(y(), str);
        N.M2K$v3$l(simpleUrlLoader.a, false, 5242880L, file.toString(), new jri(xnjVar, file, (byte) 10), new mni(xnjVar, (byte) 15));
    }

    public final void n(epf epfVar) {
        byte b = this.a;
    }

    public final void o(lrf lrfVar) {
        ((cv1) this.c).invoke((b7j) lrfVar);
    }

    @Override // defpackage.re
    public final void p(se seVar) {
        ((rii) this.b).p(seVar);
        ((ltl) ((yyi) this.c)).m = null;
    }

    @Override // defpackage.re
    public final boolean q(se seVar, itd itdVar) {
        ((rii) this.b).q(seVar, itdVar);
        return true;
    }

    public final void r(gpf gpfVar) {
        switch (this.a) {
            case 0:
                tah tahVar = (tah) this.c;
                if (tahVar.N()) {
                    tahVar.z((String) null, (amk) this.b);
                    break;
                }
                break;
            default:
                H();
                break;
        }
    }

    public final void remove(String str) {
        ((v4b) this.b).k(d(str));
    }

    public final void removeAll() {
        new rml(Unit.a, (umi) this.b).b(new joj(this, (byte) 1)).l();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vjo */
    @Override // defpackage.cdp
    public final Object s(pzh pzhVar) throws vjo {
        int i = pzhVar.d;
        if (i == 204 || i == 205) {
            throw new vjo(pd.T0, (String) null);
        }
        return ((qro) this.b).i((zjo) cqp.L(fcp.d(), zjo.Companion.serializer(), pzhVar.g.byteStream()), (pro) this.c);
    }

    public final lrf t() {
        return (b7j) this.b;
    }

    @Override // defpackage.re
    public final boolean v(se seVar, itd itdVar) {
        ((rii) this.b).v(seVar, itdVar);
        return true;
    }

    public final void w(i iVar, fr frVar) {
        hkj hkjVar = (hkj) this.b;
        f7n f7nVarA = (f7n) hkjVar.get(iVar);
        if (f7nVarA == null) {
            f7nVarA = f7n.a();
            hkjVar.put(iVar, f7nVarA);
        }
        f7nVarA.c = frVar;
        f7nVarA.a |= 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x050b A[LOOP:17: B:206:0x0509->B:207:0x050b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0521 A[LOOP:18: B:209:0x051f->B:210:0x0521, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hgk x(int r42, defpackage.xd4 r43, java.util.ArrayList r44, java.util.ArrayList r45, defpackage.ec4 r46, int r47, android.util.Range r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivg.x(int, xd4, java.util.ArrayList, java.util.ArrayList, ec4, int, android.util.Range, boolean):hgk");
    }

    public final File y() {
        return (File) ((zyk) this.c).getValue();
    }

    @Override // defpackage.vnk
    public final int z() {
        return 1;
    }
}
