package defpackage;

import J.N;
import android.content.Context;
import android.os.SystemClock;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class dxk extends lim implements ywk {
    public final Context a;
    public final k6l c;
    public final zwk d;
    public final db e;
    public final i3j f;
    public final x5f g;
    public final umi h;
    public List j;
    public long k;
    public String l;
    public q3i m;
    public final bxk b = new bxk((Object) this, (byte) 0);
    public boolean i = true;

    /* JADX WARN: Multi-variable type inference failed */
    public dxk(BrowserActivity browserActivity, k6l k6lVar, zwk zwkVar, db dbVar, x5f x5fVar, umi umiVar) {
        this.a = browserActivity.getApplicationContext();
        this.c = k6lVar;
        this.d = zwkVar;
        this.e = dbVar;
        i3j i3jVar = new i3j();
        i3jVar.d = this;
        i3jVar.a = new ArrayList();
        i3jVar.b = new cxk(i3jVar);
        i3jVar.c = new qz(i3jVar, (byte) 27);
        this.f = i3jVar;
        k6lVar.F((cxk) i3jVar.b);
        k6lVar.b((qz) i3jVar.c);
        this.g = x5fVar;
        this.h = umiVar;
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        if (i == 0 || i == 3 || i == 4 || i == 5 || i == 6) {
            return;
        }
        this.k = SystemClock.uptimeMillis();
        if (this.i) {
            return;
        }
        T();
    }

    public final void R() {
        if (!this.i) {
            N.MVJG3NBv();
            g7f g7fVar = new g7f(this.d.a);
            while (g7fVar.hasNext()) {
                ((ywk) g7fVar.next()).g();
            }
            return;
        }
        List arrayList = this.j;
        if (arrayList == null) {
            arrayList = new ArrayList();
        } else {
            arrayList.clear();
        }
        arrayList.add("");
        this.j = arrayList;
    }

    public final void S(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (((String) list.get(0)).isEmpty()) {
            R();
            return;
        }
        if (!this.i) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                N.MOG3xMtV((String) it.next());
            }
            g7f g7fVar = new g7f(this.d.a);
            while (g7fVar.hasNext()) {
                ((ywk) g7fVar.next()).g();
            }
            return;
        }
        List list2 = this.j;
        if (list2 != null && !list2.isEmpty() && ((String) list2.get(0)).isEmpty()) {
            list = list2;
        } else if (list2 != null) {
            list2.addAll(list);
            list = list2;
        }
        this.j = list;
    }

    public final void T() {
        if (this.m == null) {
            this.m = new q3i(this, (byte) 1);
            String[] strArr = OperaApplication.K;
            e59 e59VarQ = ((OperaApplication) this.a.getApplicationContext()).q();
            q3i q3iVar = this.m;
            HashMap map = e59VarQ.a;
            d59 d59Var = d59.c;
            ((c59) map.get(d59Var)).i.b(q3iVar);
            this.m.a(e59VarQ.b(d59Var));
            e59VarQ.c(d59Var, true);
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.d.F(this);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        if (this.m != null) {
            String[] strArr = OperaApplication.K;
            e59 e59VarQ = ((OperaApplication) this.a.getApplicationContext()).q();
            ((c59) e59VarQ.a.get(d59.c)).i.c(this.m);
            this.m = null;
        }
        this.d.H(this);
        i3j i3jVar = this.f;
        dxk dxkVar = (dxk) i3jVar.d;
        dxkVar.c.v((qz) i3jVar.c);
        dxkVar.c.H((cxk) i3jVar.b);
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.i = true;
        synchronized (lcp.n) {
            lcp.o = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0087 A[Catch: all -> 0x009a, TryCatch #3 {, blocks: (B:14:0x002c, B:18:0x0034, B:20:0x0038, B:42:0x0079, B:48:0x0087, B:49:0x008f, B:44:0x007e, B:45:0x0081, B:46:0x0082, B:50:0x0096), top: B:60:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[Catch: all -> 0x009a, TryCatch #3 {, blocks: (B:14:0x002c, B:18:0x0034, B:20:0x0038, B:42:0x0079, B:48:0x0087, B:49:0x008f, B:44:0x007e, B:45:0x0081, B:46:0x0082, B:50:0x0096), top: B:60:0x002c }] */
    @Override // defpackage.as6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume(ndc r11) {
        /*
            r10 = this;
            r11 = 0
            r10.i = r11
            zwk r0 = r10.d
            r0.getClass()
            boolean r0 = defpackage.zwk.f()
            if (r0 == 0) goto L11
            r10.T()
        L11:
            java.util.List r0 = r10.j
            r1 = 0
            r10.j = r1
            if (r0 == 0) goto L21
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L21
            r10.S(r0)
        L21:
            boolean r0 = r10.i
            if (r0 != 0) goto L9c
            android.content.Context r0 = r10.a
            bxk r10 = r10.b
            java.lang.Object r2 = lcp.n
            monitor-enter(r2)
            bxk r3 = lcp.o     // Catch: java.lang.Throwable -> L9a
            r4 = 1
            if (r3 != 0) goto L33
            r3 = r4
            goto L34
        L33:
            r3 = r11
        L34:
            lcp.o = r10     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L96
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = ".syncpush"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7d java.io.FileNotFoundException -> L82
            java.io.File r7 = r0.getFileStreamPath(r5)     // Catch: java.lang.Throwable -> L7d java.io.FileNotFoundException -> L82
            java.lang.String r8 = "rw"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L7d java.io.FileNotFoundException -> L82
            r1 = r11
            r7 = r1
        L4c:
            int r8 = r6.read()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L74
            r9 = -1
            if (r8 != r9) goto L56
            r4 = r11
            r11 = r1
            goto L64
        L56:
            if (r8 != 0) goto L5a
            r1 = r4
            goto L4c
        L5a:
            java.lang.String r8 = r6.readUTF()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L74
            r3.add(r8)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L74
            r7 = r4
            goto L4c
        L63:
            r11 = r4
        L64:
            if (r11 == 0) goto L68
            if (r4 == 0) goto L6a
        L68:
            if (r7 == 0) goto L79
        L6a:
            r7 = 0
            r6.setLength(r7)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L74
            goto L79
        L70:
            r0.deleteFile(r5)     // Catch: java.lang.Throwable -> L74 java.io.FileNotFoundException -> L77
            goto L79
        L74:
            r10 = move-exception
            r1 = r6
            goto L7e
        L77:
            r1 = r6
            goto L82
        L79:
            xvg.l(r6)     // Catch: java.lang.Throwable -> L9a
            goto L85
        L7d:
            r10 = move-exception
        L7e:
            xvg.l(r1)     // Catch: java.lang.Throwable -> L9a
            throw r10     // Catch: java.lang.Throwable -> L9a
        L82:
            xvg.l(r1)     // Catch: java.lang.Throwable -> L9a
        L85:
            if (r11 == 0) goto L8f
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L9a
            dxk r10 = (defpackage.dxk) r10     // Catch: java.lang.Throwable -> L9a
            r10.R()     // Catch: java.lang.Throwable -> L9a
            goto L96
        L8f:
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L9a
            dxk r10 = (defpackage.dxk) r10     // Catch: java.lang.Throwable -> L9a
            r10.S(r3)     // Catch: java.lang.Throwable -> L9a
        L96:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L98:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9a
            throw r10
        L9a:
            r10 = move-exception
            goto L98
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxk.onResume(ndc):void");
    }
}
