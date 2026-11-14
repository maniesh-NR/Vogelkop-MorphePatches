package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jh implements scc, sog {
    public boolean a;
    public boolean b;
    public Object c;

    public jh(byte b) {
        switch (b) {
            case 6:
                this.c = new Object();
                break;
            default:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            a32 a32Var = (a32) this.c;
            if (a32Var != null) {
                try {
                    bl6 bl6Var = (bl6) a32Var.b;
                    y2m y2mVar = (y2m) a32Var.c;
                    Runnable runnable = (Runnable) a32Var.d;
                    if (bl6Var == null) {
                        y2mVar.cancel();
                        runnable.run();
                    } else {
                        bl6Var.run();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }

    public final tog b(tog togVar) {
        nq7 nq7Var = (nq7) this.c;
        yzm yzmVar = togVar instanceof yzm ? (yzm) togVar : null;
        if (yzmVar == null) {
            yzmVar = new yzm();
            yzmVar.a = false;
            yzmVar.b = false;
            yzmVar.c = false;
        }
        if (!yzmVar.a) {
            if (!yzmVar.b) {
                if (this.a || nq7Var.o()) {
                    yzmVar.b = true;
                }
                yzmVar.a = true;
                return yzmVar;
            }
            if (this.b && !yzmVar.c) {
                if (nq7Var.p()) {
                    yzmVar.c = true;
                }
                yzmVar.a = true;
                return yzmVar;
            }
        }
        return yzmVar;
    }

    public final void c() {
        this.b = true;
        ArrayList arrayListY = rm5.y((Set) this.c);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((kdc) obj).onDestroy();
        }
    }

    @Override // defpackage.scc
    public final void d(kdc kdcVar) {
        ((Set) this.c).add(kdcVar);
        if (this.b) {
            kdcVar.onDestroy();
        } else if (this.a) {
            kdcVar.onStart();
        } else {
            kdcVar.onStop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.text.Editable r12, java.lang.Runnable r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c
            boolean r1 = r11.b
            r2 = 0
            r11.a = r2
            r11.b = r2
            int r11 = r12.length()
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            java.lang.Object[] r11 = r12.getSpans(r2, r11, r3)
            android.text.style.CharacterStyle[] r11 = (android.text.style.CharacterStyle[]) r11
            int r3 = r11.length
            r4 = r2
        L17:
            if (r4 >= r3) goto L21
            r5 = r11[r4]
            r12.removeSpan(r5)
            int r4 = r4 + 1
            goto L17
        L21:
            int r6 = r12.getSpanStart(r0)
            int r7 = r12.getSpanEnd(r0)
            if (r6 == r7) goto L68
            java.lang.CharSequence r11 = r12.subSequence(r6, r7)
            if (r1 == 0) goto L4b
            char r1 = r11.charAt(r2)
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto L4b
            int r1 = r11.length()
            r2 = 1
            if (r1 <= r2) goto L4b
            int r1 = r11.length()
            java.lang.CharSequence r1 = r11.subSequence(r2, r1)
            goto L4c
        L4b:
            r1 = r11
        L4c:
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = mdb.h(r1)
            int r11 = r11.length()
            int r1 = r8.length()
            if (r11 == r1) goto L68
            r9 = 0
            int r10 = r8.length()
            r5 = r12
            r5.replace(r6, r7, r8, r9, r10)
            goto L69
        L68:
            r5 = r12
        L69:
            r5.removeSpan(r0)
            r13.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh.e(android.text.Editable, java.lang.Runnable):void");
    }

    @Override // defpackage.scc
    public final void f(kdc kdcVar) {
        ((Set) this.c).remove(kdcVar);
    }

    public final void g() {
        this.a = true;
        ArrayList arrayListY = rm5.y((Set) this.c);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((kdc) obj).onStart();
        }
    }

    public final void h() {
        int i = 0;
        this.a = false;
        ArrayList arrayListY = rm5.y((Set) this.c);
        int size = arrayListY.size();
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((kdc) obj).onStop();
        }
    }

    public final void i(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a) {
            if (!this.b) {
                this.b = (i3 == 1 && i2 == 0) ? Character.isSpaceChar(charSequence.charAt(i)) : false;
            }
            Editable editable = (Editable) charSequence;
            Object obj = this.c;
            int spanStart = editable.getSpanStart(obj);
            int spanEnd = editable.getSpanEnd(obj);
            int iMin = spanStart == -1 ? i : Math.min(spanStart, i);
            int iMax = i + i3;
            if (spanEnd != -1) {
                iMax = Math.max(spanEnd, iMax);
            }
            editable.removeSpan(obj);
            editable.setSpan(obj, iMin, iMax, 33);
        }
    }
}
