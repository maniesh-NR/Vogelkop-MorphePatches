package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class ylh implements xxa {
    public static final /* synthetic */ int e = 0;
    public final wlh a;
    public final pjn b;
    public final ke5 c;
    public volatile /* synthetic */ int d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(ylh.class, "d");
    }

    public ylh(wlh wlhVar) {
        this.a = wlhVar;
        byte b = 2;
        sgb.b(e.a(zch.a(), new vx5(psp.b, (byte) 2)));
        s14 s14Var = new s14(this);
        pjn pjnVar = new pjn(this, (byte) 8);
        this.b = pjnVar;
        ke5 ke5Var = wlhVar.f;
        ke5Var.getClass();
        wjh wjhVar = new wjh(ke5Var);
        ArrayList arrayList = (ArrayList) wjhVar.b;
        ArrayList arrayList2 = (ArrayList) wjhVar.e;
        ArrayList arrayList3 = (ArrayList) wjhVar.d;
        ArrayList arrayList4 = (ArrayList) wjhVar.f;
        zya zyaVar = wlhVar.b;
        Object obj = zyaVar.d.a.get(lcp.i);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new kof((byte) 27));
            arrayList4.add(new kof((byte) 28));
        }
        wjhVar.a(new pe6((byte) 1), uqh.a(Uri.class));
        wjhVar.a(new pe6((byte) 4), uqh.a(Integer.class));
        arrayList3.add(new Pair(new ea1((byte) 0), uqh.a(apm.class)));
        wjhVar.b(new cc2((byte) 0), uqh.a(apm.class));
        wjhVar.b(new cc2((byte) 4), uqh.a(apm.class));
        wjhVar.b(new cc2((byte) 9), uqh.a(apm.class));
        wjhVar.b(new cc2((byte) 6), uqh.a(Drawable.class));
        xm5 xm5Var = yxa.a;
        Object obj2 = zyaVar.d.a.get(yxa.a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i = w0j.a;
        v0j v0jVar = new v0j(iIntValue);
        Object obj3 = zyaVar.d.a.get(yxa.c);
        boolean zBooleanValue = ((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue();
        Object obj4 = ih8.a;
        if (zBooleanValue) {
            Object obj5 = zyaVar.d.a.get(yxa.b);
            if (((ih8) (obj5 == null ? obj4 : obj5)).equals(obj4)) {
                arrayList4.add(new je5(new ebk(v0jVar), (byte) 0));
            }
        }
        Object obj6 = zyaVar.d.a.get(yxa.b);
        arrayList4.add(new je5(new hg3(v0jVar, (ih8) (obj6 != null ? obj6 : obj4)), (byte) 0));
        wjhVar.a(new pe6((byte) 2), uqh.a(File.class));
        wjhVar.b(new cc2((byte) 8), uqh.a(apm.class));
        wjhVar.b(new cc2((byte) 3), uqh.a(ByteBuffer.class));
        wjhVar.a(new pe6((byte) 5), uqh.a(String.class));
        wjhVar.a(new pe6((byte) 3), uqh.a(w6g.class));
        arrayList3.add(new Pair(new ea1((byte) 1), uqh.a(apm.class)));
        arrayList3.add(new Pair(new ea1((byte) 2), uqh.a(apm.class)));
        wjhVar.b(new cc2((byte) 7), uqh.a(apm.class));
        wjhVar.b(new cc2(b), uqh.a(byte[].class));
        wjhVar.b(new cc2((byte) 5), uqh.a(apm.class));
        wjhVar.b(new cc2((byte) 1), uqh.a(Bitmap.class));
        arrayList.add(new n38(this, s14Var, pjnVar));
        this.c = new ke5(zi4.c0(arrayList), zi4.c0((ArrayList) wjhVar.c), zi4.c0(arrayList3), zi4.c0(arrayList2), zi4.c0(arrayList4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        if (r4.b(r8) != r9) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ce A[Catch: all -> 0x01e2, TRY_LEAVE, TryCatch #1 {all -> 0x01e2, blocks: (B:106:0x01ca, B:108:0x01ce, B:111:0x01db, B:112:0x01e1), top: B:117:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01db A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #1 {all -> 0x01e2, blocks: (B:106:0x01ca, B:108:0x01ce, B:111:0x01db, B:112:0x01e1), top: B:117:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:27:0x0065, B:70:0x0115, B:72:0x011c, B:74:0x0137, B:77:0x013e, B:78:0x0146), top: B:123:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:15:0x0038, B:85:0x018a, B:87:0x0190, B:88:0x019b, B:90:0x019f, B:93:0x01ab, B:94:0x01b0), top: B:116:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:15:0x0038, B:85:0x018a, B:87:0x0190, B:88:0x019b, B:90:0x019f, B:93:0x01ab, B:94:0x01b0), top: B:116:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bza r16, int r17, nt5 r18) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylh.a(bza, int, nt5):java.lang.Object");
    }

    public final Object b(bza bzaVar, nt5 nt5Var) {
        yqa yqaVar = bzaVar.c;
        return ((bzaVar.l instanceof emh) || ((tcc) xf8.J(bzaVar, eza.e)) != null) ? sgb.q(new mz9(this, bzaVar, null, (byte) 18), nt5Var) : a(bzaVar, 1, nt5Var);
    }

    public final amh c() {
        return (amh) this.a.d.getValue();
    }

    public final void d(l68 l68Var, yqa yqaVar, y55 y55Var) {
        bza bzaVar = l68Var.b;
        y55Var.getClass();
        bzaVar.getClass();
    }
}
