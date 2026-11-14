package defpackage;

import J.N;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class oid implements vid, mpd, zpd, dkj {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oid(c4j c4jVar, boolean z, boolean z2, nod nodVar) {
        this.c = c4jVar;
        this.a = z;
        this.b = z2;
        this.d = nodVar;
    }

    public /* synthetic */ oid(Object obj, Object obj2, boolean z, boolean z2) {
        this.c = obj;
        this.d = obj2;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dkj
    public final void a() {
        final nlh nlhVar = (nlh) this.c;
        final ilh ilhVar = (ilh) this.d;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        mdb.i(intent, Uri.parse(ilhVar.f));
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("*/*");
        final dx3 dx3VarP = q9n.p(nlhVar.requireActivity());
        qi qiVar = dx3VarP.j;
        final boolean z = this.a;
        final boolean z2 = this.b;
        qiVar.t(intent, new r1o() { // from class: llh
            @Override // defpackage.r1o
            public final void a(int i, Intent intent2) {
                Uri data;
                HashMap map;
                vx3 vx3VarA;
                if (i != -1 || intent2 == null || (data = intent2.getData()) == null) {
                    return;
                }
                int flags = intent2.getFlags() & 3;
                boolean z3 = z;
                boolean z4 = z2;
                if (flags == 3) {
                    fp1 fp1Var = dx3VarP;
                    fp1Var.getContentResolver().takePersistableUriPermission(data, 3);
                    String strG = dd7.e(fp1Var, data).g();
                    ilh ilhVar2 = ilhVar;
                    String str = ilhVar2.f;
                    if (strG.equals(str.startsWith("content://") ? dd7.e(fp1Var, Uri.parse(str)).g() : str.startsWith("file://") ? new File(Uri.parse(str).getPath()).getName() : new File(str).getName())) {
                        nlh nlhVar2 = nlhVar;
                        nlhVar2.D.h(new hvc(nlhVar2, ilhVar2, z3, z4, (byte) 1), data.toString(), ilhVar2.a);
                        return;
                    }
                }
                String type = intent2.getType();
                if ("multipart/related".equals(type) || "message/rfc822".equals(type) || ((TextUtils.isEmpty(type) || "application/octet-stream".equals(type)) && s29.d(data.getPath()).equals("mhtml"))) {
                    map = new HashMap(1);
                    map.put("X-Chrome-intent-type", "multipart/related");
                } else {
                    map = null;
                }
                lqm lqmVar = lqm.m;
                if (map == null || map.isEmpty()) {
                    vx3VarA = ay3.a(data.toString(), lqmVar, false);
                } else {
                    lsc lscVar = new lsc(data.toString(), 0);
                    lscVar.f = map;
                    vx3VarA = new vx3(lqmVar);
                    vx3VarA.p.add(new xx3(lscVar));
                }
                vx3VarA.a(!z3);
                vx3VarA.d(z3);
                vx3VarA.c(z3);
                vx3VarA.e(z4);
                am2.v(vx3VarA);
            }
        }, (Integer) null);
    }

    public final void b(nod nodVar) {
        aqd aqdVar = (aqd) this.c;
        c5j c5jVarP = aqdVar.f.p(nodVar, h1b.v((qjd) this.d), -1, -9223372036854775807L);
        km5 km5Var = new km5();
        km5Var.d = aqdVar;
        km5Var.c = nodVar;
        km5Var.a = this.a;
        km5Var.b = this.b;
        c5jVarP.addListener(new vr9(c5jVarP, km5Var, (byte) 0), m97.a);
    }

    public final void c(mod modVar, int i) {
        modVar.h(i, (c4j) this.c, this.a, this.b, ((nod) this.d).c);
    }

    public final void run(long j) {
        byte[] bArr = (byte[]) this.c;
        Object[] objArr = (Object[]) this.d;
        UUID uuid = MediaDrmBridge.n;
        N.Mk8V79M2(j, bArr, objArr, this.a, this.b);
    }
}
