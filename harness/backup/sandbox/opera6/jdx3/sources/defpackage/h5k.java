package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class h5k implements n8k, en8, mmn, m1p {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public h5k(TextView textView, View view) {
        this.b = textView;
        this.c = view;
        this.d = new ml2(this, (byte) 4);
        q9n.g(textView, new z61(this, (byte) 24));
    }

    public h5k(en8 en8Var, tnk tnkVar) {
        this.b = en8Var;
        this.c = tnkVar;
        this.d = new SparseArray();
    }

    public h5k(tsd tsdVar, pde pdeVar, re5 re5Var) {
        this.b = pdeVar;
        this.c = re5Var;
        this.d = new Size(re5Var.getRoot().getLayoutParams().width, re5Var.getRoot().getLayoutParams().height);
        a26.T(pdeVar, tsdVar, new g9l(this, (byte) 4));
    }

    public h5k(yul yulVar, q8l q8lVar, boolean z) {
        this.a = z;
        this.c = yulVar;
        this.d = q8lVar;
    }

    @Override // defpackage.n8k
    public final void b(q8l q8lVar) {
        if (this.a && ((q8l) this.d).equals(q8lVar)) {
            return;
        }
        this.d = q8lVar;
        n8k n8kVar = (n8k) this.b;
        if (n8kVar != null) {
            n8kVar.b(q8lVar);
        }
    }

    @Override // defpackage.n8k
    public final void c(yul yulVar) {
        if (this.a && ((yul) this.c).equals(yulVar)) {
            return;
        }
        this.c = yulVar;
        n8k n8kVar = (n8k) this.b;
        if (n8kVar != null) {
            n8kVar.c(yulVar);
        }
    }

    @Override // defpackage.mmn
    public final void d(ilm ilmVar) {
        ami amiVar = ((qln) this.d).f;
        ContentResolver contentResolver = (ContentResolver) this.c;
        Uri uri = (Uri) this.b;
        boolean z = this.a;
        j12 j12Var = new j12(ilmVar, (byte) 13);
        s14 s14Var = (s14) amiVar.d;
        umi umiVar = (umi) s14Var.d;
        nml nmlVarE = umiVar.e(new is6((Object) s14Var, (Object) contentResolver, (Object) uri, z, (byte) 5));
        nmlVarE.b(umiVar.f(new roj(s14Var, j12Var, (byte) 15)));
        nmlVarE.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if ((r2 instanceof defpackage.mxj) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if ((r2 instanceof defpackage.mxj) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5k.e():void");
    }

    public final void endTracks() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((en8) this.b).endTracks();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((wnk) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public final void f() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((x2l) this.d).k.invoke((jri) this.b);
    }

    @Override // defpackage.m1p
    public final void g(WebView webView) {
        guo guoVar = (guo) this.d;
        ylp ylpVar = (ylp) this.c;
        if (!this.a) {
            this.a = true;
            ((z23) this.b).invoke();
        }
        if (ylpVar.q == null || guoVar.g != null) {
            return;
        }
        Context context = guoVar.a;
        if (!c26.q.b) {
            c26.f(context);
        }
        guoVar.g = new dpo(webView, (String) CollectionsKt.firstOrNull(e82.p(new String[]{ylpVar.o, ylpVar.p})), ylpVar.q);
    }

    public final void h(twi twiVar) {
        ((en8) this.b).h(twiVar);
    }

    public final void i(i5k i5kVar) {
        eof eofVar = new eof((Object) this, (Object) i5kVar, (byte) 20);
        j5k j5kVar = i5kVar.d;
        List list = i5kVar.b;
        j5k j5kVar2 = i5kVar.d;
        bz bzVar = j5kVar.d;
        if (!bzVar.a()) {
            eofVar.run(Boolean.FALSE);
            return;
        }
        dl dlVar = j5kVar2.c;
        yz yzVarD = bzVar.d(new m43(dlVar, dlVar.c, 0, list));
        if (yzVarD == null) {
            zxe zxeVar = new zxe(i5kVar, eofVar);
            dl dlVar2 = j5kVar2.c;
            bzVar.e(zxeVar, new m43(dlVar2, dlVar2.c, 0, list));
            return;
        }
        txi txiVar = new txi(i5kVar, (byte) 16);
        mq mqVar = (mq) j5kVar.b.pollFirst();
        if (mqVar != null ? j5kVar.a(yzVarD, mqVar, txiVar) : false) {
            eofVar.run(Boolean.TRUE);
        } else {
            yzVarD.b();
            eofVar.run(Boolean.FALSE);
        }
    }

    public final void j(boolean z) {
        int i;
        if (this.a != z) {
            this.a = z;
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                    ArrayList arrayList2 = (ArrayList) entry.getValue();
                    if (!arrayList2.isEmpty() && ((HashSet) this.c).add((String) entry.getKey())) {
                        arrayList.add((i5k) arrayList2.remove(0));
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    i((i5k) obj);
                }
            }
            bi biVar = (bi) this.d;
            boolean z2 = this.a;
            wy wyVar = (wy) biVar.b;
            uwh uwhVar = wyVar.c;
            int i3 = uwhVar.e;
            if (z2) {
                i = i3 + 1;
                uwhVar.e = i;
            } else {
                i = i3 - 1;
                uwhVar.e = i;
            }
            if (i < 0) {
                uwhVar.e = 0;
            }
            uwhVar.c();
            if (z2) {
                ux uxVar = wyVar.g;
                if (uxVar.i) {
                    return;
                }
                uxVar.i = true;
                i3j i3jVar = uxVar.f;
                if (i3jVar != null) {
                    uxVar.a(i3jVar.z());
                }
            }
        }
    }

    public final void k(int i, int i2) {
        re5 re5Var = (re5) this.c;
        ViewGroup.LayoutParams layoutParams = re5Var.getRoot().getLayoutParams();
        if (i == re5Var.getRoot().getLayoutParams().width && i2 == re5Var.getRoot().getLayoutParams().height) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        re5Var.getRoot().setLayoutParams(layoutParams);
    }

    public final void l(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            if (this.a) {
                ((ArrayDeque) this.c).add(new wup(runnable, executor));
            } else {
                this.a = true;
                n(runnable, executor);
            }
        }
    }

    public final void m() {
        synchronized (this.b) {
            if (((ArrayDeque) this.c).isEmpty()) {
                this.a = false;
                return;
            }
            wup wupVar = (wup) ((ArrayDeque) this.c).remove();
            n(wupVar.b, wupVar.a);
        }
    }

    public final void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(new ypp(this, runnable, (byte) 7));
        } catch (RejectedExecutionException unused) {
            m();
        }
    }

    public final hyl track(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        en8 en8Var = (en8) this.b;
        if (i2 != 3) {
            this.a = true;
            return en8Var.track(i, i2);
        }
        wnk wnkVar = (wnk) sparseArray.get(i);
        if (wnkVar != null) {
            return wnkVar;
        }
        wnk wnkVar2 = new wnk(en8Var.track(i, i2), (tnk) this.c);
        sparseArray.put(i, wnkVar2);
        return wnkVar2;
    }
}
